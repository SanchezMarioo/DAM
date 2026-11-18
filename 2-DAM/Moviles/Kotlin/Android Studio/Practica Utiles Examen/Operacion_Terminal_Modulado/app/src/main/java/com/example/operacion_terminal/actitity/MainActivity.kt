package com.example.operacion_terminal.actitity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.operacion_terminal.pantalla.PantallaPrincipal
import com.example.operacion_terminal.ui.theme.Operacion_TerminalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Operacion_TerminalTheme {
                PantallaPrincipal()
            }
        }
    }
}
