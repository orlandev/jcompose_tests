package com.orlandev.jcompose_tests

sealed class JComponents(val componentName: String) {
    object ModalBottomSheetSample : JComponents(componentName = "ModalBottomSheetSample")
    object NavigationRails : JComponents(componentName = "NavigationRails")
    object SwipeToDismiss : JComponents(componentName = "SwipeToDismiss")
    object TextComponents : JComponents(componentName = "TextComponents")
    object ClickableListItems : JComponents(componentName = "ClickableListItems")
    object OneLineListItems : JComponents(componentName = "OneLineListItems")
    object TwoLineListItems : JComponents(componentName = "TwoLineListItems")
    object ThreeLineListItems : JComponents(componentName = "ThreeLineListItems")
    object OneLineRtlLtrListItems : JComponents(componentName = "OneLineRtlLtrListItems")
    object TwoLineRtlLtrListItems : JComponents(componentName = "TwoLineRtlLtrListItems")
    object ThreeLineRtlLtrListItems : JComponents(componentName = "ThreeLineRtlLtrListItems")
    object AlertDialogSample : JComponents(componentName = "AlertDialogSample")
    object CustomAlertDialogSample : JComponents(componentName = "CustomAlertDialogSample")

    companion object {
        fun toList() = listOf(
            JComponents.ModalBottomSheetSample,
            JComponents.NavigationRails,
            JComponents.SwipeToDismiss,
            JComponents.TextComponents,
            JComponents.ClickableListItems,
            JComponents.OneLineListItems,
            JComponents.TwoLineListItems,
            JComponents.ThreeLineListItems,
            JComponents.OneLineRtlLtrListItems,
            JComponents.TwoLineRtlLtrListItems,
            JComponents.ThreeLineRtlLtrListItems,
            JComponents.AlertDialogSample,
            JComponents.CustomAlertDialogSample,
        )
    }
}
