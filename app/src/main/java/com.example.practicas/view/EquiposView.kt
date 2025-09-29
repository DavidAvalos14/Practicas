package com.example.practicas.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
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
import com.example.practicas.components.TitleBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun EquiposView(navController: NavController, id:Int){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { if(id == 4) {
                    // LA Este
                    TitleBar("Boston Red Sox")
                } else if(id == 8){
                    // LA Central
                    TitleBar("Cleveland Guardians")
                } else if(id == 12) {
                    // LA Oeste
                    TitleBar("Seattle Mariners")
                } else if(id == 5) {
                    // LN Este
                    TitleBar("Miami Marlins")
                } else if(id == 10) {
                    // LN Central
                    TitleBar("Chicago Cubs")
                } else if(id == 15) {
                    // LN Oeste
                    TitleBar("Arizona DiamondBacks")
                } else {
                    TitleBar("Seleccione un Equipo")
                }
                        },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = if(id == 4) {
                        Color(198, 32, 51)
                    } else if(id == 8) {
                        Color(0, 53, 93)
                    } else if(id == 12) {
                        Color(0, 44, 86)
                    } else if(id == 5) {
                        Color(0, 0, 0)
                    } else if(id == 10) {
                        Color(0, 46, 110)
                    } else if(id == 15) {
                        Color(167, 25, 48)
                    } else {
                        Color(0, 24, 64)
                    }
                ),
                navigationIcon= {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){ innerPadding ->
        ContentEquiposView(navController, id, Modifier.padding(innerPadding))
    }

}

@Composable
fun ContentEquiposView(navController: NavController, id:Int, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        //verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(
                painter = if (id == 4) {
                    painterResource(id = R.drawable.redsox)
                } else if(id == 8){
                    painterResource(id = R.drawable.guardians)
                } else if(id == 12) {
                    painterResource(id = R.drawable.mariners)
                } else if(id == 5) {
                    painterResource(id = R.drawable.marlins)
                } else if(id == 10) {
                    painterResource(id = R.drawable.cubs)
                } else if(id == 15) {
                    painterResource(id = R.drawable.dbacks)
                } else {
                    painterResource(id = R.drawable.mlb)
                },
                contentDescription = "LogosEquipo",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(100.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .weight(1f)
                .background(Color(0xFFFFF9C4))
                .border(
                    width = 2.dp,
                    color = Color(0xFFFBC02D),
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(16.dp)
        ) {
            Text(
                text = when (id) {
                    4 -> "AÑO DE FUNDACIÓN: 1901 (124 años) " +
                            "\nCAMPEONATOS:  1903, 1912, 1915, 1916, 1918, 2004, 2007, 2013, 2018 (9 campeonatos | Empatado en 3er)" +
                            "\nRIVAL DIVISIONAL: Su acérrimo rival son los New York Yankees, equipo involucrado en la 'Maldición del bambino' " +
                            "\nMexicanos destacados: Jarrén Durán, el mexicoamericano ha tenido par de temporadas explosivas con los Red Sox siendo uno de los Jerseys mas vendidos en toda MLB."
                    8 -> "AÑO DE FUNDACIÓN: \nCAMPEONATOS: \nRIVAL DIVISIONAL: \nMexicanos destacados: "
                    12 -> "AÑO DE FUNDACIÓN: \nCAMPEONATOS: \nRIVAL DIVISIONAL: \nMexicanos destacados:"
                    5 -> "AÑO DE FUNDACIÓN: \nCAMPEONATOS: \nRIVAL DIVISIONAL: \nMexicanos destacados:"
                    10 -> "AÑO DE FUNDACIÓN: \nCAMPEONATOS: \nRIVAL DIVISIONAL: \nMexicanos destacados:"
                    15 -> "AÑO DE FUNDACIÓN: \nCAMPEONATOS: \nRIVAL DIVISIONAL: \nMexicanos destacados:"
                    else -> "Información del equipo seleccionada aparecerá aquí."
                },
                color = Color.Black
            )
        }
    }

}


