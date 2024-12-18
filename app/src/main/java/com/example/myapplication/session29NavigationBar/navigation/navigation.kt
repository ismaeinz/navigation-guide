package com.example.myapplication.session29NavigationBar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.session29NavigationBar.screens.Account
import com.example.myapplication.session29NavigationBar.screens.Home
import com.example.myapplication.session29NavigationBar.screens.Search
import com.example.myapplication.session29NavigationBar.screens.Settings

@Composable
fun Nav(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            Home(navController)
        }
        composable(Routes.Account.route) {
            Account(navController)
        }
        composable(Routes.Search.route) {
            Search(navController)
        }
        composable(Routes.Settings.route) {
            Settings(navController)
        }
    }
}