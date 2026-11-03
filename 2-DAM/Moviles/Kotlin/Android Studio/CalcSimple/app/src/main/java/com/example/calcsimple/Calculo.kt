package com.example.calcsimple

class Calculo(var num1 : Double, var num2 : Double) {
    fun sumar() : Double{
        return num1 + num2
    }
    fun resta() : Double{
        return num1 - num2
    }
    fun multi() : Double{
        return num1 * num2
    }
    fun divi() : Double{
        return num1 / num2
    }
}