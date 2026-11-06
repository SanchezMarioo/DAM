package com.example.enviomensajes

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.enviomensajes.ui.theme.EnvioMensajesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EnvioMensajesTheme {
                Activity(this@MainActivity)
            }
        }
    }
}

@Composable
fun Activity(activity: MainActivity, modifier : Modifier = Modifier){

    var mensaje by remember { mutableStateOf("") }
    Column(modifier.background(Color(0xFFFFB84D)).fillMaxSize(),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Enviar mensaje")
        Spacer(Modifier.padding(16.dp))
        TextField( value = mensaje, onValueChange = {
            nuevoMensaje -> mensaje = nuevoMensaje
        }, label = {Text("Mensaje")})
        Button(onClick = {
            val intent = Intent(activity, SegundaActivity::class.java)
            intent.putExtra("mensaje", mensaje)
            activity.startActivity(intent)
          }, enabled = mensaje.isNotBlank()) {
            Text("Enviar mensaje")
        }
    }
}

