package com.example.myapplication.session29NavigationBar.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Settings(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Settings", fontSize = 40.sp)
//
        var nameValue by remember { mutableStateOf("") }
        var ageValue by remember { mutableStateOf("") }
//
        Column {

            TextField(
                value = nameValue, onValueChange = { nameValue = it }
            )

            TextField(
                value = ageValue, onValueChange = { ageValue = it }
            )
            Button(onClick = {}) {
                Text("Button")
            }
        }

    }
}