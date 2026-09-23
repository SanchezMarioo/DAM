fun main() {
    val palabras = listOf("sol", "computadora", "luz", "programacion", "gatos")
    val palabrasFiltradas = palabras.filter { palabra -> palabra.length >= 5 }
    println(palabrasFiltradas)
}

