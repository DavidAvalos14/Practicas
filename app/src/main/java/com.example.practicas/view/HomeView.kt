package com.example.practicas.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.practicas.R
import com.example.practicas.components.ActionButton
import com.example.practicas.components.MainButton
import com.example.practicas.components.Space
import com.example.practicas.components.TextView
import com.example.practicas.components.TitleBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("MLB") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0, 24, 64)
                )
            )
        }
    ){ innerPadding ->
        ContentHomeView(navController, Modifier.padding(innerPadding))
    }
}
@Composable
fun ContentHomeView(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        //verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //TextView("Home View")
        //Space(espacio = 40)

        MainButton(
            backColor = Color.White,
            color = Color.Black,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            onClick = {}
        ) {
            Image(
                painter = painterResource(id = R.drawable.americana),
                contentDescription = "Logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }


        //Divider(color = Color.Black, thickness = 2.dp)

        MainButton(
            backColor = Color.White,
            color = Color.Black,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            onClick = {}
        ) {
            Image(
                painter = painterResource(id = R.drawable.nacional),
                contentDescription = "Logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

    }
}