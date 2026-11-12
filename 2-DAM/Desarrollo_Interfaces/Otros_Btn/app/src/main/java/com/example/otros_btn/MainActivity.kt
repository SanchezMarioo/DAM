package com.example.otros_btn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.otros_btn.ui.theme.Otros_BtnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Otros_BtnTheme {
                // Descomenta el que quieras ejecutar en el emulador:
                Ejercicio1()
                // Ejercicio2()
                // Ejercicio3()
                // RetoVoluntario()
            }
        }
    }
}

@Composable
fun Ejercicio1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("TIPOS DE BOTÓN")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { }) {
            Text("ACCIÓN PRINCIPAL")
        }

        Spacer(modifier = Modifier.height(16.dp))

        ElevatedButton(onClick = { }) {
            Text("BOTÓN ELEVADO")
        }

        Spacer(modifier = Modifier.height(16.dp))

        FilledTonalButton(onClick = { }) {
            Text("ACCIÓN SECUNDARIA")
        }
    }
}

@Preview(showBackground = true, name = "Ejercicio 1")
@Composable
fun Ejercicio1Preview() {
    Otros_BtnTheme {
        Ejercicio1()
    }
}

@Composable
fun Ejercicio2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("MI PERFIL")

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Editar perfil"
                    )
                }
                Text("Editar")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Favorito"
                    )
                }
                Text("Favorito")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Borrar",
                        tint = Color.Red
                    )
                }
                Text("Borrar", color = Color.Red)
            }
        }
    }
}

@Preview(showBackground = true, name = "Ejercicio 2")
@Composable
fun Ejercicio2Preview() {
    Otros_BtnTheme {
        Ejercicio2()
    }
}

@Composable
fun Ejercicio3() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Añadir tarea"
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(24.dp)
        ) {
            Text("MIS TAREAS")
            Spacer(modifier = Modifier.height(16.dp))
            Text("• Preparar práctica de Compose")
            Spacer(modifier = Modifier.height(8.dp))
            Text("• Corregir ejercicios")
            Spacer(modifier = Modifier.height(8.dp))
            Text("• Subir material al aula virtual")
        }
    }
}

@Preview(showBackground = true, name = "Ejercicio 3")
@Composable
fun Ejercicio3Preview() {
    Otros_BtnTheme {
        Ejercicio3()
    }
}

@Composable
fun RetoVoluntario() {
    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Añadir tarea"
                    )
                },
                text = {
                    Text("NUEVA TAREA")
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(24.dp)
        ) {
            Text("MIS TAREAS")
            Spacer(modifier = Modifier.height(16.dp))
            Text("• Preparar práctica de Compose")
            Spacer(modifier = Modifier.height(8.dp))
            Text("• Corregir ejercicios")
            Spacer(modifier = Modifier.height(8.dp))
            Text("• Subir material al aula virtual")
        }
    }
}

@Preview(showBackground = true, name = "Reto Voluntario")
@Composable
fun RetoVoluntarioPreview() {
    Otros_BtnTheme {
        RetoVoluntario()
    }
}
