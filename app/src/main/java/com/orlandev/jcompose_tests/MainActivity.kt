package com.orlandev.jcompose_tests

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.ProvideWindowInsets
import com.orlandev.jcompose_tests.navigation.NavigationGraph
import com.orlandev.jcompose_tests.ui.theme.Jcompose_testsTheme

class MainActivity : ComponentActivity() {

    private val items = listOf(
        "Cupcake",
        "Donut",
        "Eclair",
        "Froyo",
        "Gingerbread",
        "Honeycomb",
        "Ice cream sandwich",
        "Jelly bean",
        "KitKat",
        "Lollipop",
        "Marshmallow",
        "Nougat",
        "Oreo",
        "Pie"
    )

    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jcompose_testsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProvideWindowInsets {
                        NavigationGraph()
                    }
                }
            }
        }
    }
}



