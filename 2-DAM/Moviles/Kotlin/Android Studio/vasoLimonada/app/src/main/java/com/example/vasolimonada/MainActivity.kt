package com.example.vasolimonada

import android.R.attr.enabled
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.vasolimonada.ui.theme.VasoLimonadaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VasoLimonadaTheme {
                LimonadaTopAppBar()
                HomeScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LimonadaTopAppBar(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Limonada",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color.Black
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
                modifier = modifier.fillMaxWidth()
            )
        }
    )
    { innerPadding ->
        Surface(Modifier.padding(innerPadding)) {
            Column() {
                HomeScreen()
            }
        }
    }
}


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var contador by remember { mutableStateOf(0) }
    var lemonRandom by remember { mutableStateOf(0) }
    var randomLemon by remember { mutableStateOf((2..4).random()) }
    var imagen = when (contador) {
        0 -> R.drawable.lemon_tree
        in 1..randomLemon -> R.drawable.lemon_squeeze
        randomLemon + 1 -> R.drawable.lemon_drink
        randomLemon + 2 -> R.drawable.lemon_restart
        else -> R.drawable.lemon_restart
    }
    var texto = when (contador) {
        0 -> R.string.lemon_tree_description
        in 1..randomLemon -> R.string.lemon_squeeze_description
        randomLemon + 1 -> R.string.lemon_drink_description
        randomLemon + 2 -> R.string.lemon_restart_description
        else -> R.string.lemon_restart_description
    }

    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = imagen),
            contentDescription = null,
            modifier = Modifier.clickable {
                when (contador) {
                    0 -> contador = 1
                    in 1..randomLemon -> contador++
                    randomLemon + 1 -> contador++
                    randomLemon + 2 -> contador++
                }
            }
        )
        Spacer(Modifier.padding(17.dp))
        Text(text = stringResource(texto))

    }
}
}

