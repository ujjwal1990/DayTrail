package com.ub.daytrail.base.bottombar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.outlined.NoteAlt
import androidx.compose.material.icons.outlined.Task
import androidx.compose.ui.graphics.vector.ImageVector
import com.ub.daytrail.R
import com.ub.daytrail.base.appdata.ScreenRoutes

sealed class BottomBarTab(val route: String, val icon: ImageVector, val labelResource: Int) {
    data object Tasks : BottomBarTab(ScreenRoutes.TASKS, Icons.Outlined.Task, R.string.tasks_tab)
    data object Reminders : BottomBarTab(ScreenRoutes.REMINDERS, Icons.Default.Alarm, R.string.reminder_tab)
    data object Notes : BottomBarTab(ScreenRoutes.NOTES, Icons.Outlined.NoteAlt, R.string.notes_tab)
    data object More : BottomBarTab(ScreenRoutes.MORE, Icons.Default.MoreHoriz, R.string.more_tab)
}