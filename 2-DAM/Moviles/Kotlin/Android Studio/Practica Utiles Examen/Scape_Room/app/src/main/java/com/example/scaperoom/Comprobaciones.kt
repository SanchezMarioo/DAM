package com.example.scaperoom

import androidx.core.text.isDigitsOnly

fun comprobarNombre (nombre : String) : Boolean{
    return nombre.length <= 5
}
fun comprobarEdad(edad : String) : Boolean{
    var edadTrans = edad.toIntOrNull() ?: 0
    return edadTrans !in 16..99
}
fun comprobarCodigo(codigo : String) : Boolean{

    return codigo.length != 4 && !codigo.isDigitsOnly()
}
fun comprobarSiPasa(nombre: String,edad: String,codigo: String) : Boolean{
    return comprobarNombre(nombre) && comprobarCodigo(codigo) && comprobarEdad(edad)
}