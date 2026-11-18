package com.example.operacion_terminal.actitity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.operacion_terminal.componentes.AppTopBar
import com.example.operacion_terminal.pantalla.PantallaPrincipal
import com.example.operacion_terminal.ui.theme.Operacion_TerminalTheme

class BravoPantalla : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Operacion_TerminalTheme(){
                PantallaPrincipal(intent,::finish)
            }
        }
    }
}
@Composable
fun PantallaPrincipal(intent: Intent, onClickUnit: () -> Unit) {
    val mensaje = intent.getStringExtra("texto") ?: ""
    Scaffold(topBar = {
        AppTopBar()
    }) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = mensaje.reversed(),
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = onClickUnit) {
                Text("Volver")
            }
        }
    }
}