package com.example.ecodrive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.ecodrive.ui.theme.EcoDriveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            EcoDriveTheme {
                PantallaPrincipal()
            }
        }
    }
}

@Composable
fun PantallaPrincipal() {
    val tiposVehiculo = stringArrayResource(R.array.vehiculos).toList()
    var nombre by remember { mutableStateOf("") }
    var dni by remember { mutableStateOf("") }
    var diasAlquiler by remember { mutableStateOf("") }
    // Valor por defecto del selector
    var seleccionVehiculo by remember { mutableStateOf("Selecciona una opcion") }
    var conductorAdicional by remember { mutableStateOf(false) }
    var seguroTodoRiesgo by remember { mutableStateOf(false) }
    var comprobaciones by remember { mutableStateOf(ResultadoComprobaciones()) }
    Column(
        // IMPORTANTE el fillMaxSize cabezon
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        // Centrar y espaciar
        verticalArrangement = Arrangement.spacedBy(
            16.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextInput(
            nombre,
            { nombre = it },
            "Introduce tu nombre",
            comprobaciones.nombreValido,
            "¡No puedes dejar el campo en blanco!",
            imeAction = ImeAction.Next

        )
        TextInput(
            dni,
            { dni = it },
            "Introduce tu DNI",
            comprobaciones.dniValido,
            "El DNI tiene que tener 8 numeros y 1 letra",
            imeAction = ImeAction.Next

        )
        TextInput(
            diasAlquiler,
            { diasAlquiler = it },
            "Introduce los dias de alquiler",
            comprobaciones.diasAlquiler,
            "El numero de dias debe de estar comprendido entre 1 y 30",
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Next
        )
        TipoVehiculoSelect(
            seleccionVehiculo,
            { seleccionVehiculo = it },
            tiposVehiculo,

            )

        Row(
            // Pa que quede alineado
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text("Conductor adicional: ")
            Spacer(Modifier.padding(horizontal = 8.dp))
            Switch(conductorAdicional, { conductorAdicional = it })

        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Seguro a todo riesgo: ")
            Spacer(Modifier.padding(horizontal = 8.dp))
            Switch(seguroTodoRiesgo, { seguroTodoRiesgo = it })

        }
        Button(onClick = {
            comprobaciones = comprobarTodo(nombre, dni, diasAlquiler, seleccionVehiculo)
        }) {
            Text("Solicitar reserva")
        }
    }

}

