package com.orlandev.jcompose_tests.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.orlandev.jcompose_tests.JComponents
import com.orlandev.jcompose_tests.navigation.NavigationRoute


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    Scaffold(bottomBar = {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,
            text = "Jetpack Compose Version:  1.2.0-alpha02 "
        )
    }, topBar = {
        TopAppBar(
            title = { Text(text = "Jetpack Components Tests") },
            modifier = Modifier.fillMaxWidth()
        )
    }) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(JComponents.toList().map { it.componentName }) { currentName ->
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