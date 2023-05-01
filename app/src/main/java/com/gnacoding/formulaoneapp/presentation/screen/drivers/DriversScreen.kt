package com.gnacoding.formulaoneapp.presentation.screen.drivers

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.gnacoding.formulaoneapp.data.data_source.DriverDataSource
import com.gnacoding.formulaoneapp.domain.model.Driver
import com.gnacoding.formulaoneapp.presentation.ui.component.DriverItem
import com.gnacoding.formulaoneapp.presentation.ui.component.EmptyContent
import com.gnacoding.formulaoneapp.presentation.ui.component.LoadingIndicator
import com.gnacoding.formulaoneapp.presentation.ui.component.SearchBar
import com.gnacoding.formulaoneapp.presentation.ui.theme.FormulaOneAppTheme
import com.gnacoding.formulaoneapp.presentation.util.UiState

@Composable
fun DriversScreen(
    modifier: Modifier = Modifier,
    viewModel: DriversViewModel = hiltViewModel(),
    navigateToDetail: (Int?) -> Unit,
) {
    val driverState by viewModel.driverState

    viewModel.allDrivers.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> LoadingIndicator()
            is UiState.Success -> DriversContent(
                drivers = uiState.data,
                query = driverState.query,
                onQueryChange = viewModel::onQueryChange,
                navigateToDetail = navigateToDetail,
                modifier = modifier
            )
            is UiState.Error -> EmptyContent()
        }
    }
}

@Composable
fun DriversContent(
    modifier: Modifier = Modifier,
    drivers: List<Driver>,
    query: String,
    onQueryChange: (String) -> Unit,
    navigateToDetail: (Int?) -> Unit,
) {
    Column {
        SearchBar(query = query, onQueryChange = onQueryChange)
        LazyVerticalGrid(
            columns = GridCells.Adaptive(160.dp),
            contentPadding = PaddingValues(8.dp),
            modifier = modifier
        ) {
            items(drivers) { driver ->
                DriverItem(
                    name = driver.name,
                    raceNumber = driver.raceNumber,
                    nationality = driver.nationality,
                    profilePicture = driver.profilePicture,
                    teamConstructor = driver.teamConstructor,
                    modifier = Modifier.clickable {
                        navigateToDetail(driver.id)
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun DriversContentLightPreview() {
    FormulaOneAppTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            DriversContent(
                drivers = DriverDataSource.dummyDrivers,
                query = "",
                onQueryChange = {},
                navigateToDetail = {}
            )
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DriversContentNightPreview() {
    FormulaOneAppTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            DriversContent(
                drivers = DriverDataSource.dummyDrivers,
                query = "",
                onQueryChange = {},
                navigateToDetail = {}
            )
        }
    }
}