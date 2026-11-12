package com.example.formulariovalidacion

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.formulariovalidacion.ui.theme.FormularioValidacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FormularioValidacionTheme {
                PantallaPrincipal(activity = this@MainActivity)
            }
        }
    }
}


@Composable
fun PantallaPrincipal(modifier: Modifier = Modifier, activity: MainActivity) {
    var user by remember { mutableStateOf("") }
    var onErrorUser by remember { mutableStateOf(false) }
    var password by remember { mutableStateOf("") }
    var onErrorPasswd by remember { mutableStateOf(false) }
    var city by remember { mutableStateOf("") }
    var onErrorCity by remember { mutableStateOf(false) }
    val ciudades = stringArrayResource(R.array.cities)
    var esAdmin by remember { mutableStateOf(false) }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CampoFormulario(
            user, { user = it }, "Usuario", onErrorUser
        )
        Spacer(Modifier.padding(16.dp))
        CampoFormularioPasswd(
            password, { password = it }, "Contraseña", onErrorPasswd
        )
        Spacer(Modifier.padding(16.dp))
        CampoFormulario(
            city, { city = it }, "Ciudad", onErrorCity
        )
        Switch(
            checked = esAdmin,
            onCheckedChange = {
                esAdmin = it
            }
        )
        Button(
            onClick = {

                val formularioEsValido = esValido(
                    user = user,
                    onErrorUser = { onErrorUser = it }, // Pasamos la acción de modificar el estado
                    password = password,
                    onErrorPassword = { onErrorPasswd = it },
                    ciudad = city,
                    onErrorCiudad = { onErrorCity = it },
                    ciudades = ciudades
                )
                Log.d("FORM", "$formularioEsValido")
                if(formularioEsValido){
                    cambiarActivity(user,activity,esAdmin)
                }
                Log.d("ADMIN", "$esAdmin")
            },
        ) {
            Text("Comprobar")
        }

    }
}

fun cambiarActivity(name: String, activity: MainActivity, esAdmin : Boolean) {
    val intent = Intent(activity, SegundaActividad::class.java)
    intent.putExtra("nombre", name)
    intent.putExtra("admin", esAdmin)
    activity.startActivity(intent)
}

fun esValido(
    user: String,
    onErrorUser: (Boolean) -> Unit,
    password: String,
    onErrorPassword: (Boolean) -> Unit,
    ciudad: String,
    onErrorCiudad: (Boolean) -> Unit,
    ciudades: Array<String>
): Boolean {
    val comprobacionUsuario = user.trim().length < 6
    val comprobacionPasswd= password.length != 4
    val comprobacionCiudad = ciudades.indexOf(ciudad) == -1
    onErrorUser(comprobacionUsuario)
    onErrorPassword(comprobacionPasswd)
    onErrorCiudad(comprobacionCiudad)
    if(!comprobacionUsuario && !comprobacionPasswd && !comprobacionCiudad){
        return true
    }
    return false
}

@Composable
fun CampoFormulario(
    valor: String, onValueCambiar: (String) -> Unit, etiqueta: String, error: Boolean
) {
    TextField(
        value = valor,
        onValueChange = onValueCambiar,
        isError = error,
        label = { Text(etiqueta) },
    )
}

@Composable
fun CampoFormularioPasswd(
    valor: String, onValueCambiar: (String) -> Unit, etiqueta: String, error: Boolean
) {
    var valorNuevo = valor
    TextField(
        value = valorNuevo.take(4),
        onValueChange = { nuevoTexto ->
            onValueCambiar(nuevoTexto.take(4))
        },
        visualTransformation = VisualTransformation({ cambiarContraseña(valor) }),
        isError = error,

        label = { Text(etiqueta) },
        keyboardOptions =
            KeyboardOptions(keyboardType = KeyboardType.NumberPassword)
    )


}

fun cambiarContraseña(text: String): TransformedText {
    return TransformedText(
        AnnotatedString("*".repeat(text.length)),
        OffsetMapping.Identity,
    )
}



