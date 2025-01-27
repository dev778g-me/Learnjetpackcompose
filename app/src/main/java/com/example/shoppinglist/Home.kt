package com.example.shoppinglist

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavHostController) {

    Scaffold(floatingActionButton = {
        FloatingActionButton(onClick = {
            navController.navigate(Routes.DetailsScreen)
        }) {
            Icon(imageVector =
            Icons.Default.Favorite, contentDescription = "")
        }
    }, topBar = {
        TopAppBar(navigationIcon = {
            Icon(imageVector =
            Icons.Default.AccountCircle, contentDescription = "")
        }, title = { Text(text = "Homepage") })
    }) { }
}
