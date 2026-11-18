package com.example.codigo_secreto.Pantallas

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.input.key.Key.Companion.I
import com.example.codigo_secreto.Modelo.EstadosPantalla
import com.example.codigo_secreto.ui.theme.Codigo_SecretoTheme
import com.example.codigo_secreto.utils.SEGUNDO_ACTIVITY
import com.example.codigo_secreto.utils.TERCERA_ACTIVITY

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            Codigo_SecretoTheme {
                var mensaje by remember { mutableStateOf("") }
                var cambiarPantalla by remember { mutableStateOf(EstadosPantalla.SIN_CAMBIO) }
                PantallaPrincipal(
                    onCambioPantalla = { nuevaPantalla ->
                        // Se ejecuta cuando se cambie el estado es decir es el disparador que hace que cambie
                        cambiarActivity(nuevaPantalla, mensaje)
                    },
                    onTextoLibre = { mensaje = it }
                )
            }
        }
    }

    fun cambiarActivity(estado: EstadosPantalla, mensaje: String) {
        Log.d("Estado", estado.toString())
        when (estado) {
            EstadosPantalla.PANTALLAPRIMERA -> {
                val intent = Intent(this, SEGUNDO_ACTIVITY)
                intent.putExtra("texto", mensaje)
                startActivity(intent)

            }

            EstadosPantalla.PANTALLASEGUNDA -> {
                val intent = Intent(this, TERCERA_ACTIVITY)
                intent.putExtra("texto", mensaje)
                startActivity(intent)
            }

            EstadosPantalla.SIN_CAMBIO -> null
        }
    }
}

