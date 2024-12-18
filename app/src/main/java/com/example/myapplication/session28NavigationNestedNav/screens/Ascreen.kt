package com.example.myapplication.session28NavigationNestedNav.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Ascreen(navController:NavController) {
    Column {
        Text(text = "A screen")
        Button(onClick = {}) {
            Text(text = "Go to")

        }
    }
}