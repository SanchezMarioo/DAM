package com.example.codigo_secreto.Pantallas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codigo_secreto.Componentes.AppTopBar
import com.example.codigo_secreto.R
import com.example.codigo_secreto.ui.theme.Codigo_SecretoTheme
import com.example.codigo_secreto.ui.theme.TextoPrincipal

class SegundaActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Codigo_SecretoTheme {
                PantallaSegunda(intent) { finish() }
            }
        }
    }
}

@Composable
fun PantallaSegunda(intent: Intent, onClickUnit: () -> Unit) {
    val mensaje = intent.getStringExtra("texto") ?: ""
    Scaffold(topBar = {
        AppTopBar(title = stringResource(R.string.segunda_pantalla).trim())
    }) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = mensaje.uppercase(),
                color = TextoPrincipal,
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