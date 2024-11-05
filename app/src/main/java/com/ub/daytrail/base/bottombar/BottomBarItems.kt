package com.ub.daytrail.base.bottombar

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomBarItems(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int? = null
)
