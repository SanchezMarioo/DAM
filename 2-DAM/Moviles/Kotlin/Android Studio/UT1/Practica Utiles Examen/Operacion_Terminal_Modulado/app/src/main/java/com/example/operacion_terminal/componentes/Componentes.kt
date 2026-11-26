package com.example.operacion_terminal.componentes


import android.content.Context
import android.util.Log.i
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.operacion_terminal.R
import com.example.operacion_terminal.logica.agregarDigito
import com.example.operacion_terminal.logica.borrarDigito
import com.example.operacion_terminal.logica.borrarTodosDigitos
import com.example.operacion_terminal.logica.cambiarPantalla
import com.example.operacion_terminal.modelo.EstadoPantalla

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(modifier: Modifier = Modifier, title: String = stringResource(R.string.app_name)) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
        ),
        title = {
            Text(title)
        }
    )
}

@Composable
fun TecladoNumero(
    context: Context,
    valorDescrifado: String,
    valorCifrado: String,
    mensaje: String,
    onValueDescrifado: (String) -> Unit,
    onValueCifrado: (String) -> Unit,
    onValueMensaje: (String) -> Unit
) {
    val matriz = arrayOf(
        arrayOf("1", "2", "3"),
        arrayOf("4", "5", "6"),
        arrayOf("7", "8", "9"),
    )
    Column() {
        for (i in 0..2) {
            Row() {
                for (j in 0..2) {
                    Button(
                        onClick = {
                            agregarDigito(
                                context,
                                mensaje,
                                valorDescrifado,
                                valorCifrado,
                                onValueDescrifado,
                                onValueCifrado,
                                onValueMensaje,
                                matriz[i][j]
                            )
                            // Asi
//                            cambiarPantalla(
//                                context,
//                                mensaje,
//                                nuevoValor, // <-- ¡Pasas nuevoValor en vez de valorDescrifado!
//                                onValueDescrifado,
//                                onValueCifrado,
//                                onValueMensaje
//                            )

                        }, modifier = Modifier.padding(5.dp)
                    ) {
                        Text(matriz[i][j])
                    }
                }
            }

        }
        Row() {
            Button(
                onClick = {

                    borrarDigito(
                        valorDescrifado,
                        valorCifrado,
                        onValueDescrifado,
                        onValueCifrado,
                    )
                }, modifier = Modifier.padding(5.dp)
            ) {
                Text("C")
            }
            Button(
                onClick = {
                    agregarDigito(
                        context,
                        mensaje,
                        valorDescrifado,
                        valorCifrado,
                        onValueDescrifado,
                        onValueCifrado,
                        onValueMensaje,
                        "0"
                    )

                }, modifier = Modifier.padding(5.dp)
            ) {
                Text("0")
            }
            Button(
                onClick = {
                    borrarTodosDigitos(
                        valorDescrifado,
                        valorCifrado,
                        onValueDescrifado,
                        onValueCifrado,
                    )
                }, modifier = Modifier.padding(5.dp)
            ) {
                Text("CE")
            }
        }
    }


}