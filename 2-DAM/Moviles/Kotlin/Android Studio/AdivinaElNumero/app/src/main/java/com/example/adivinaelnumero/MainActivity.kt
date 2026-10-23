package com.example.adivinaelnumero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.adivinaelnumero.ui.theme.AdivinaElNumeroTheme

class MainActivity : ComponentActivity() {
    val MIN = 0
    val MAX = 10
    val INTENTOS = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdivinaElNumeroTheme {
                HomeScreen()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun HomeScreenPreview() {
        HomeScreen()
    }

    @Composable
    fun HomeScreen(modifier: Modifier = Modifier) {
        var contador by remember { mutableStateOf(5) }
        var intentos by remember { mutableStateOf(INTENTOS) }
        var numeroAleatorio by remember { mutableStateOf ((MIN..MAX).random()) }
        Column(
            modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "ADIVINA EL NUMERO", fontSize = 36.sp)
            Spacer(modifier.padding(5.dp))
            Text(text = "Numero entre 1 y 10 ", fontSize = 18.sp)
            Spacer(modifier.padding(10.dp))
            Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Button(
                    onClick = { contador-- }, enabled =
                        if (contador <= 0) false
                        else true
                ) {
                    Text("-")
                }
                Spacer(modifier.padding(horizontal = 10.dp))
                Text("$contador", fontSize = 36.sp)
                Spacer(modifier.padding(horizontal = 10.dp))
                Button(
                    onClick = { contador++ }, enabled =
                        if (contador >= 10) false
                        else true
                ) {
                    Text("+")
                }

            }
            Spacer(modifier.padding(10.dp))
            Text("Intentos restantes: $intentos")
            Spacer(modifier.padding(10.dp))
            Button(onClick = {}) {
                Text("Comprobar")
            }
            Spacer(modifier.padding(10.dp))
            Text("Selecciona un número y comprueba")
            Spacer(modifier.padding(10.dp))
            Button(onClick = {}) {
                Text("Nueva Partida")
            }
        }
    }
}

