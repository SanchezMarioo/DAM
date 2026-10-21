package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Box(){
        ImageBackgroud(modifier.fillMaxSize())
        Header()
        Column(
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Bienvenido ",
                fontSize = 65.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = "DAM 2",
                fontSize = 80.sp,
                color = Color.Blue,
                textAlign = TextAlign.Center
            )
        }
    }

}
@Composable
fun Header(modifier : Modifier = Modifier){
    val painter = painterResource(id = R.drawable.logo_venancio)
    Image(
        painter = painter,
        contentDescription = "Logo Venancio",
        modifier = modifier
    )
}
@Composable
fun ImageBackgroud(modifier : Modifier = Modifier){
    val painter = painterResource(id = R.drawable.fondo)
    Image(
        painter = painter,
        contentDescription = "Aplicacion android",
        contentScale = ContentScale.Crop,
        modifier = modifier.alpha(0.4f)
    )
}

@Preview
@Composable
fun HeaderPreview() {
    MyApplicationTheme {
        Header()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting()
    }
}