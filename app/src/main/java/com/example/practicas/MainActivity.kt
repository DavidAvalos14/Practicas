package com.example.practicas

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicas.ui.theme.PracticasTheme
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.platform.LocalContext


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        "David Avalos",
                        "Enviar",
                    )
                }

            }
        }
    }
}

@Composable
fun GreetingText(message:String,from:String, modifier: Modifier = Modifier) {
    val context: Context = LocalContext.current
    var texto by remember { mutableStateOf(TextFieldValue(message)) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            //modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Start
        ) {
            Row() {
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("7")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("8")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("9")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("/")
                }
            }
        }

        Column(
            //modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Start
        ) {
            Row() {
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("4")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("5")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("6")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("x")
                }
            }
        }

        Column(
            //modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Start
        ) {
            Row() {
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("1")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("2")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("3")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("-")
                }
            }
        }

        Column(
            //modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Start
        ) {
            Row() {
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("0")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text(".")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("=")
                }
                Button(
                    onClick = { /*TODO*/
                        Toast.makeText(
                            context,
                            texto.text,
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 20.dp,
                        pressedElevation = 25.dp,
                        disabledElevation = 15.dp
                    )
                ) {
                    Text("+")
                }
            }
        }
}

}