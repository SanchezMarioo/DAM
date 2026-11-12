package com.example.chat

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chat.ui.theme.ChatTheme

// -------------------------------------------------------------
// 4. Data class para representar cada mensaje
// -------------------------------------------------------------
data class Mensaje(
    val autor: String,
    val texto: String
)

// Lista de mensajes de ejemplo para la conversación (al menos 5 mensajes)
val mensajesEjemplo = listOf(
    Mensaje(
        autor = "Laura",
        texto = "¡Hola a todos! ¿Qué tal ha ido la clase de hoy? ¿Pudisteis entender bien la parte de estado y recomposición en Jetpack Compose?"
    ),
    Mensaje(
        autor = "Mario",
        texto = "Ya terminé la práctica de Compose. Me ha costado un poco al principio, pero al ver cómo se gestionan las animaciones con animateContentSize y animateColorAsState todo tiene mucho más sentido."
    ),
    Mensaje(
        autor = "Ana",
        texto = "Mañana llevo el proyecto completo a clase para resolver un par de dudas con el profesor antes de hacer la entrega final."
    ),
    Mensaje(
        autor = "Pedro",
        texto = "¿Nos vemos mañana por la mañana en la cafetería antes de entrar a clase para repasar las preguntas teóricas del cuestionario?"
    ),
    Mensaje(
        autor = "Sara",
        texto = "Acabo de subir mi versión del ejercicio al repositorio compartido para que podáis revisarla cuando tengáis un momento libre."
    ),
    Mensaje(
        autor = "Carlos",
        texto = "¡Perfecto Sara! Lo descargo esta tarde en cuanto llegue a casa y le echo un vistazo rápido."
    ),
    Mensaje(
        autor = "Elena",
        texto = "Recordad que la fecha límite de entrega es este viernes a las 23:59. ¡Mucho ánimo a todos con la práctica!"
    )
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChatTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallaMensajes(
                        mensajes = mensajesEjemplo,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TarjetaMensaje(
    mensaje: Mensaje,
    modifier: Modifier = Modifier
) {
    var expandido by remember { mutableStateOf(false) }

    val colorFondo by animateColorAsState(
        targetValue = if (expandido) {
            MaterialTheme.colorScheme.primaryContainer
        } else {
            MaterialTheme.colorScheme.surface
        },
        label = "colorMensaje"
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = 8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Foto de perfil de ${mensaje.autor}",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(
            modifier = Modifier.clickable {
                expandido = !expandido
            }
        ) {
            Text(
                text = mensaje.autor,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleSmall
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Superficie contenedora del mensaje con sombra y forma del tema
            Surface(
                shape = MaterialTheme.shapes.medium,
                shadowElevation = 2.dp,
                color = colorFondo,
                modifier = Modifier
                    .animateContentSize()
                    .padding(1.dp)
            ) {
                // Texto del mensaje con maxLines condicional según el estado
                Text(
                    text = mensaje.texto,
                    modifier = Modifier.padding(all = 12.dp),
                    maxLines = if (expandido) Int.MAX_VALUE else 1,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun PantallaMensajes(
    mensajes: List<Mensaje>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp, vertical = 8.dp)
    ) {
        // Título de la pantalla
        Text(
            text = "MIS MENSAJES",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(start = 8.dp, top = 8.dp, bottom = 12.dp)
        )

        // Lista perezosa (LazyColumn) que genera las tarjetas bajo demanda
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(mensajes) { mensaje ->
                TarjetaMensaje(mensaje = mensaje)
            }
        }
    }
}

@Preview(showBackground = true, name = "Ejercicio 1 - Tarjeta Individual")
@Composable
fun TarjetaMensajePreview() {
    ChatTheme {
        TarjetaMensaje(
            mensaje = Mensaje(
                autor = "Laura",
                texto = "Hola, ¿qué tal estás? Este es un mensaje de prueba para verificar el aspecto del componente."
            )
        )
    }
}

@Preview(showBackground = true, name = "Modo Claro")
@Composable
fun PreviewClaro() {
    ChatTheme {
        PantallaMensajes(mensajes = mensajesEjemplo)
    }
}


@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Modo Oscuro"
)
@Composable
fun PreviewOscuro() {
    ChatTheme {
        PantallaMensajes(mensajes = mensajesEjemplo)
    }
}
