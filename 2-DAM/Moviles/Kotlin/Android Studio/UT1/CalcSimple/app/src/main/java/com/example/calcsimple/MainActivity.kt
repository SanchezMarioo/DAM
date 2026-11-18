package com.example.calcsimple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calcsimple.ui.theme.CalcSimpleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalcSimpleTheme {
                Calculadora()
            }
        }
    }
}

@Composable
fun Calculadora(modifier: Modifier = Modifier) {
    var resultado by remember { mutableStateOf<Double?>(null) }
    var formatoIncorrecto by remember { mutableStateOf(false) }
    fun enviarDatos(num1: String, num2: String, op: String) {

        // Remplaza los puntos por la coma para que asi no pete
        val num1 = num1.replace(",", ".")
        val num2 = num2.replace(",", ".")

        var numeroTransf = num1.toDoubleOrNull()
        var numero2Transf = num2.toDoubleOrNull()
        if (numeroTransf != null && numero2Transf != null) {

            var calculadora = Calculo(numeroTransf, numero2Transf)
            when (op) {
                "sum" -> resultado = calculadora.sumar()
                "res" -> resultado = calculadora.resta()
                "mul" -> resultado = calculadora.multi()
                "divi" -> if (numero2Transf == 0.0) resultado = null
                else resultado =
                    calculadora.divi()

                else -> resultado = null
            }
        } else {
            formatoIncorrecto = true
        }

    }

    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("CALCULADORA")
        Spacer(Modifier.padding(8.dp))
        Row() {
            TextField(
                value = num1,
                onValueChange = { nuevoNumero ->
                    num1 = nuevoNumero
                }, label = {
                    Text("Numero 1")
                },
                // Sacamos el teclado numerico
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
        }
        Spacer(Modifier.padding(16.dp))
        TextField(
            value = num2,
            onValueChange = { nuevoNumero ->
                num2 = nuevoNumero
            }, label = {
                Text("Numero 2")
            }, keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        )
        Spacer(Modifier.padding(16.dp))
        Row(modifier.padding(16.dp)) {
            Button(onClick = { enviarDatos(num1, num2, "sum") }, Modifier.weight(0.5f)) {
                Text("+")
            }
            Spacer(modifier.padding(horizontal = 8.dp))
            Button(onClick = {
                enviarDatos(num1, num2, "res")
            }, Modifier.weight(0.5f)) {
                Text("-")
            }


        }
        Row(modifier.padding(16.dp)) {
            Button(onClick = { enviarDatos(num1, num2, "mul") }, Modifier.weight(0.5f)) {
                Text("*")
            }
            Spacer(modifier.padding(horizontal = 8.dp))

            Button(onClick = { enviarDatos(num1, num2, "divi") }, Modifier.weight(0.5f)) {
                Text("/")
            }
        }
        if (resultado != null) {
            Text("El resultado es $resultado")
        }
        if (formatoIncorrecto) {
            Text("FORMATO INCORRECTO. ", color = Color.Red)
            Text("Escribe de nuevo los numeros", color = Color.Red)
        }
    }

}