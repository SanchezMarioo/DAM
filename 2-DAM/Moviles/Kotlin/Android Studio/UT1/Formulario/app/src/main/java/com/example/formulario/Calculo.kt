package com.example.formulario

class Calculo(val cantidadFinal: Double, val iva: Double) {
    fun calcularIVA(): Double {
        return cantidadFinal * iva / 100
    }

    fun calcularBaseImponible(): Double {
        return cantidadFinal * (1 - (iva/100))
    }
}