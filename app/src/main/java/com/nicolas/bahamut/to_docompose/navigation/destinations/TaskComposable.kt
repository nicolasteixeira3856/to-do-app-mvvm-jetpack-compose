package com.nicolas.bahamut.to_docompose.navigation.destinations

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.nicolas.bahamut.to_docompose.ui.screens.task.TaskScreen
import com.nicolas.bahamut.to_docompose.util.Action
import com.nicolas.bahamut.to_docompose.util.Constants
import com.nicolas.bahamut.to_docompose.util.Constants.TASK_ARGUMENT_KEY

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = Constants.TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        Log.d("TaskComposable", taskId.toString())

        TaskScreen(navigateToListScreen = navigateToListScreen)
    }
}