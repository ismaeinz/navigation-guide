package com.example.myapplication.session29NavigationBar.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Routes(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : Routes(
        route = "Home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Account : Routes(
        route = "Account",
        title = "Account",
        icon = Icons.Default.AccountCircle
    )

    object Search : Routes(
        route = "Search",
        title = "Search",
        icon = Icons.Default.Search
    )

    object Settings : Routes(
        route = "Settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )
}