package com.example.incremento_decremento

import android.R.attr.onClick
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.incremento_decremento.ui.theme.Incremento_DecrementoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Incremento_DecrementoTheme {
                decrementoIncremento()
            }
        }
    }

    @Composable
    fun decrementoIncremento(modifier: Modifier = Modifier) {
        var numero by remember { mutableStateOf((10..20).random()) }
        val colorTexto = when (numero) {
            in 10..20 -> Color.Green
            in 4..9 -> Color(0xFFFF9800)
            in 1..3 -> Color.Red
            else -> Color.DarkGray
        }
        Column(
            modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text("$numero",
                color = colorTexto,
                fontSize = 120.sp,
                fontWeight = FontWeight.Black)
            if(numero > 0){
                Button(onClick = { numero-- }) {
                    Text("PULSAR")
                }
            } else{
                Row(){
                    Button(onClick = { numero-- },enabled = false) {
                        Text("PULSAR")
                    }
                    Spacer(Modifier.padding(horizontal = 8.dp))
                    Button(onClick = {numero = (10..20).random()}) {
                        Text("REINCIAR")
                    }
                }

            }

        }
    }
}

