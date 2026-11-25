package com.shiro.markethub.ui.screens.splash

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.shiro.markethub.R
import com.shiro.markethub.navigation.ROUT_SPLASH
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SplashScreenScreen(navController: NavController){

//Navigation
    val x = rememberCoroutineScope()
    x.launch{
        delay(2000)
        navController.navigate( route = ROUT_SPLASH)
    }



    Column(
        modifier = Modifier.fillMaxSize().background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {

        Image(
            painter = painterResource(R.drawable.img_4),
            contentDescription = "product",
            modifier = Modifier.height(200.dp).width(200.dp)



        )













    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenScreenPreview(){

    SplashScreenScreen(rememberNavController())
}