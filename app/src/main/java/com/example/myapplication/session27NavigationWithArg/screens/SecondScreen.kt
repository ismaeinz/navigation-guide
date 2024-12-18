package com.example.myapplication.session27NavigationWithArg.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController, nameValue: String?, ageValue: Int?) {
    Column {

        Text(text = "nameValue : ${nameValue.toString()}")
        Text(text = "ageValue :${ageValue}")

//
        Button(onClick = { navController.navigate(route = "firstScreen") }) {
            Text("firstScreen")
        }
    }
}