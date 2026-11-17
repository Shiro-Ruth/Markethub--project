package com.shiro.markethub.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.shiro.markethub.R


@Composable
fun OnboardingScreen2(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Image(
            painter = painterResource(R.drawable.delivery),
            contentDescription = "product",
            modifier = Modifier.height(200.dp).width(200.dp)




        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Fast Delivery",
            fontSize =30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(

            text ="Yay, it's official! Your order is in and we're doing a little happy dance over here. We're packing your items with care and will send your tracking link soon!",
            textAlign = TextAlign.Center,
            fontSize = 15.sp

        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {},
            colors= ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp)
        ) {
            Text(text = "Get started")

        }
    }
}


@Preview(showBackground = true)
@Composable
fun OnboardingScreen2Preview(){
    OnboardingScreen2(rememberNavController())
}