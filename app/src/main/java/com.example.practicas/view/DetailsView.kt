package com.example.practicas.view

import android.R.attr.title
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import com.example.practicas.components.MainButton
import com.example.practicas.components.MainIconButton
import com.example.practicas.components.Space
import com.example.practicas.components.TextView
import com.example.practicas.components.TitleBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsView(navController: NavController, id:Int){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { if(id == 4) {
                    TitleBar("LIGA AMERICANA")
                } else {
                    TitleBar("LIGA NACIONAL")
                }},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0, 24, 64)
                ),
                navigationIcon= {
            MainIconButton(icon = Icons.Default.ArrowBack) {
                navController.popBackStack()
            }
        }
    )
}
    ){ innerPadding ->
        ContentDetailView(navController, id, Modifier.padding(innerPadding))
    }

}

@Composable
fun ContentDetailView(navController: NavController, id:Int, modifier: Modifier = Modifier) {
    val id1 = 1 * id;
    val id2 = 2 * id;
    val id3 = 3 * id;
   Column(
       modifier = modifier.fillMaxSize(),
       //verticalArrangement = Arrangement.Center,
       //horizontalAlignment = Alignment.CenterHorizontally
   ){
       MainButton(
           backColor = Color.White,
           color = Color.Black,
           modifier = Modifier
               .weight(1f)
               .fillMaxWidth(),
           onClick = {navController.navigate("Equipo/${id1}")}
       ) {
           Image(
               painter = if(id == 4) {
                   painterResource(id = R.drawable.redsox)
                                     } else {
                   painterResource(id = R.drawable.marlins)
                                     },
               contentDescription = "LogosDEste",
               contentScale = ContentScale.Fit,
               modifier = Modifier.fillMaxSize()
           )

           Text(
               text = "ESTE: ",
               color = Color.Black,
               modifier = Modifier
                   .align(Alignment.TopStart)
                   .padding(8.dp)
           )
       }

       MainButton(
           backColor = Color.White,
           color = Color.Black,
           modifier = Modifier
               .weight(1f)
               .fillMaxWidth(),
           onClick = {navController.navigate("Equipo/${id2}")}
       ) {
           Image(
               painter = if(id == 4) {
                   painterResource(id = R.drawable.guardians)
               } else {
                   painterResource(id = R.drawable.cubs)
               },
               contentDescription = "LogosDCentral",
               contentScale = ContentScale.Fit,
               modifier = Modifier.fillMaxSize()
           )

           Text(
               text = "CENTRAL: ",
               color = Color.Black,
               modifier = Modifier
                   .align(Alignment.TopStart)
                   .padding(8.dp)
           )
       }

       MainButton(
           backColor = Color.White,
           color = Color.Black,
           modifier = Modifier
               .weight(1f)
               .fillMaxWidth(),
           onClick = {navController.navigate("Equipo/${id3}")}
       ) {
           Image(
               painter = if(id == 4) {
                   painterResource(id = R.drawable.mariners)
               } else {
                   painterResource(id = R.drawable.dbacks)
               },
               contentDescription = "LogosDOeste",
               contentScale = ContentScale.Fit,
               modifier = Modifier.fillMaxSize()
           )

           Text(
               text = "OESTE: ",
               color = Color.Black,
               modifier = Modifier
                   .align(Alignment.TopStart)
                   .padding(8.dp)
           )
       }
   }
}
