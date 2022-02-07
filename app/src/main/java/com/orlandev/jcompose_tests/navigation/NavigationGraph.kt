package com.orlandev.jcompose_tests.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.orlandev.jcompose_tests.extensions.toJCompnents
import com.orlandev.jcompose_tests.ui.screens.ComposablesDetailsScreen
import com.orlandev.jcompose_tests.ui.screens.HomeScreen
import com.orlandev.jcompose_tests.utils.listComponentsName

const val COMPONENT_NAME = "componentName"

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.HomeScreen.route
    ) {

        composable(NavigationRoute.HomeScreen.route) {

            HomeScreen(navController)

        }

        composable(NavigationRoute.ComposablesDetailsScreen.route + "/{$COMPONENT_NAME}") { navControlleArgs ->
            ComposablesDetailsScreen(
                navController = navController, navControlleArgs.arguments?.getString(
                    COMPONENT_NAME
                )?.toJCompnents(listJComponents = listComponentsName)
            )
        }
    }
}

