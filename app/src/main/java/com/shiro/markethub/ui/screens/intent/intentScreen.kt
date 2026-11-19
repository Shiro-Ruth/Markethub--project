package com.shiro.markethub.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.shiro.markethub.navigation.ROUT_INTENT
import com.shiro.markethub.navigation.ROUT_ONBOARDING2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){

  val mContext= LocalContext.current


    Column(
        modifier = Modifier.fillMaxSize()

    ) {

        TopAppBar(
            title = { Text(text = "Android Intent") },

            navigationIcon = {
                IconButton(onClick = {}) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu"
                    )
                }


            },
            actions = {

                IconButton(onClick = {}) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "menu"
                    )
                }


                IconButton(onClick = {}) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "menu"
                    )
                }


            },
            colors = TopAppBarDefaults.topAppBarColors(
                navigationIconContentColor = Color.White,
                containerColor = Color.Magenta,
                titleContentColor = Color.White,
                actionIconContentColor = Color.White


            )

        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }


            },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Pay now")

            IconButton(onClick = {}) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.Check, contentDescription = "menu")

            }


        }


        Spacer(modifier = Modifier.height(30.dp))


        Button(
            onClick = {
                val smsIntent=Intent(Intent.ACTION_SENDTO)
        smsIntent.data="smsto:0795644288".toUri()
        smsIntent.putExtra("sms_body","Hello Shiro,where do I make my order?")
        mContext.startActivity(smsIntent)
    },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Message Us")
         IconButton(onClick = {}) {
             androidx.compose.material3.Icon(imageVector = Icons.Default.MailOutline, contentDescription = "menu")

         }

        }
        Spacer(modifier = Modifier.height(30.dp))


        Button(
            onClick = {
                val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0795644288".toUri()
                mContext.startActivity(callIntent)
            },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Call Now")
            IconButton(onClick = {}) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.Call, contentDescription = "menu")

            }


        }
        Spacer(modifier = Modifier.height(30.dp))


        Button(
            onClick = {  val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("njugunasharon070@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)
            },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Email Us")

            IconButton(onClick = {}) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.Email, contentDescription = "menu")

            }



        }
        Spacer(modifier = Modifier.height(30.dp))


        Button(
            onClick = {
                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }


            },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Take a Picture")

            IconButton(onClick = {}) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.Person, contentDescription = "menu")

            }


        }
        Spacer(modifier = Modifier.height(30.dp))


        Button(
            onClick = {
                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "https://github.com/gloryakinyi")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))


            },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp).align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Share")

            IconButton(onClick = {}) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.Share, contentDescription = "menu")

            }



        }

    }












    }


@Preview(showBackground = true)
@Composable
fun IntentScreenpreview(){
    IntentScreen(rememberNavController())
















































}