package com.example.myapplication.session27NavigationWithArg.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.session27NavigationWithArg.screens.FirstScreen
import com.example.myapplication.session27NavigationWithArg.screens.SecondScreen


@Composable

fun NavArg() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "firstScreen") {
        composable(
            route = "firstScreen"
        ) {
            FirstScreen(navController)
        }
//
        composable(
            route = "secondScreen/{nameValue}/{ageValue}",
            arguments = listOf(
                navArgument(name = "nameValue") {
                    type = NavType.StringType
                    nullable = true
                },
//
                navArgument(name = "ageValue") {
                    type = NavType.IntType
                    nullable = true

//
                }
            )
        ) { it ->
            SecondScreen(
                navController,
                nameValue = it.arguments?.getString("nameValue"),
                ageValue = it.arguments?.getInt("ageValue")
            )

        }

    }
}