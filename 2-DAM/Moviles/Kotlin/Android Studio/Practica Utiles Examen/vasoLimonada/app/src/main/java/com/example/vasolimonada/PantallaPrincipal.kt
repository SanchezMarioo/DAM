package com.example.limonada

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.vasolimonada.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaPrincipal() {

    // El estado se gestiona aquí. No se eleva a MainActivity ni se pasa como value/onValueChange.
    var estado by remember { mutableStateOf(EstadoLimonada.LIMONERO) }
    var pulsaciones by remember { mutableIntStateOf(0) }
    var pulsacionesNecesarias by remember { mutableIntStateOf(0) }

    val imagen = when (estado) {
        EstadoLimonada.LIMONERO -> R.drawable.lemon_tree
        EstadoLimonada.LIMON -> R.drawable.lemon_squeeze
        EstadoLimonada.LIMONADA -> R.drawable.lemon_squeeze
        EstadoLimonada.VASO_VACIO -> R.drawable.lemon_restart
    }

    val instruccion = when (estado) {
        EstadoLimonada.LIMONERO -> stringResource(R.string.lemon_tree_description)
        EstadoLimonada.LIMON -> stringResource(R.string.lemon_squeeze_description)
        EstadoLimonada.LIMONADA -> stringResource(R.string.lemon_drink_description)
        EstadoLimonada.VASO_VACIO -> stringResource(R.string.lemon_restart_description)
    }

    fun gestionarPulsacion() {
        when (estado) {
            EstadoLimonada.LIMONERO -> {
                pulsaciones = 0
                pulsacionesNecesarias = generarPulsacionesNecesarias()
                estado = obtenerSiguienteEstado(
                    estadoActual = estado,
                    pulsaciones = pulsaciones,
                    pulsacionesNecesarias = pulsacionesNecesarias
                )
            }

            EstadoLimonada.LIMON -> {
                pulsaciones++

                estado = obtenerSiguienteEstado(
                    estadoActual = estado,
                    pulsaciones = pulsaciones,
                    pulsacionesNecesarias = pulsacionesNecesarias
                )
            }

            EstadoLimonada.LIMONADA -> {
                estado = obtenerSiguienteEstado(
                    estadoActual = estado,
                    pulsaciones = pulsaciones,
                    pulsacionesNecesarias = pulsacionesNecesarias
                )
            }

            EstadoLimonada.VASO_VACIO -> {
                pulsaciones = 0
                pulsacionesNecesarias = 0
                estado = obtenerSiguienteEstado(
                    estadoActual = estado,
                    pulsaciones = pulsaciones,
                    pulsacionesNecesarias = pulsacionesNecesarias
                )
            }
        }
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = stringResource(R.string.app_name)) }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ImagenLimonada(
                imagen = imagen,
                onClick = { gestionarPulsacion() }
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = instruccion)
        }
    }
}
