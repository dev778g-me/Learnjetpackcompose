package com.example.shoppinglist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.R
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           val navController = rememberNavController()
            NavHost(
                navController = navController,
                 startDestination = Routes.Homescreen
            ){
                composable(Routes.Homescreen) {
                    Home(navController)
                }
                composable(Routes.DetailsScreen) {
                    Details(navController)
                }
            }

        }
    }
}
