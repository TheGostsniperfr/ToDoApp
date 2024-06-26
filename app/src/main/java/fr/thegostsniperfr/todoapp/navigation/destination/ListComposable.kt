package fr.thegostsniperfr.todoapp.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import fr.thegostsniperfr.todoapp.ui.screens.list.ListScreen
import fr.thegostsniperfr.todoapp.ui.viewmodels.SharedViewModel
import fr.thegostsniperfr.todoapp.utils.Constants.LIST_ARGUMENT_KEY
import fr.thegostsniperfr.todoapp.utils.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel,
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {
        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel
        )
    }
}