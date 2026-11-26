package com.example.operacion_terminal.pantalla

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.operacion_terminal.componentes.AppTopBar
import com.example.operacion_terminal.componentes.TecladoNumero
import com.example.operacion_terminal.modelo.EstadoPantalla

@Composable
fun PantallaPrincipal(modifier: Modifier = Modifier) {
    var mensaje by rememberSaveable { mutableStateOf("") }
    var digitosCifrados by rememberSaveable { mutableStateOf("----") }
    var digitos by rememberSaveable { mutableStateOf("") }
    var estado by rememberSaveable { mutableStateOf(EstadoPantalla.PANTALLA_PRINCIPAL) }
    Scaffold(topBar = { AppTopBar() }) { innerPadding ->
        Column(
            modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(
                16.dp

            ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            OutlinedTextField(
                value = mensaje,
                onValueChange = { mensaje = it },
                label = { Text("Introduce un mensaje") }

            )
            Text(digitosCifrados, fontSize = 40.sp)
            TecladoNumero(
                LocalContext.current,
                digitos,
                digitosCifrados,
                mensaje,
                { digitos = it },
                { digitosCifrados = it },
                { mensaje = it }
            )
        }
    }
}