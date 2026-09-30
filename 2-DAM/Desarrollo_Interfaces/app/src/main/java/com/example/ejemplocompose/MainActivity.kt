package com.example.ejemplocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemplocompose.ui.theme.EjemploComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            Row {
                Text("Hola mundo")
                Text("Hasta luego Mundo")
                ColumnaPreview()
                Text("Hola mundo")
                Text("Hasta luego mundo")
            }



        }
    }
}
@Preview
@Composable
fun ColumnaPreview(){
    ColumnaNumeros(1,25)
}
@Composable
fun ColumnaNumeros(incio : Int, final : Int){
    Column {
        for(i in incio..final){
            Text("$i")
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjemploComposeTheme {
        Greeting("Android")
    }
}