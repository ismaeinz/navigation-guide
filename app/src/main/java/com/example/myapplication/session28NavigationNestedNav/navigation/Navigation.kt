package com.example.myapplication.session28NavigationNestedNav.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.session28NavigationNestedNav.screens.Ascreen
import com.example.myapplication.session28NavigationNestedNav.screens.Bscreen
import com.example.myapplication.session28NavigationNestedNav.screens.Onescreen
import com.example.myapplication.session28NavigationNestedNav.screens.Twoscreen

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "One") {
        composable(route = "One") {
            Onescreen(navController)
        }
        composable(route = "Two") {
            Twoscreen(navController)
        }
        composable(route = "A") {
            Ascreen(navController)
        }
        composable(route = "B") {
            Bscreen(navController)
        }
    }
}