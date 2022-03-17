package com.nicolas.bahamut.to_docompose.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.nicolas.bahamut.to_docompose.ui.screens.list.ListScreen
import com.nicolas.bahamut.to_docompose.ui.viewmodels.SharedViewModel
import com.nicolas.bahamut.to_docompose.util.Constants.LIST_ARGUMENT_KEY
import com.nicolas.bahamut.to_docompose.util.Constants.LIST_SCREEN

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
){
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ){
        ListScreen(navigateToTaskScreen = navigateToTaskScreen, sharedViewModel = sharedViewModel)
    }
}