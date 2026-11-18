package com.example.codigo_secreto.Logica

import android.util.Log
import com.example.codigo_secreto.Modelo.EstadosPantalla

fun actualizarIndicador(
    valor: String,
    onChangeValue: (String) -> Unit
) {
    val contador = valor.length

    when (contador) {
        1 -> onChangeValue("*---")
        2 -> onChangeValue("**--")
        3 -> onChangeValue("***-")
        4 -> onChangeValue("****")
        else -> onChangeValue("----")
    }
}

fun cambiarPantalla(valor: String, onChangeValue: (EstadosPantalla) -> Unit) {
    when (valor) {
        "0000" -> onChangeValue(EstadosPantalla.PANTALLAPRIMERA)
        "1111" -> onChangeValue(EstadosPantalla.PANTALLASEGUNDA)
        else -> onChangeValue(EstadosPantalla.SIN_CAMBIO)
    }
}

fun cambiarTextoUnicode(texto: String) : String {
    var textoCambiado : String = ""
    for (letra in texto) {
        var codigoUnicode : Char = letra.toChar()
        codigoUnicode += 1
        textoCambiado += codigoUnicode
    }
    return textoCambiado
}