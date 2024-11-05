package com.ub.daytrail.base.appdata

import android.content.Context
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.NoteAlt
import androidx.compose.material.icons.filled.Task
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.material.icons.outlined.MoreHoriz
import androidx.compose.material.icons.outlined.NoteAlt
import androidx.compose.material.icons.outlined.Task
import com.ub.daytrail.R
import com.ub.daytrail.base.bottombar.BottomBarItems

class BottomBarData(private val context: Context) {
    val bottomBarItems: List<BottomBarItems> = listOf(
        BottomBarItems(
            title = context.getString(R.string.tasks_tab),
            selectedIcon = Icons.Filled.Task,
            unselectedIcon = Icons.Outlined.Task,
            hasNews = false
        ),
        BottomBarItems(
            title = context.getString(R.string.reminder_tab),
            selectedIcon = Icons.Filled.Alarm,
            unselectedIcon = Icons.Outlined.Alarm,
            hasNews = false
        ),
        BottomBarItems(
            title = context.getString(R.string.notes_tab),
            selectedIcon = Icons.Filled.NoteAlt,
            unselectedIcon = Icons.Outlined.NoteAlt,
            hasNews = false
        ),
        BottomBarItems(
            title = context.getString(R.string.more_tab),
            selectedIcon = Icons.Filled.MoreHoriz,
            unselectedIcon = Icons.Outlined.MoreHoriz,
            hasNews = false
        )
    )
}


/*Tasks(R.string.tasks_tab, Icons.Default.Task),
val title: String,
val selectedIcon: ImageVector,
val unselectedIcon: ImageVector,
val hasNews: Boolean,
val badgeCount: Int? = null
Reminders(R.string.reminder_tab, Icons.Default.Alarm),

Notes(R.string.notes_tab, Icons.AutoMirrored.Outlined.Notes),

More(R.string.more_tab, Icons.Outlined.MoreHoriz)*/
