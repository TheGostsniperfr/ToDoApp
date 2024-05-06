package fr.thegostsniperfr.todoapp.navigation

import androidx.navigation.NavHostController
import fr.thegostsniperfr.todoapp.utils.Action
import fr.thegostsniperfr.todoapp.utils.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true } // Unload component
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/${taskId}") // Keep load task list
    }
}