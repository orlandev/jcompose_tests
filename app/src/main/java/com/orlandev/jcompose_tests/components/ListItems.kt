package com.orlandev.jcompose_tests.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
@OptIn(ExperimentalMaterialApi::class)
fun OneLineListItems() {
    Column {
        ListItem(text = { Text("One line list item with no icon") })
        Divider()
        ListItem(
            text = { Text("One line list item with 24x24 icon") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("One line list item with 40x40 icon") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("One line list item with 56x56 icon") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(56.dp)
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("One line clickable list item") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(56.dp)
                )
            },
            modifier = Modifier.clickable { }
        )
        Divider()
        ListItem(
            text = { Text("One line list item with trailing icon") },
            trailing = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized Description"
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("One line list item") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            },
            trailing = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description"
                )
            }
        )
        Divider()
    }
}


@Composable
@OptIn(ExperimentalMaterialApi::class)
fun TwoLineListItems() {
    Column {
        ListItem(
            text = { Text("Two line list item") },
            secondaryText = { Text("Secondary text") }
        )
        Divider()
        ListItem(
            text = { Text("Two line list item") },
            overlineText = { Text("OVERLINE") }
        )
        Divider()
        ListItem(
            text = { Text("Two line list item with 24x24 icon") },
            secondaryText = { Text("Secondary text") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("Two line list item with 40x40 icon") },
            secondaryText = { Text("Secondary text") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("Two line list item with 40x40 icon") },
            secondaryText = { Text("Secondary text") },
            trailing = { Text("meta") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }
        )
        Divider()
    }
}

@Composable
@OptIn(ExperimentalMaterialApi::class)
fun ThreeLineListItems() {
    Column {
        ListItem(
            text = { Text("Three line list item") },
            secondaryText = {
                Text(
                    "This is a long secondary text for the current list item, " +
                            "displayed on two lines"
                )
            },
            singleLineSecondaryText = false,
            trailing = { Text("meta") }
        )
        Divider()
        ListItem(
            text = { Text("Three line list item") },
            overlineText = { Text("OVERLINE") },
            secondaryText = { Text("Secondary text") }
        )
        Divider()
        ListItem(
            text = { Text("Three line list item with 24x24 icon") },
            secondaryText = {
                Text(
                    "This is a long secondary text for the current list item " +
                            "displayed on two lines"
                )
            },
            singleLineSecondaryText = false,
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("Three line list item with trailing icon") },
            secondaryText = {
                Text(
                    "This is a long secondary text for the current list" +
                            " item, displayed on two lines"
                )
            },
            singleLineSecondaryText = false,
            trailing = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description"
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("Three line list item") },
            overlineText = { Text("OVERLINE") },
            secondaryText = { Text("Secondary text") },
            trailing = { Text("meta") }
        )
        Divider()
    }
}

// Demos for mixing RTL and LTR ListItems:
@Composable
@OptIn(ExperimentalMaterialApi::class)
fun OneLineRtlLtrListItems() {
    Column {
        ListItem(text = { Text("One line list item with no icon") })
        Divider()
        ListItem(
            text = { Text("פריט ברשימה אחת עם תמונה.") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("One line list item with 24x24 icon") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("عنصر قائمة واحد مع رمز زائدة") },
            trailing = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null
                )
            }
        )
        Divider()
    }
}

@Composable
@OptIn(ExperimentalMaterialApi::class)
fun TwoLineRtlLtrListItems() {
    Column {
        ListItem(
            text = { Text("Two line list item") },
            secondaryText = { Text("Secondary text") }
        )
        Divider()
        ListItem(
            text = { Text("بند قائمة من سطرين") },
            secondaryText = { Text("نص ثانوي") }
        )
        Divider()
        ListItem(
            modifier = Modifier.clickable { },
            text = { Text("Clickable") },
            secondaryText = { Text("Short item") }
        )
        Divider()
        ListItem(
            text = { Text("عنصر قائمة مكون من سطرين مع رمز") },
            overlineText = { Text("فوق الخط") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }
        )
        Divider()
        ListItem(
            text = { Text("بندان قابلان للنقر") },
            secondaryText = { Text("نص ثانوي") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            },
            modifier = Modifier.clickable { }
        )
        Divider()
    }
}

@Composable
@OptIn(ExperimentalMaterialApi::class)
fun ThreeLineRtlLtrListItems() {
    Column {
        ListItem(
            text = { Text("Three line list item") },
            overlineText = { Text("OVERLINE") },
            secondaryText = { Text("Secondary text") },
            trailing = { Text("meta") }
        )
        Divider()
        ListItem(
            text = { Text("ثلاثة عناصر قائمة بدون رمز") },
            secondaryText = {
                Text(
                    "هذا نص ثانوي طويل لعنصر القائمة الحالي ، معروض على سطرين. " +
                            "في لغات أخرى قد نحتاج إلى المزيد من النص"
                )
            },
            singleLineSecondaryText = false
        )
        Divider()
        ListItem(
            text = { Text("ثلاثة عناصر قائمة مع رمز") },
            overlineText = { Text("فوق الخط") },
            secondaryText = { Text("نص ثانوي") },
            icon = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }
        )
        Divider()
    }
}
