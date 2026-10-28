package com.example.adivinaelnumero

import android.R.attr.onClick
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.adivinaelnumero.ui.theme.AdivinaElNumeroTheme

class MainActivity : ComponentActivity() {
    val MIN = 1
    val MAX = 10
    val NUMERO_INCIAL = 5
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
        var numeroUsuario by remember { mutableStateOf(NUMERO_INCIAL) }
        var intentos by remember { mutableStateOf(INTENTOS) }
        var numeroSecreto by remember { mutableStateOf((MIN..MAX).random()) }
        var eleccionTexto by remember { mutableStateOf(0) }
        var ganaste by remember { mutableStateOf(false) }

        var texto = when (eleccionTexto) {
            0 -> R.string.textoPorDefecto
            1 -> R.string.numeroEsMayor
            2 -> R.string.numeroEsMenor
            3 -> R.string.ganaste
            4 -> R.string.perdiste
            else -> R.string.textoPorDefecto
        }
        var color = when (eleccionTexto) {
            3 -> Color.Green
            4 -> Color.Red
            else -> Color.Black
        }
        Column(
            modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "$numeroSecreto")
            Text(text = "ADIVINA EL NUMERO", fontSize = 36.sp)
            Spacer(modifier.padding(5.dp))
            Text(text = "Numero entre 1 y 10 ", fontSize = 18.sp)
            Spacer(modifier.padding(10.dp))
            Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Button(
                    onClick = { numeroUsuario-- }, enabled =
                        numeroUsuario <= 0 || ganaste

                ) {
                    Text("-")
                }
                Spacer(modifier.padding(horizontal = 10.dp))
                Text("$numeroUsuario", fontSize = 36.sp)
                Spacer(modifier.padding(horizontal = 10.dp))
                Button(
                    onClick = { numeroUsuario++ }, enabled =
                        numeroUsuario >= 10 || ganaste

                ) {
                    Text("+")
                }

            }

            Spacer(modifier.padding(10.dp))
            Text("Intentos restantes: $intentos")
            Spacer(modifier.padding(10.dp))
            Button(
                onClick = {
                    if (numeroUsuario == numeroSecreto) {
                        eleccionTexto = 3
                        ganaste = true
                    } else {
                        intentos--
                        if (numeroUsuario < numeroSecreto) {
                            eleccionTexto = 1
                        }
                        if (intentos == 0) {
                            eleccionTexto = 4
                            ganaste = true
                        }
                    }
                }, enabled = (eleccionTexto != 3 && intentos > 0)
            ) {
                Text("Comprueba")
            }

            Spacer(modifier.padding(10.dp))

            Text(stringResource(texto), color = color)

            Spacer(modifier.padding(4.dp))
            Button(onClick = {
                numeroSecreto = ((MIN..MAX).random())
                eleccionTexto = 0
                intentos = INTENTOS
                numeroUsuario = 5
            }) {
                Text("Nueva Partida")
            }
        }
    }
}


