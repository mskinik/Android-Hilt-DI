package com.example.ui.composables.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.ui.composables.FirstScreen.FirstScreen
import com.example.ui.composables.SecondScreen.SecondScreen
const val EXAMPLE_ARG = "example_arg"
@Composable
fun NavigationHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.FirstScreen.route ) {
        composable(route = Screens.FirstScreen.route) {
            FirstScreen(navController)
        }
        composable(route = Screens.SecondScreen.route.plus("/{$EXAMPLE_ARG}"), arguments = listOf(
            navArgument(EXAMPLE_ARG) {
                type = NavType.StringType
            }
        )) {
            SecondScreen(navController)
        }
    }
}