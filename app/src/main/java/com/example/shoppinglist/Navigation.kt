//package com.example.shoppinglist
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
//
//@Composable
//fun AppNavigation() {
//    // creating a nav controller
//    val navController = rememberNavController()
//
//    NavHost(
//        navController = navController,
//        startDestination = ""
//    ) {
//        //defining the home route
//        composable("home") {
//            Home(navController = navController)
//        }
//    }
//}