package com.example.formulariovalidacion

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.formulariovalidacion.ui.theme.FormularioValidacionTheme

class SegundaActividad : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nombre = intent.getStringExtra("nombre") ?: ""
        val esAdmin = intent.getBooleanExtra("admin", false)
        Log.d("ADMIn", "$esAdmin")
        setContent {
            FormularioValidacionTheme(esAdmin){
                Column(Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
                    Spacer(Modifier.padding(16.dp))
                    Text("Hola $nombre", color = MaterialTheme.colorScheme.onBackground)
                }
            }
        }
    }
}