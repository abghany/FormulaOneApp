package com.gnacoding.formulaoneapp.presentation.navigation

sealed class Screen(val route: String) {
    object Drivers : Screen(route = "drivers")
    object Teams : Screen(route = "teams")
    object Favorite : Screen(route = "favorite")
    object Profile : Screen(route = "profile")
    object DriverDetail : Screen(route = "drivers/{driverId}") {
        fun createRoute(driverId: Int?) = "drivers/$driverId"
    }
    object TeamDetail : Screen(route = "teams/{teamId}") {
        fun createRoute(teamId: Int) = "teams/$teamId"
    }
}
