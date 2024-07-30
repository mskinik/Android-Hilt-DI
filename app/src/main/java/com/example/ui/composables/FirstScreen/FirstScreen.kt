package com.example.ui.composables.FirstScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.ui.composables.navigation.Screens

@Composable
fun FirstScreen(
    navController: NavController,
    firstScreenViewModel: FirstScreenViewModel = hiltViewModel<FirstScreenViewModel>()
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello From First Screen", modifier = Modifier.clickable {
            navController.navigate(Screens.SecondScreen.route.plus("/example value"))
        })
    }
}