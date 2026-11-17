package com.example.codigo_secreto.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codigo_secreto.Modelo.EstadosPantalla
import com.example.codigo_secreto.R
import com.example.codigo_secreto.Logica.actualizarIndicador
import com.example.codigo_secreto.Logica.cambiarPantalla
import com.example.codigo_secreto.ui.theme.BotonNumerico
import com.example.codigo_secreto.ui.theme.FondoPrincipal
import com.example.codigo_secreto.ui.theme.FondoSecundario
import com.example.codigo_secreto.ui.theme.TextoPrincipal

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(modifier: Modifier = Modifier, title: String = stringResource(R.string.app_name)) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = FondoPrincipal,
            titleContentColor = TextoPrincipal,
        ),
        title = {
            Text(title)
        }
    )
}

@Composable
fun InputTexto(
    nombre: String,
    onCambioValor: (String) -> Unit,
    isError: Boolean
) {
    TextField(
        value = nombre,
        onValueChange = onCambioValor,
        Modifier.background(FondoSecundario),
        label = { Text(stringResource(R.string.lbl_campo_txt)) },
        isError = isError
    )
}

@Composable
fun TecladoNumero(
    codigo: String,
    textoInput : String,
    onCodigoChange: (String) -> Unit,
    onCifradoChange: (String) -> Unit,
    onPantallaChange: (EstadosPantalla) -> Unit,
    onTextoChange : (String) -> Unit
) {
    val numeros = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    fun agregarDigito(digito: String) {
        if (codigo.length < 4) {
            val codigoNuevo = codigo + digito
            if (codigoNuevo.length == 4 && textoInput.trim().isEmpty()) {
                onCodigoChange("")
                onCifradoChange("----")
//                onPantallaChange(EstadosPantalla.SIN_CAMBIO)
            } else {
                onCodigoChange(codigoNuevo)
                actualizarIndicador(codigoNuevo, onCifradoChange)
                if (codigoNuevo.length == 4) {
                    cambiarPantalla(codigoNuevo, onPantallaChange)
                    onCodigoChange("")
                    onCifradoChange("----")
                    onTextoChange("")
                }
            }
        }
    }

    fun eliminarDigito() {
        if (codigo.isNotBlank()) {
            val codigoNuevo = codigo.substring(0, codigo.length - 1)
            onCodigoChange(codigoNuevo)
            actualizarIndicador(codigoNuevo, onCifradoChange)
        }
    }

    fun limpiarDigitos() {
        if (codigo.isNotBlank()) {
            val codigoNuevo = ""
            onCodigoChange(codigoNuevo)
            actualizarIndicador(codigoNuevo, onCifradoChange)
        }
    }
    Column() {
        for (i in 0..2) {
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                for (j in 0..2) {
                    BotonTeclado(
                        numero = numeros[i][j].toString(),
                        onClick = { agregarDigito(numeros[i][j].toString()) }
                    )
                }
            }
        }
        Row() {
            BotonTeclado(numero = "C", onClick = { eliminarDigito() })
            BotonTeclado(numero = "0", onClick = { agregarDigito("0") })
            BotonTeclado(numero = "CE", onClick = { limpiarDigitos() })
        }
    }
}

@Composable
fun BotonTeclado(numero: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .size(80.dp)
            .padding(5.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = BotonNumerico,
            contentColor = TextoPrincipal
        ),


    )
    {
        Text(numero, fontSize = 14.sp)
    }
}





