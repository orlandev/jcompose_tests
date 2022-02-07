package com.orlandev.jcompose_tests

import android.os.Bundle
import android.os.strictmode.NonSdkApiUsedViolation
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.orlandev.jcompose_tests.components.*
import com.orlandev.jcompose_tests.ui.theme.Jcompose_testsTheme
import kotlinx.coroutines.launch

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jcompose_testsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //TODO(  ADD NAVIGATION BETWEEN SCREEN TO SHOW COMPONENTS)
                    //ModalBottomSheetSample()
                   // SwipeToDismissListItems(items = items)
                    LazyColumn{
                        item {

                            NavigationRailSample()
                        }
                        item {
                            NavigationRailWithOnlySelectedLabelsSample()
                        }
                        item {
                            NavigationRailBottomAlignSample()
                        }
                        item {
                            CompactNavigationRailSample()
                        }
                    }
                }
            }
        }
    }
}



