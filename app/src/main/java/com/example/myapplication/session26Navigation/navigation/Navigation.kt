package com.example.myapplication.session26Navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.session26Navigation.navigation.screens.Ascreen
import com.example.myapplication.session26Navigation.navigation.screens.Bscreen
import com.example.myapplication.session26Navigation.navigation.screens.Cscreen

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "A") {
//        builder
        composable(
            route = "A"
        ) {
            Ascreen(navController)
        }
        composable(
            route = "B"
        ) {
            Bscreen(navController)
        }
        composable(
            route = "C"
        ) {
            Cscreen(navController)
        }
    }
}