package com.shiro.markethub.ui.screens.home

import android.content.Intent
import android.graphics.drawable.Icon
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()


    ) {

        //TopAppBar
        TopAppBar(
            title = { Text(text ="Home") },

            navigationIcon = {
                IconButton(onClick = {}) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                }



            },
            actions={

                IconButton(onClick = {}) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "menu")
                }


                IconButton(onClick = {}) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.Notifications, contentDescription = "menu")
                }


            },
            colors = TopAppBarDefaults.topAppBarColors(
                navigationIconContentColor = Color.White,
                containerColor = Color.Magenta,
                titleContentColor = Color.White,
                actionIconContentColor = Color.Red


            )

        )


    }



}

@Preview(showBackground =true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}