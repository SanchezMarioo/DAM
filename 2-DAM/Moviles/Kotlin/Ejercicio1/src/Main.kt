fun main() {
    println("Dime el nombre del que reserva: ")
    val nombreReserva = readln()
    println("Dime el numero de viajeros: ")
    val numeroViajeros = readln().toInt()
    println("DIme el precio por persona")
    val precioPersona = readln().toInt()
    println("El precio total es: ${numeroViajeros * precioPersona}€")
}