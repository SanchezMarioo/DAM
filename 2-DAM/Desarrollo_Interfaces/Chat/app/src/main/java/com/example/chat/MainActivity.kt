package com.example.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chat.ui.theme.ChatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatTheme {
                TarjetaMensaje(
                    autor = "Afadsfdsa",
                    mensaje = "afsdfdsafads",
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChatTheme {
        HomeScreen()
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(4.dp),

        ) {
        Row() {
            Text(text = "MENSAJES", modifier = modifier.padding(start = 8.dp, top = 8.dp))
            Spacer(modifier = Modifier.padding(32.dp))
        }
        LazyColumn {
            item {
                TarjetaMensaje(
                    autor = "Afadsfdsa",
                    mensaje = "afsdfdsafads",
                )
                TarjetaMensaje(
                    autor = "Teresa",
                    mensaje = "afsdfdsafads",
                )
            }
        }
    }

}

@Composable
fun TarjetaMensaje(
    modifier: Modifier = Modifier,
    autor: String,
    mensaje: String,
) {
    val letra = if (autor.isNotEmpty()) autor.substring(0, 1) else ""
    Column(
        modifier = modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFE8F5E9)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = letra,
                    color = Color(0xFF1B5E20),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = autor, color = Color(0xFF2C3E50), fontWeight = FontWeight.Bold)
        }
        Box(
            modifier = Modifier
                .padding(start = 32.dp, top = 8.dp, end = 16.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0x92A172F8))
                .padding(12.dp)
                .size(150.dp)
        ) {
            Text(
                text = mensaje,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaMensajePreview() {
    ChatTheme {
        TarjetaMensaje(autor = "Pedro", mensaje = "gdfvsfdsfdsafdsafdsadsfadsfasdfafdsa")
    }
}
