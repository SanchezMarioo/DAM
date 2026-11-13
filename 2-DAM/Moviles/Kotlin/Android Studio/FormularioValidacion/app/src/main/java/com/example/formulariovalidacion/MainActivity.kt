package com.example.formulariovalidacion

import android.R.attr.label
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
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
    fun cambiarActivity(name: String, esAdmin: Boolean) {
        val intent = Intent(this, SegundaActividad::class.java)
        intent.putExtra("nombre", name)
        intent.putExtra("admin", esAdmin)
        startActivity(intent)
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
        Spacer(Modifier.padding(16.dp))

        Row(
            modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Admin?: ")
            Switch(
                checked = esAdmin,
                onCheckedChange = {
                    esAdmin = it
                }
            )
        }
        Spacer(Modifier.padding(16.dp))

        Button(
            onClick = {
                val formularioEsValido = esValido(
                    user = user,
                    onErrorUser = { onErrorUser = it },
                    password = password,
                    onErrorPassword = { onErrorPasswd = it },
                    ciudad = city,
                    onErrorCiudad = { onErrorCity = it },
                    ciudades = ciudades
                )
                if (formularioEsValido) {
                    activity.cambiarActivity(user, esAdmin)
                }
            },
        ) {
            Text("Comprobar")
        }

    }
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
    var comprobacionPasswd = password.length != 4
    for(i in password){
        if(!i.isDigit()){
            comprobacionPasswd = true
        }
    }
    val comprobacionCiudad = ciudades.indexOf(ciudad) == -1
    onErrorUser(comprobacionUsuario)
    onErrorPassword(comprobacionPasswd)
    onErrorCiudad(comprobacionCiudad)
    if (!comprobacionUsuario && !comprobacionPasswd && !comprobacionCiudad) {
        return true
    }
    return false
}

@Composable
fun CampoFormulario(
    valor: String,
    onValueCambiar: (String) -> Unit,
    etiqueta: String,
    error: Boolean
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
    valor: String, onValueCambiar: (String) -> Unit,
    etiqueta: String,
    error: Boolean
) {
    var valorNuevo = valor
    TextField(
        value = valorNuevo,
        onValueChange = { nuevoTexto ->
            onValueCambiar(nuevoTexto.take(4))
        },
        visualTransformation = PasswordVisualTransformation('*'),
        isError = error,

        label = { Text(etiqueta) },
        keyboardOptions =
            KeyboardOptions(keyboardType = KeyboardType.NumberPassword)
    )


}


