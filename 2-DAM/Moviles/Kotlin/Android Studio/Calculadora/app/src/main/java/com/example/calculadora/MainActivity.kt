package com.example.calculadora


import android.content.ContentValues.TAG
import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculadora.ui.theme.CalculadoraTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.example.calculadora.ui.theme.LightGray
import com.example.calculadora.ui.theme.Orange
import com.example.calculadora.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraTheme {
                CalculadoraApp()
            }
        }
    }
}


@Composable
fun CalculadoraApp(modifier: Modifier = Modifier) {
    Column(modifier.background(MaterialTheme.colorScheme.background)) {
        var numero by remember {
            mutableStateOf("")
        }
        ResultCalculator(numero = numero)
        RowNumber(onNumberClick = { nuevoNumero ->
            numero += nuevoNumero
        }
        )
    }

}


@Composable
fun ResultCalculator(modifier: Modifier = Modifier, numero: String = "") {
    var texto by remember { mutableStateOf("") }
    texto += numero
    Text(texto)
}


@Composable
fun RowNumber(
    modifier: Modifier = Modifier, onNumberClick: (String) -> Unit,
) {
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyRow() {
            item {
                ItemIconCalculator(R.drawable.backspace_icon, color = LightGray)
            }
            item {
                ItemIconCalculator(R.drawable.keyboard_backspace, color = LightGray)
            }
            item {
                ItemNumberCalculator("%", onNumberClick = onNumberClick)
            }
            item {
                ItemIconCalculator(R.drawable.division, color = Orange)
            }
        }
        LazyRow() {
            item {
                ItemNumberCalculator("7", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("8", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("9", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("x", color = Orange, onNumberClick = onNumberClick)
            }
        }
        LazyRow() {
            item {
                ItemNumberCalculator("4", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("5", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("6", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("-", color = Orange, onNumberClick = onNumberClick)
            }
        }

        LazyRow() {
            item {
                ItemNumberCalculator("1", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("2", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("3", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("+", color = Orange, onNumberClick = onNumberClick)
            }
        }
        LazyRow() {
            item {
                ItemNumberCalculator("", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("0", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator(",", onNumberClick = onNumberClick)
            }
            item {
                ItemNumberCalculator("=", color = Orange, onNumberClick = onNumberClick)
            }
        }
    }


}

@Composable
fun ItemIconCalculator(
    icon: Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    color: Color = Orange
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .size(70.dp)
            .padding(5.dp),
        contentPadding = PaddingValues(0.dp), // <- Quita el margen interno del botón (gemini) si no el size del icon no va
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            contentColor = MaterialTheme.colorScheme.onSurface
        ),
        shape = CircleShape
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = null,
            // Propiedad gemini
            modifier = Modifier.size(20.dp)

        )
    }
}

@Composable
fun ItemNumberCalculator(
    number: String,
    modifier: Modifier = Modifier,
    onNumberClick: (String) -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceVariant
){
    Button(
        onClick = {
            onNumberClick(number)
        },
        modifier = modifier
            .size(70.dp)
            .padding(5.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = MaterialTheme.colorScheme.onSurface
        ),
        shape = CircleShape,


        )
    {
        Text("$number")
    }
}

