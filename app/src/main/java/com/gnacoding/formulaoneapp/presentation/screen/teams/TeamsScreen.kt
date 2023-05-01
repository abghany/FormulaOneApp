package com.gnacoding.formulaoneapp.presentation.screen.teams

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.gnacoding.formulaoneapp.R
import com.gnacoding.formulaoneapp.data.data_source.TeamDataSource
import com.gnacoding.formulaoneapp.domain.model.Team
import com.gnacoding.formulaoneapp.presentation.ui.component.AppTopBar
import com.gnacoding.formulaoneapp.presentation.ui.component.TeamItem
import com.gnacoding.formulaoneapp.presentation.ui.theme.FormulaOneAppTheme
import com.gnacoding.formulaoneapp.presentation.util.UiState

@Composable
fun TeamsScreen(
    modifier: Modifier = Modifier,
    viewModel: TeamsViewModel = hiltViewModel(),
    navigateToDetail: (Int) -> Unit,
) {
    viewModel.allTeams.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> viewModel.getAllTeams()
            is UiState.Success -> TeamsContent(
                teams = uiState.data,
                navigateToDetail = navigateToDetail,
                modifier = modifier
            )

            is UiState.Error -> {}
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TeamsContent(
    modifier: Modifier = Modifier,
    teams: List<Team>,
    navigateToDetail: (Int) -> Unit,
) {
    Scaffold(
        topBar = {
            AppTopBar(title = stringResource(id = R.string.teams))
        },
        modifier = modifier
    ) { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            items(teams) { team ->
                TeamItem(
                    name = team.name,
                    teamCar = team.teamCar,
                    teamLogo = team.teamLogo,
                    modifier = Modifier.clickable {
                        navigateToDetail(team.id)
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun TeamsContentLightPreview() {
    FormulaOneAppTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            TeamsContent(
                teams = TeamDataSource.dummyTeams,
                navigateToDetail = {}
            )
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun TeamsContentNightPreview() {
    FormulaOneAppTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            TeamsContent(
                teams = TeamDataSource.dummyTeams,
                navigateToDetail = {}
            )
        }
    }
}