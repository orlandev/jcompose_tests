package com.orlandev.jcompose_tests.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.orlandev.jcompose_tests.navigation.NavigationRoute
import com.orlandev.jcompose_tests.utils.listComponentsName


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Jetpack Components Tests") },
            modifier = Modifier.fillMaxWidth()
        )
    }) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(listComponentsName.map { it.componentName }) { currentName ->
                ListItem(
                    modifier = Modifier.clickable {
                        navController.navigate(NavigationRoute.ComposablesDetailsScreen.route + "/$currentName")
                    },
                    trailing = {
                        Icon(
                            Icons.Default.KeyboardArrowRight,
                            contentDescription = null
                        )
                    },
                    text = { Text(text = currentName) },
                    secondaryText = { Text(text = "Click to see") }
                )
            }
        }
    }
}