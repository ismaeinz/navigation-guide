package com.example.myapplication.session26Navigation.navigation.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun Cscreen(navController: NavController) {
    Column {
        Text(text = "C Screen", fontSize = 40.sp)
        Button(onClick = {
            navController.navigate("A") {
                popUpTo("A") { inclusive = true }
            }
        }) {
            Text(text = "navigate(\"A\")", fontSize = 40.sp)
        }
//
        Button(onClick = { navController.navigate("B") }) {
            Text(text = "navigate(\"B\")", fontSize = 40.sp)
        }
    }
}