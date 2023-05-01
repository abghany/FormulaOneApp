package com.gnacoding.formulaoneapp.presentation.screen.favorite

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.gnacoding.formulaoneapp.R
import com.gnacoding.formulaoneapp.domain.model.Driver
import com.gnacoding.formulaoneapp.presentation.ui.component.AppTopBar
import com.gnacoding.formulaoneapp.presentation.ui.component.DriverItem
import com.gnacoding.formulaoneapp.presentation.ui.component.EmptyContent
import com.gnacoding.formulaoneapp.presentation.ui.component.LoadingIndicator
import com.gnacoding.formulaoneapp.presentation.util.UiState

@Composable
fun FavoriteScreen(
    modifier: Modifier = Modifier,
    navigateToDetail: (Int?) -> Unit,
    viewModel: FavoriteViewModel = hiltViewModel()
) {
    viewModel.allFavoriteDrivers.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> LoadingIndicator()
            is UiState.Success -> FavoriteContent(
                favoriteDrivers = uiState.data,
                navigateToDetail = navigateToDetail,
                modifier = modifier
            )
            is UiState.Error -> {}
        }
    }
}

@Composable
fun FavoriteContent(
    favoriteDrivers: List<Driver>,
    navigateToDetail: (Int?) -> Unit,
    modifier: Modifier = Modifier
) {
    when (favoriteDrivers.isEmpty()) {
        true -> EmptyContent()
        false -> FavoriteList(
            drivers = favoriteDrivers,
            navigateToDetail = navigateToDetail,
            modifier = modifier
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoriteList(
    modifier: Modifier = Modifier,
    drivers: List<Driver>,
    navigateToDetail: (Int?) -> Unit,
) {
    Scaffold(
        topBar = {
            AppTopBar(title = stringResource(id = R.string.favorite))
        },
        modifier = modifier
    ) { innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Adaptive(160.dp),
            contentPadding = PaddingValues(8.dp),
            modifier = Modifier.padding(innerPadding)
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