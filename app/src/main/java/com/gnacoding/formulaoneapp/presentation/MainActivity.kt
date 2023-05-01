package com.gnacoding.formulaoneapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.gnacoding.formulaoneapp.presentation.navigation.Screen
import com.gnacoding.formulaoneapp.presentation.screen.driver_detail.DriverDetailScreen
import com.gnacoding.formulaoneapp.presentation.screen.drivers.DriversScreen
import com.gnacoding.formulaoneapp.presentation.screen.favorite.FavoriteScreen
import com.gnacoding.formulaoneapp.presentation.screen.profile.ProfileScreen
import com.gnacoding.formulaoneapp.presentation.screen.team_detail.TeamDetailScreen
import com.gnacoding.formulaoneapp.presentation.screen.teams.TeamsScreen
import com.gnacoding.formulaoneapp.presentation.ui.component.BottomBar
import com.gnacoding.formulaoneapp.presentation.ui.theme.FormulaOneAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            FormulaOneAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != Screen.DriverDetail.route && currentRoute != Screen.TeamDetail.route) {
                BottomBar(navController = navController, currentRoute = currentRoute)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Drivers.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Screen.Drivers.route) {
                DriversScreen(
                    navigateToDetail = { driverId ->
                        navController.navigate(Screen.DriverDetail.createRoute(driverId))
                    }
                )
            }
            composable(
                route = Screen.DriverDetail.route,
                arguments = listOf(
                    navArgument("driverId") { type = NavType.IntType }
                )
            ) {
                val driverId = it.arguments?.getInt("driverId") ?: 0
                DriverDetailScreen(
                    driverId = driverId,
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }
            composable(route = Screen.Teams.route) {
                TeamsScreen(
                    navigateToDetail = { teamId ->
                        navController.navigate(Screen.TeamDetail.createRoute(teamId))
                    }
                )
            }
            composable(
                route = Screen.TeamDetail.route,
                arguments = listOf(
                    navArgument("teamId") { type = NavType.IntType }
                )
            ) {
                val teamId = it.arguments?.getInt("teamId") ?: 0
                TeamDetailScreen(
                    teamId = teamId,
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }
            composable(route = Screen.Favorite.route) {
                FavoriteScreen(
                    navigateToDetail = { driverId ->
                        navController.navigate(Screen.DriverDetail.createRoute(driverId))
                    }
                )
            }
            composable(route = Screen.Profile.route) {
                ProfileScreen()
            }
        }
    }
}