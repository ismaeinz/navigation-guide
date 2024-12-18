package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.session29NavigationBar.navigation.Nav
import com.example.myapplication.session29NavigationBar.navigation.Routes
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
//                Nav()
//                NavArg()
                myApp()

            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")

@Composable
fun myApp() {
    val navController = rememberNavController()
    val items = listOf(Routes.Home, Routes.Account, Routes.Search, Routes.Settings)
    Scaffold(
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                items.forEach { screenRoute ->
                    BottomNavigationItem(
                        icon = {
                            Icon(
                                imageVector = screenRoute.icon,
                                contentDescription = screenRoute.title
                            )
                        },
                        label = { Text(text = screenRoute.title) },
                        selected = currentRoute == screenRoute.route,
                        onClick = {
                            navController.navigate(screenRoute.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                    )
                }
            }
        }
    ) {
        Nav(navController = navController)
    }
}

