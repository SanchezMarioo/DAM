package com.example.scaperoom

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PantallaPrincipal() {
    var nombre by remember { mutableStateOf("") }
    var errorNombre = comprobarNombre(nombre)
    var edad by remember { mutableStateOf("") }
    var errorEdad = comprobarEdad(edad)
    var codigo by remember { mutableStateOf("") }
    var errorCodigo = comprobarCodigo(codigo)
    var dificultad by remember { mutableStateOf("") }
    var tipoDificultad = listOf("Facil", "Normal", "Dificil")
    Scaffold(
        topBar = { AppTopBar() },
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                CampoNombre(nombre, { nombre = it }, errorNombre)
                CampoEdad(edad, { edad = it },errorEdad)
                CampoCodigo(codigo, { codigo = it }, errorCodigo)
                CampoDificultad(dificultad, { dificultad = it }, tipoDificultad)

            }

        }
    }
}
