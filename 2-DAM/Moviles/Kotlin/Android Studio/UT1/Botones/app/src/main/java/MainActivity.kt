import android.R.attr.onClick
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.R
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.botones.ui.theme.BotonesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BotonesTheme {
//                HomeScreen(
//                    "Botones en compose",
//                    "Guardar",
//                    "Cancelar",
//                    "Mas informacion"
//                )

                // PanelAction()
                Pulsaciones()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen(
        "BOTONES EN COMPOSE",
        "Guardar",
        "Cancelar",
        "Mas informacion"
    )
}

@Preview(showBackground = true)
@Composable
fun PanelActionPreview() {
    PanelAction()
}

@Preview(showBackground = true)
@Composable
fun PulsacionesPreview() {
    Pulsaciones()
}

@Composable
fun HomeScreen(
    title: String,
    btnRelleno: String,
    btn: String,
    textBtn: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = title, fontWeight = FontWeight.Bold, fontSize = 24.sp)
        Spacer(modifier.padding(16.dp))
        Button(
            onClick = {},
            shape = RoundedCornerShape(16.dp),
            modifier = modifier
                .padding(32.dp)
                .width(170.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            ),
        ) {
            Text(
                text = btnRelleno, color = Color.White
            )
        }
        Spacer(modifier.padding(8.dp))
        OutlinedButton(
            onClick = {},
            shape = RoundedCornerShape(12.dp),
            modifier = modifier
                .padding(16.dp)
                .width(170.dp)
                .border(color = Color.Blue, width = 2.dp, shape = RoundedCornerShape(12.dp))
                .height(40.dp),
        ) {
            Text(text = btn, color = Color.Blue)
        }
        Spacer(modifier.padding(8.dp))
        TextButton(
            onClick = {},
            shape = RoundedCornerShape(12.dp),
            modifier = modifier
                .padding(16.dp)
                .width(170.dp)
                .height(40.dp),
        ) {
            Text(text = textBtn, color = Color.Blue)

        }

    }
}

@Composable
fun PanelAction(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(top = 50.dp, start = 16.dp, end = 16.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "EDITAR PERFIL",
            fontWeight = FontWeight.Black,
            fontSize = 40.sp
        )
        Spacer(modifier.padding(36.dp))
        Button(
            onClick = {},
            modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(60.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            ),
        ) {
            Text(text = "GUARDAR CAMBIOS")

        }
        Spacer(modifier.padding(4.dp))
        Row(modifier.fillMaxWidth()) {
            OutlinedButton(

                onClick = {},
                modifier
                    .weight(0.5f)
                    .padding(4.dp),
                border = BorderStroke(2.dp, Color.Blue),
                shape = RoundedCornerShape(6.dp)
            ) {
                Text("CANCELAR", color = Color.Blue)
            }
            OutlinedButton(
                onClick = {},
                modifier
                    .weight(0.5f)
                    .padding(4.dp),
                border = BorderStroke(2.dp, Color.Red),
                shape = RoundedCornerShape(6.dp)
            ) {
                Text("BORRAR", color = Color.Red)
            }

        }
        Spacer(modifier.padding(8.dp))
        Button(
            onClick = {},

            modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(60.dp),

            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray
            ),
            enabled = false
        ) {
            Text(text = "NO DISPONIBLE")

        }

    }
}

@Composable
fun Pulsaciones(modifier: Modifier = Modifier) {
    var pulsaciones by remember { mutableIntStateOf(0) }
    Column(
        modifier
            .fillMaxSize()
            .padding(top = 96.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "CONTADOR",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier.padding(8.dp))
        Text(
            text = "Pulsaciones: $pulsaciones",
            fontSize = 24.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )
        Spacer(modifier.padding(8.dp))
        Button(
            onClick = { pulsaciones++ }, modifier
                .width(300.dp)
                .height(48.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            )
        ) {
            Text(text = "SUMAR +1 ")
        }
        Spacer(modifier.padding(6.dp))
        OutlinedButton(
            onClick = { pulsaciones = 0 },
            modifier
                .width(300.dp)
                .height(48.dp)
                .border(
                    2.dp, Color.Blue,
                    RoundedCornerShape(8.dp)
                ),
            shape = RoundedCornerShape(8.dp),
        ) {

            Text(text = "REINICIAR")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComparacionBotonesPreview() {
    ComparacionBotones()
}

@Composable
fun ComparacionBotones(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(4.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "TIPOS DE BOTONES",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Button(
            onClick = {},
            modifier = modifier.padding(4.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            )
        ) {
            Text(text = "ACCION PRINCIPAL")
        }
        ElevatedButton(
            onClick = {},
            modifier = modifier.padding(4.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFB3E5FC)
            )

        ) {
            Text(
                text = "BOTON ELEVADA",
                color = Color.Blue,
                fontWeight = FontWeight.Black
            )
        }
        FilledTonalButton(
            onClick = {},
            modifier = modifier.padding(4.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF9C27B0)
            )
        ) {
            Text(
                "ACCION SECUNDARIA",
                color = Color(0xFFE1BEE7)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AboutMyProfilePreview() {
    AboutMyProfile()
}

@Composable
fun AboutMyProfile(modifier: Modifier = Modifier) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("MI PERFIL")
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Editar perfil",
                    tint = MaterialTheme.colorScheme.primary
                )

            }
            Text("Editar")
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Editar perfil",
                    tint = MaterialTheme.colorScheme.primary
                )

            }
            Text("Favorito")
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Editar perfil",
                    tint = MaterialTheme.colorScheme.primary
                )

            }
            Text("Borrar")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManager()
}

@Composable
fun TaskManager() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Mis tareas")
        LazyColumn() {
            item {
                Row() {
                    Box(
                        modifier = Modifier
                            .size(18.dp)
                            .border(
                                width = 2.dp,
                                color = Color(0xFF636A89), // Color gris azulado del borde
                                shape = CircleShape
                            )
                    )
                    Spacer(Modifier.padding(4.dp))
                    Text("Preparar practica de compose")

                }
                Spacer(Modifier.padding(4.dp))
            }
            item {
                Row() {
                    Box(
                        modifier = Modifier
                            .size(18.dp)
                            .border(
                                width = 2.dp,
                                color = Color(0xFF636A89), // Color gris azulado del borde
                                shape = CircleShape
                            )
                    )
                    Spacer(Modifier.padding(4.dp))
                    Text("Corregir ejercicios")
                }
                Spacer(Modifier.padding(4.dp))


            }
            item {
                Row() {
                    Box(
                        modifier = Modifier
                            .size(18.dp)
                            .border(
                                width = 2.dp,
                                color = Color(0xFF636A89), // Color gris azulado del borde
                                shape = CircleShape
                            )
                    )
                    Spacer(Modifier.padding(4.dp))
                    Text("Subir material al aula virtual")
                }
                Spacer(Modifier.padding(4.dp))

            }
        }
        FloatingActionButton(
            onClick = { /* Acción para añadir tarea */ },
            containerColor = Color(0xFF5B3DE6), // Color morado/violeta del botón
            contentColor = Color.White,
            shape = CircleShape,
            elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 6.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Agregar tarea",
                modifier = Modifier.size(28.dp)
            )
        }
    }

}

