package com.example.shoppinglist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Details(navController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var names by remember { mutableStateOf(listOf<String>()) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                16.dp
            ),
        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        OutlinedTextField(
            label = { Text(text = "Enter Name") },
            modifier = Modifier.padding(top = 90.dp),
            value = name,
            onValueChange = {
                    text-> name =text
            }
        )
        Spacer(Modifier.height(20.dp))

        Button(onClick = {
            if (name.isNotEmpty()) {
                names = names + name

            }
        }) {
            Text(text = "add here")
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = {},
            shape = ButtonDefaults.textShape,

            ) {

            Text(text = "Go to another screen")
        }

        LazyColumn(
            modifier = Modifier.padding(16.dp)
        ) {
            items(names) { currentname ->
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)) {
                    Text(
                        text = currentname,
                        modifier = Modifier.padding(horizontal = 5.dp, vertical = 5.dp)
                    )

                }
                VerticalDivider()
            }
        }
    }

}