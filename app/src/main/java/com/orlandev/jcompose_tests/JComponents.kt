package com.orlandev.jcompose_tests

sealed class JComponents(val componentName: String){
    object ModalBottomSheetSample:JComponents(componentName = "ModalBottomSheetSample")
    object NavigationRails:JComponents(componentName = "NavigationRails")
    object SwipeToDismiss:JComponents(componentName = "SwipeToDismiss")
    object TextComponents:JComponents(componentName = "TextComponents")
}