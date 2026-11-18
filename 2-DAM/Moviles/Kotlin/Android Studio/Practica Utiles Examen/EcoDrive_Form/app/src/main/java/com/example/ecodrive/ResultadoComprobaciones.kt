package com.example.ecodrive

data class ResultadoComprobaciones(
    val nombreValido: Boolean = false,
    val dniValido: Boolean = false,
    val diasAlquiler: Boolean = false,
    val tipoVehiculoValido: Boolean = false,
)
