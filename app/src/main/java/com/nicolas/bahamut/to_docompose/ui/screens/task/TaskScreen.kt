package com.nicolas.bahamut.to_docompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.nicolas.bahamut.to_docompose.data.models.ToDoTask
import com.nicolas.bahamut.to_docompose.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = {}
    )
}