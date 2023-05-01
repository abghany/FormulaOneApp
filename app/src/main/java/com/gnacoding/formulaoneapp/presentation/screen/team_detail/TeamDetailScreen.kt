package com.gnacoding.formulaoneapp.presentation.screen.team_detail

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.gnacoding.formulaoneapp.R
import com.gnacoding.formulaoneapp.domain.model.Team
import com.gnacoding.formulaoneapp.presentation.ui.component.TextDetail
import com.gnacoding.formulaoneapp.presentation.ui.theme.FormulaOneAppTheme
import com.gnacoding.formulaoneapp.presentation.ui.theme.Typography
import com.gnacoding.formulaoneapp.presentation.util.UiState

@Composable
fun TeamDetailScreen(
    teamId: Int,
    viewModel: TeamDetailViewModel = hiltViewModel(),
    navigateBack: () -> Unit
) {
    viewModel.team.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> viewModel.getTeamById(teamId)
            is UiState.Success -> TeamDetailContent(
                team = uiState.data,
                onBackClicked = navigateBack
            )
            is UiState.Error -> {}
        }
    }
}

@Composable
fun TeamDetailContent(
    team: Team,
    onBackClicked: () -> Unit = {}
) {
    val (
        id, teamCar, teamLogo, name, fullTeamName, base, teamChief, chassis, powerUnit,
        totalWorldChampionship, inProfile
    ) = team

    Box(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(id = teamLogo),
                contentDescription = name,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(220.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Column(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                TextDetail(title = "Full Team Name", detail = fullTeamName)
                Spacer(modifier = Modifier.height(8.dp))
                TextDetail(title = "Base", detail = base)
                Spacer(modifier = Modifier.height(8.dp))
                TextDetail(title = "Team Chief", detail = teamChief)
                Spacer(modifier = Modifier.height(8.dp))
                TextDetail(title = "Chassis", detail = chassis)
                Spacer(modifier = Modifier.height(8.dp))
                TextDetail(title = "Power Unit", detail = powerUnit)
                Spacer(modifier = Modifier.height(8.dp))
                TextDetail(title = "World Championships", detail = totalWorldChampionship)
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "In Profile",
                    style = Typography.titleMedium
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = inProfile,
                    style = Typography.bodyMedium,
                    modifier = Modifier.alpha(0.8f)
                )
            }
        }
        IconButton(
            onClick = onBackClicked,
            modifier = Modifier
                .padding(start = 8.dp, top = 8.dp)
                .align(Alignment.TopStart)
                .clip(CircleShape)
                .size(40.dp)
                .testTag("back_button")
                .background(MaterialTheme.colorScheme.background.copy(alpha = 0.6f))
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = null
            )
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun TeamDetailContentLightPreview() {
    FormulaOneAppTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            TeamDetailContent(
                team = Team(
                    id = 1,
                    teamCar = R.drawable.mercedes_car,
                    teamLogo = R.drawable.mercedes_logo,
                    name = "Mercedes-AMG",
                    fullTeamName = "Mercedes-AMG PETRONAS F1 Team",
                    base = "Brackley, United Kingdom",
                    teamChief = "Toto Wolf",
                    chassis = "W14",
                    powerUnit = "Mercedes",
                    totalWorldChampionship = "8",
                    inProfile = "Mercedes’ modern F1 revival started with the creation of a works squad for 2010 - the platform for a meteoric rise up the Grand Prix order. The team generated huge excitement from the off with the sensational return of Michael Schumacher, but headlines soon followed on track: three podiums in their debut season, all via Nico Rosberg - who then claimed a breakthrough pole/victory double at China in 2012. The following season he was paired with Lewis Hamilton, the duo going on to stage some epic title battles as the Silver Arrows swept all before them to become one of the most dominant forces of the modern F1 era. And with Hamilton now partnered by the up-and-coming George Russell, Mercedes remain very much the team that everyone wants to beat."
                )
            )
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun TeamDetailContentNightPreview() {
    FormulaOneAppTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            TeamDetailContent(
                team = Team(
                    id = 1,
                    teamCar = R.drawable.mercedes_car,
                    teamLogo = R.drawable.mercedes_logo,
                    name = "Mercedes-AMG",
                    fullTeamName = "Mercedes-AMG PETRONAS F1 Team",
                    base = "Brackley, United Kingdom",
                    teamChief = "Toto Wolf",
                    chassis = "W14",
                    powerUnit = "Mercedes",
                    totalWorldChampionship = "8",
                    inProfile = "Mercedes’ modern F1 revival started with the creation of a works squad for 2010 - the platform for a meteoric rise up the Grand Prix order. The team generated huge excitement from the off with the sensational return of Michael Schumacher, but headlines soon followed on track: three podiums in their debut season, all via Nico Rosberg - who then claimed a breakthrough pole/victory double at China in 2012. The following season he was paired with Lewis Hamilton, the duo going on to stage some epic title battles as the Silver Arrows swept all before them to become one of the most dominant forces of the modern F1 era. And with Hamilton now partnered by the up-and-coming George Russell, Mercedes remain very much the team that everyone wants to beat."
                )
            )
        }
    }
}