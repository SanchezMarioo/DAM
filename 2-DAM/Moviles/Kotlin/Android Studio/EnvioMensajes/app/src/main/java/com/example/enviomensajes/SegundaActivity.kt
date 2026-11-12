package com.example.enviomensajes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.enviomensajes.ui.theme.EnvioMensajesTheme

class SegundaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mensaje = intent.getStringExtra("mensaje") ?: ""

        setContent {
            EnvioMensajesTheme(usarTemaVerde = true) {
                Row(
                    modifier = Modifier
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

                    Spacer(Modifier.padding(4.dp))
                    Text(
                        stringResource(R.string.titulo_secundario),
                        color = Color.White
                    )
                }
                Column(
                    Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Mensaje enviado", fontSize = 36.sp)
                    Spacer(Modifier.padding(16.dp))
                    Text("Mensaje: $mensaje", fontSize = 36.sp)
                    Button(onClick = { finish() }) {
                        Text("Volver")
                    }
                }
            }

        }

    }
}