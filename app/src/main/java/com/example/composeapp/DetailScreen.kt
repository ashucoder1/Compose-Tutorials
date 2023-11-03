package com.example.composeapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailScreen(navHostController: NavHostController){
    Box(modifier = Modifier.fillMaxSize()
        .clickable {
                   navHostController.popBackStack()
        },
        contentAlignment = Alignment.Center
    ){
        Text(text = "Detail",
            color= Color.Red,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview(){
    DetailScreen(navHostController = rememberNavController())
}