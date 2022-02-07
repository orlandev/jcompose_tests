package com.orlandev.jcompose_tests.navigation

sealed class NavigationRoute(val route: String) {
    object HomeScreen : NavigationRoute(route = "home_screen")
    object ComposablesDetailsScreen : NavigationRoute(route = "composables_details")
}