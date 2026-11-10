package com.example.examen

data class Habito(
    val id : Int,
    val nombre : String,
    val categoria : Categoria,
    val descripcion : String,
    val realizado : Boolean = false
)
