package com.gnacoding.formulaoneapp.presentation.ui.component

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.gnacoding.formulaoneapp.R
import com.gnacoding.formulaoneapp.presentation.navigation.NavigationItem
import com.gnacoding.formulaoneapp.presentation.navigation.Screen
import com.gnacoding.formulaoneapp.presentation.ui.theme.FormulaOneAppTheme


@Composable
fun BottomBar(
    navController: NavHostController,
    currentRoute: String?,
) {
    val navigationItems = listOf(
        NavigationItem(
            title = "Drivers",
            icon = painterResource(id = R.drawable.ic_drivers),
            screen = Screen.Drivers,
            contentDescription = "drivers_page"
        ),
        NavigationItem(
            title = "Teams",
            icon = painterResource(id = R.drawable.ic_teams),
            screen = Screen.Teams,
            contentDescription = "teams_page"
        ),
        NavigationItem(
            title = "Favorite",
            icon = painterResource(id = R.drawable.ic_favorite),
            screen = Screen.Favorite,
            contentDescription = "favorite_page"
        ),
        NavigationItem(
            title = "Profile",
            icon = painterResource(id = R.drawable.ic_profile),
            screen = Screen.Profile,
            contentDescription = "about_page"
        )
    )

    NavigationBar {
        navigationItems.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(painter = item.icon, contentDescription = item.contentDescription)
                },
                label = { Text(text = item.title) },
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun BottomBarLightPreview() {
    val navController = rememberNavController()
    FormulaOneAppTheme {
        BottomBar(
            navController = navController,
            currentRoute = "Drivers"
        )
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun BottomBarNightPreview() {
    val navController = rememberNavController()
    FormulaOneAppTheme {
        BottomBar(
            navController = navController,
            currentRoute = "Drivers"
        )
    }
}