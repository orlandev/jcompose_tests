package com.orlandev.jcompose_tests.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.orlandev.jcompose_tests.JComponents
import com.orlandev.jcompose_tests.components.ModalBottomSheetSample
import com.orlandev.jcompose_tests.components.NavigationRailSample
import com.orlandev.jcompose_tests.components.SwipeToDismissListItems
import com.orlandev.jcompose_tests.components.TextComponents
import com.orlandev.jcompose_tests.utils.listComponentsName

@Composable
fun ComposablesDetailsScreen(navController: NavHostController, component: JComponents?) {

    Scaffold(topBar = {
        TopAppBar(
            navigationIcon = {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = null)
                }
            },
            title = { Text(text = component?.componentName ?: " Component not found") },
            modifier = Modifier.fillMaxWidth()
        )

    }) {
        if (component != null)
            ShowComponent(component)
        else
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Component not implemented jet. !!SORRY!!")
            }
    }

}

@Composable
fun ShowComponent(componentId: JComponents) {

    when (componentId) {
        JComponents.ModalBottomSheetSample -> {
            ModalBottomSheetSample()
        }
        JComponents.NavigationRails -> {
            NavigationRailSample()
        }
        JComponents.SwipeToDismiss -> {
            SwipeToDismissListItems(listComponentsName.map { it.componentName })
        }
        JComponents.TextComponents -> {
            TextComponents()
        }
    }

}
