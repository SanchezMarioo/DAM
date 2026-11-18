package com.example.enviomensajes

import android.R.attr.onClick
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.enviomensajes.ui.theme.EnvioMensajesTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EnvioMensajesTheme {
                PantallaPrincipal({ mensaje ->
                    abrirSegundaActivity(mensaje)
                }
                )
            }
        }
    }

    private fun abrirSegundaActivity(mensaje: String) {
        val intent = Intent(this, SegundaActivity::class.java)
        intent.putExtra(EXTRA_MENSAJE, mensaje)
        this.startActivity(intent)

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaPrincipal(
    onEnviar: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var mensaje by rememberSaveable { mutableStateOf("") }
    val mensajeValido = mensaje.isNotBlank() && mensaje.length < 100
    Scaffold(topBar = {
        TopAppBar(
            colors = topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary,
                titleContentColor = MaterialTheme.colorScheme.onPrimary,
            ),
            title = {
                Text(stringResource(R.string.titulo_principal))
            }
        )
    }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .background(MaterialTheme.colorScheme.secondary)
                .padding(innerPadding)
                .fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceAround,
//        horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.padding(16.dp))
            Text(stringResource(R.string.actividad_principal))
            Spacer(Modifier.padding(16.dp))
            Row(
                modifier = modifier
                    .background(
                        MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .fillMaxWidth()

                    .padding(vertical = 16.dp, horizontal = 16.dp)
                    .border(
                        width = 2.dp,
                        color = MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(16.dp)
                    )
            ) {

                Spacer(modifier.padding(4.dp))
                Text(
                    stringResource(R.string.titulo_principal),
                    color = Color.White
                )
            }
            Spacer(Modifier.padding(16.dp))
            Column(
                modifier
                    .fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    value = mensaje,
                    onValueChange = { nuevoMensaje ->
                        mensaje = nuevoMensaje.take(MAX_CARACATERES)
                    },
                    supportingText = {
                        Text(
                            stringResource(
                                R.string.contador_caracteres,
                                mensaje.length,
                                MAX_CARACATERES
                            )
                        )
                    },
                    isError = mensaje.length >= 100,
                    label = { Text("Mensaje") })
                Spacer(Modifier.padding(8.dp))
                Button(
                    onClick = {
                        onEnviar(mensaje)

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    shape = RoundedCornerShape(16.dp),
                    border = BorderStroke(2.dp, Color.Transparent),
                    enabled = mensajeValido

                ) {
                    Text("Enviar mensaje")
                }
                // Con take() es una alternativa sencilla
//            if(mensaje.length > MAX_CARACATERES){
//                mensaje = mensaje.substring(0, MAX_CARACATERES)
//
//            }

            }

        }
    }
}






