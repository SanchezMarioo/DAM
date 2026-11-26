package com.example.operacion_terminal.logica

import android.content.Context
import android.content.Intent
import android.nfc.Tag
import android.util.Log
import android.util.Log.v
import com.example.operacion_terminal.actitity.MainActivity
import com.example.operacion_terminal.utils.ALFA_PANTALLA
import com.example.operacion_terminal.utils.ALFA_PIN
import com.example.operacion_terminal.utils.BETA_PANTALLA
import com.example.operacion_terminal.utils.BETA_PIN

fun agregarDigito(
    context: Context,
    mensaje: String,
    valorDescrifado: String,
    valorCifrado: String,
    onValueDescrifado: (String) -> Unit,
    onValueCifrado: (String) -> Unit,
    onValueMensaje: (String) -> Unit,
    teclaPulsada: String
) {
    if (valorDescrifado.length < 4) {
        var valor = valorDescrifado + teclaPulsada
        onValueDescrifado(valor)
        val longitud = valor.length
        actualizarContador(longitud, onValueCifrado)
        // Se hace asi por que no se actualiza la variable hasta que NO se acabe la accion de click
        if (valor.length == 4) {
            if (mensaje.isBlank()) {
                onValueDescrifado("")
                onValueCifrado("----")
                onValueMensaje("")
            } else {
                cambiarPantalla(
                    context = context,
                    mensaje = mensaje,
                    valorDescrifado = valor,
                    valorCifrado = valorCifrado,// Usamos el nuevo valor recién creado
                    onValueDescrifado = onValueDescrifado,
                    onValueCifrado = onValueCifrado,
                    onTextoCambiar = onValueMensaje
                )
                onValueDescrifado("")
                onValueCifrado("----")
                onValueMensaje("")
            }


        }

    }

}


fun actualizarContador(longitud: Int, onValueCifrado: (String) -> Unit) {
    when (longitud) {
        1 -> onValueCifrado("*---")
        2 -> onValueCifrado("**--")
        3 -> onValueCifrado("***-")
        4 -> onValueCifrado("****")
        else -> onValueCifrado("----")
    }
}

fun borrarDigito(
    valorDescrifado: String,
    valorCifrado: String,
    onValueDescrifado: (String) -> Unit,
    onValueCifrado: (String) -> Unit,

    ) {

    if (valorDescrifado.isNotBlank()) {
        val codigoDescrifado = valorDescrifado.substring(0, valorDescrifado.length - 1)
        val longitud = codigoDescrifado.length
        onValueDescrifado(codigoDescrifado)
        actualizarContador(longitud, onValueCifrado)
    }
}

fun cambiarPantalla(
    context: Context,
    mensaje: String,
    valorDescrifado: String,
    valorCifrado: String,
    onValueDescrifado: (String) -> Unit,
    onValueCifrado: (String) -> Unit,
    onTextoCambiar: (String) -> Unit
) {
    if (valorDescrifado.length == 4) {
        if (valorDescrifado.equals(ALFA_PIN)) {
            cambiarActivity(
                mensaje = mensaje,
                clase = ALFA_PANTALLA,
                context = context
            )

        } else if (valorDescrifado.equals(BETA_PIN)) {
            cambiarActivity(
                mensaje = mensaje,
                clase = BETA_PANTALLA,
                context = context
            )
        }

    }

}

fun borrarTodosDigitos(
    valorDescrifado: String,
    valorCifrado: String,
    onValueDescrifado: (String) -> Unit,
    onValueCifrado: (String) -> Unit,

    ) {
    if (valorDescrifado.isNotBlank()) {
        onValueCifrado("----")
        onValueDescrifado("")
    }
}

fun cambiarActivity(context: Context, mensaje: String, clase: Class<*>) {
    val intent = Intent(context, clase)
    intent.putExtra("texto", mensaje)
    context.startActivity(intent)
}
