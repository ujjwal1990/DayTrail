package com.ub.daytrail.base

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Notes
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.Task
import androidx.compose.material.icons.outlined.MoreHoriz
import androidx.compose.ui.graphics.vector.ImageVector
import com.ub.daytrail.R

enum class DayTrailDestination(
    @StringRes val labelRes: Int,
    val icon: ImageVector,
) {
    Tasks(R.string.tasks_tab, Icons.Default.Task),

    Reminders(R.string.reminder_tab, Icons.Default.Alarm),

    Notes(R.string.notes_tab, Icons.AutoMirrored.Outlined.Notes),

    More(R.string.more_tab, Icons.Outlined.MoreHoriz),
}
