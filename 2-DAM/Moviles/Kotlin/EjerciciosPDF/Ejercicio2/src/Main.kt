fun main() {
    val listaTemperaturas = listOf<Int>(15, 22, 35, 10, 28, 40)
    val esAgradable = { temperatura: Int -> temperatura > 20 && temperatura < 30 }
    val listaTemperaturasAgradable = listaTemperaturas.filter(esAgradable)
    println(listaTemperaturasAgradable)
}