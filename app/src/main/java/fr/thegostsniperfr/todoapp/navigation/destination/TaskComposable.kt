package fr.thegostsniperfr.todoapp.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import fr.thegostsniperfr.todoapp.utils.Action
import fr.thegostsniperfr.todoapp.utils.Constants.LIST_ARGUMENT_KEY
import fr.thegostsniperfr.todoapp.utils.Constants.LIST_SCREEN
import fr.thegostsniperfr.todoapp.utils.Constants.TASK_ARGUMENT_KEY
import fr.thegostsniperfr.todoapp.utils.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) {

    }
}