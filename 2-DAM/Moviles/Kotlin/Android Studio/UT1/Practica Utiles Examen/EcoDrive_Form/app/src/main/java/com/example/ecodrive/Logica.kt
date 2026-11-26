package com.example.ecodrive

import androidx.core.text.isDigitsOnly

fun esValidoNombre(nombre: String): Boolean {
    return nombre.isBlank() || nombre.length < 3
}

fun comprobarDNI(dni: String): Boolean {
    return !dni.matches(REGEXP_DNI)
}

fun comprobarDiasAlquiler(numero: String): Boolean {
    val dias = numero.toIntOrNull() ?: return true
    return dias !in 1..30
}

fun comprobarTipoVehiculo(tipoVehiculo: String): Boolean {
    return tipoVehiculo.isNotBlank() && !tipoVehiculo.equals("Selecciona una opcion")
}
fun comprobarTodo(nombre: String, dni: String, numeroDiasAlquiler: String, tipoVehiculo: String ) : ResultadoComprobaciones {
    return ResultadoComprobaciones(
        esValidoNombre(nombre),
        comprobarDNI(dni),
        comprobarDiasAlquiler(numeroDiasAlquiler),
        comprobarTipoVehiculo(tipoVehiculo)
    )
}

