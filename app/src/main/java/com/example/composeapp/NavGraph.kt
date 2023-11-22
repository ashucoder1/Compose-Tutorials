package com.example.composeapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(navHostController: NavHostController){
    NavHost(navController =navHostController,
        startDestination = Screen.Home.route,
        ){
        //declare graph
        composable(route=Screen.Home.route){
            HomeScreen(navHostController)
        }
        composable(route=Screen.Detail.route,
        arguments = listOf(navArgument("id"){
            type=NavType.IntType
        })
        ){
            DetailScreen(navHostController)
        }
    }
}