package com.example.myapplication.session27NavigationWithArg.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController


@Composable
fun FirstScreen(navController: NavController) {
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
        Button(onClick = { navController.navigate(route = "secondScreen/$nameValue/$ageValue") }) {
            Text("Button")
        }
    }

}