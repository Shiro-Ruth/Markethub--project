package com.shiro.markethub.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
import com.shiro.markethub.navigation.ROUT_HOME
import com.shiro.markethub.navigation.ROUT_INTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen2(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(

        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Home") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),
                actions = {
                    IconButton(onClick = {}) { Icon(imageVector = Icons.Default.ShoppingCart, contentDescription ="") }
                    IconButton(onClick = {}) { Icon(imageVector = Icons.Default.Info, contentDescription ="") }
                }

            )
        },



        //BottomBar
        bottomBar = {

            NavigationBar(
                containerColor = Color.Magenta
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_INTENT)
                    }
                )


                NavigationBarItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = "Home") },
                    label = { Text("Info") },
                    selected = selectedIndex == 3,
                    onClick = {
                        selectedIndex = 3
                        navController.navigate(ROUT_HOME)
                    }
                )



            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.Magenta
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },

        //Contents

        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                // .background(newYellow)
            ) {


                //Main Contents of the page

                Spacer(modifier = Modifier.height(30.dp))


                //ROW
                Row(
                    modifier = Modifier.horizontalScroll(rememberScrollState())
                ) {

                    Spacer(modifier = Modifier.width(30.dp))

                    Image(
                        painter = painterResource(R.drawable.moisturizer),
                        contentDescription = "product",
                        modifier = Modifier.height(300.dp).width(200.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Crop

                    )

                    Spacer(modifier = Modifier.width(30.dp))

                    Image(
                        painter = painterResource(R.drawable.img_3),
                        contentDescription = "product",
                        modifier = Modifier.height(300.dp).width(200.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Crop

                    )
                    Spacer(modifier = Modifier.width(30.dp))

                    Image(
                        painter = painterResource(R.drawable.img_4),
                        contentDescription = "product",
                        modifier = Modifier.height(300.dp).width(200.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Crop

                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Image(
                        painter = painterResource(R.drawable.img_5),
                        contentDescription = "product",
                        modifier = Modifier.height(300.dp).width(200.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Crop

                    )


                }

                // End of Row


                Button(
                    onClick = { navController.navigate(route = ROUT_HOME) },
                    colors = ButtonDefaults.buttonColors(Color.Magenta),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.width(250.dp)
                                       .align(Alignment.CenterHorizontally)

                ) {
                    Text(text = "Buy now" +
                            "")

                }


            }


        }
    )






    //End of scaffold







}

@Preview(showBackground = true)
@Composable
fun HomeScreen2Preview(){
    HomeScreen2(rememberNavController())
}