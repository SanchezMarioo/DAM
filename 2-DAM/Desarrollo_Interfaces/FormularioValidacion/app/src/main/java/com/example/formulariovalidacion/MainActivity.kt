package com.example.formulariovalidacion

import android.R.attr.password
import android.os.Bundle
import android.widget.AutoCompleteTextView
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.formulariovalidacion.ui.theme.FormularioValidacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FormularioValidacionTheme {
                PantallaPrincipal()

            }
        }
    }

    @Composable
    fun PantallaPrincipal() {
        var usuario by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var ciudadForm by remember { mutableStateOf("") }
        var admin by remember { mutableStateOf(false) }
        var onErrorUser by remember { mutableStateOf(false) }
        var onErrorPassword by remember { mutableStateOf(false) }
        var onErrorCity by remember { mutableStateOf(false) }

        val ciudades = resources.getStringArray(R.array.ciudad)
        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            Column(
                Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = usuario,
                    onValueChange = { nuevoMensaje ->
                        usuario = nuevoMensaje
                    },
                    label = { Text("Usuario") }, isError = onErrorUser,
                )
                TextField(
                    value = password, onValueChange = { nuevaPasswd ->
                        password = nuevaPasswd.take(4)
                    }, label = { Text("Password") }, isError = onErrorPassword,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword)
                )
                TextField(
                    value = ciudadForm, onValueChange = { nuevaCiudad ->
                        ciudadForm = nuevaCiudad
                    }, label = { Text("Ciudad") }, isError = onErrorCity
                )

                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                    Text("Admin")
                    Spacer(Modifier.padding(4.dp))
                    Switch(checked = admin, onCheckedChange = { nuevoAdmin ->
                        admin = nuevoAdmin
                    })
                }
                Button(onClick = {
                    comprobarForm(
                        user = usuario,
                        onErrorUser = { onErrorUser = it },
                        password = password,
                        onErrorPassword = { onErrorPassword = it },
                        ciudad = ciudadForm,
                        onErrorCiudad = { onErrorCity = it }
                    )
                }
                ) {
                    Text("Comprobar")
                }

            }
        }

    }

    fun comprobarForm(
        user: String,
        onErrorUser: (Boolean) -> Unit,
        password: String,
        onErrorPassword: (Boolean) -> Unit,
        ciudad: String,
        onErrorCiudad: (Boolean) -> Unit
    ) {
        if (user.length < 6) {
            onErrorUser(true)
        } else {
            onErrorUser(false)
        }
        if (password.length != 4) {
            onErrorPassword(true)
        } else {
            onErrorPassword(false)
        }
        val ciudades = resources.getStringArray(R.array.ciudad)
        for (ciudadLista in ciudades) {
            if (ciudadLista.equals(ciudad)){
                onErrorCiudad(true)
            }
        }
    }

}

