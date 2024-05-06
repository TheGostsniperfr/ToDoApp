package fr.thegostsniperfr.todoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import fr.thegostsniperfr.todoapp.navigation.destination.listComposable
import fr.thegostsniperfr.todoapp.navigation.destination.taskComposable
import fr.thegostsniperfr.todoapp.utils.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController,
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )

        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}