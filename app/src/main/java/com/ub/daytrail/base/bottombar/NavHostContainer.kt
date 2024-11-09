package com.ub.daytrail.base.bottombar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ub.daytrail.R
import com.ub.daytrail.features.more.MoreScreen
import com.ub.daytrail.features.notes.NotesScreen
import com.ub.daytrail.features.reminders.RemindersScreen
import com.ub.daytrail.features.tasks.TasksScreen

@Composable
fun NavHostContainer(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController,
        startDestination = BottomBarTab.Tasks.route,
        modifier = modifier
    ) {
        composable(BottomBarTab.Tasks.route) { TasksScreen() }
        composable(BottomBarTab.Reminders.route) { RemindersScreen() }
        composable(BottomBarTab.Notes.route) { NotesScreen() }
        composable(BottomBarTab.More.route) { MoreScreen() }
    }
}