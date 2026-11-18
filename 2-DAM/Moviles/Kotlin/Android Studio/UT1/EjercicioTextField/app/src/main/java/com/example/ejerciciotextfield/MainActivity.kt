package com.example.ejerciciotextfield

import android.R.attr.label
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejerciciotextfield.ui.theme.EjercicioTextFieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioTextFieldTheme {
                PantallaSaludo()
            }
        }
    }
}

@Composable
fun PantallaSaludo(modifier: Modifier = Modifier) {
    var nombreIntroducido by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf(false) }
    var texto by remember { mutableStateOf("Hola") }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = texto)
        Spacer(modifier = modifier.padding(16.dp))
        Row() {
            TextField(
                value = nombreIntroducido,
                onValueChange = { nuevoTexto ->
                    nombreIntroducido = nuevoTexto
                },
                label = {
                    Text("Nombre")
                },
                modifier = Modifier
                    .width(160.dp)
            )
            Spacer(modifier = modifier.padding(16.dp))
            Button(onClick = {
                estado = true
                texto = "Hola $nombreIntroducido"
                nombreIntroducido = ""
            }
            ) {
                Text("Comprobar")
            }
        }
    }


}


