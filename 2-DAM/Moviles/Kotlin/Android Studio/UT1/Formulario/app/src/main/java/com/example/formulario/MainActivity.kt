package com.example.formulario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.formulario.ui.theme.FormularioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FormularioTheme {
                CalculadoraApp()
            }
        }
    }

    @Composable
    fun CalculadoraApp(modifier: Modifier = Modifier) {
        var cantidad by remember { mutableStateOf("") }
        var iva by remember { mutableStateOf("") }
        var estaHabilitado by remember { mutableStateOf(false) }
        var baseImponible by remember { mutableDoubleStateOf(0.0) }
        var ivaFinal: Double by remember { mutableDoubleStateOf(0.0) }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "CANTIDAD IVA")
            Spacer(modifier = modifier.padding(16.dp))

            TextField(
                value = cantidad,
                onValueChange = { cantidadIVA ->
                    cantidad = cantidadIVA
                },
                label = {
                    Text("Cantidad final")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .width(160.dp)
            )
            Spacer(modifier = modifier.padding(8.dp))
            TextField(
                value = iva,
                onValueChange = { ivaPorcentaje ->
                    iva = ivaPorcentaje
                },
                label = {
                    Text("IVA (%)")
                },
                modifier = Modifier
                    .width(160.dp)
            )
            Spacer(modifier = modifier.padding(16.dp))
            Button(onClick = {
                var cantidadF = cantidad.toDoubleOrNull()
                var ivaD = iva.toDoubleOrNull()
                if (cantidadF != null && ivaD != null) {
                    estaHabilitado = true
                    var calculo = Calculo(cantidadF, ivaD)
                    ivaFinal = calculo.calcularIVA()
                    baseImponible = calculo.calcularBaseImponible()
                }
            }
            ) {
                Text("CALCULAR")
            }
            Spacer(modifier = modifier.padding(16.dp))
            if (estaHabilitado) {
                Text("Base imponible: $baseImponible")
                Text("IVA: $ivaFinal")
            }
        }
    }
}

