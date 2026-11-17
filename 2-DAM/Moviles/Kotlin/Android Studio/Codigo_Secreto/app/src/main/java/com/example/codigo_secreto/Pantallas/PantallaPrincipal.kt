package com.example.codigo_secreto.Pantallas

import android.util.Log
import androidx.compose.foundation.background
import com.example.codigo_secreto.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codigo_secreto.Componentes.AppTopBar
import com.example.codigo_secreto.Componentes.InputTexto
import com.example.codigo_secreto.Componentes.TecladoNumero
import com.example.codigo_secreto.Modelo.EstadosPantalla
import com.example.codigo_secreto.ui.theme.FondoPrincipal
import com.example.codigo_secreto.ui.theme.MoradoPrincipal

@Composable
fun PantallaPrincipal(
    onCambioPantalla: (EstadosPantalla) -> Unit = {},
    onTextoLibre: (String) -> Unit = {}
) {
    var textoLibre by remember { mutableStateOf("") }
    var cifrasDescrifadas by remember { mutableStateOf("----") }
    var cifrasCifradas by remember { mutableStateOf("") }
    var error by remember { mutableStateOf(false) }
    Scaffold(topBar = { AppTopBar(title = stringResource(R.string.app_name)) }) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .background(FondoPrincipal)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            InputTexto(
                nombre = textoLibre,
                onCambioValor = {
                    textoLibre = it
                    onTextoLibre(it)
                }, error
            )
            Log.d("Espacio", textoLibre)
            Spacer(Modifier.padding(16.dp))
            Text(
                text = cifrasDescrifadas,
                fontSize = 48.sp,
                color = MoradoPrincipal,
                letterSpacing = 16.sp
            )
            TecladoNumero(
                cifrasCifradas,
                textoLibre,
                { nuevoTexto -> cifrasCifradas = nuevoTexto.take(4) },
                { nuevoTexto -> cifrasDescrifadas = nuevoTexto.take(4) },
                onCambioPantalla,
                { textoLibre = it }
            )
        }
    }
}
