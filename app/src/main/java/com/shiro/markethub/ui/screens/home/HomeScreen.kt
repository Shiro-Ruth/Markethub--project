package com.shiro.markethub.ui.screens.home

import android.content.Intent
import android.graphics.drawable.Icon
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.shiro.markethub.R
import com.shiro.markethub.navigation.ROUT_INTENT
import com.shiro.markethub.navigation.ROUT_ONBOARDING2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()


    ) {


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


                IconButton(onClick = {navController.navigate(ROUT_INTENT)}) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "menu")
                }


            },
            colors = TopAppBarDefaults.topAppBarColors(
                navigationIconContentColor = Color.White,
                containerColor = Color.Magenta,
                titleContentColor = Color.White,
                actionIconContentColor = Color.Red


            )

        )


        Spacer(modifier = Modifier.height(30.dp))

       //ROW
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {

            Spacer(modifier = Modifier.width(30.dp))

            Image(
                painter = painterResource(R.drawable.moisturizer),
                contentDescription = "product",
                modifier = Modifier.height(300.dp).width(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop

            )

            Spacer(modifier = Modifier.width(30.dp))

            Image(
                painter = painterResource(R.drawable.img_3),
                contentDescription = "product",
                modifier = Modifier.height(300.dp).width(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop

            )
            Spacer(modifier = Modifier.width(30.dp))

            Image(
                painter = painterResource(R.drawable.img_4),
                contentDescription = "product",
                modifier = Modifier.height(300.dp).width(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop

            )
            Spacer(modifier = Modifier.width(30.dp))
            Image(
                painter = painterResource(R.drawable.img_5),
                contentDescription = "product",
                modifier = Modifier.height(300.dp).width(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop

            )



        }

        // End of Row


    }



}

@Preview(showBackground =true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}