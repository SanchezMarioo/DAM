fun main() {
    val numerosLoteria = mutableSetOf<Int>()
    println("------------ SORTEO LOTERIA -----------------")
    println("Porfavor introduzca 6 numero entre 0 y 50 ambos incluidos")
    println("----------------------------------------------------------")
    while (numerosLoteria.size < 6) {
        var numero = 0;
        try {
            print("Dime el numero ${numerosLoteria.size + 1}: ")
            numero = readln().toInt()
            if (numero !in 0..50) {
                println("El numero $numero debe de estar entre 0 y 50.")
                continue
            }
            numerosLoteria.add(numero);
        } catch (e: NumberFormatException) {
            println(e.toString())
        }
    }
    println()
    println("Boleto completado. Tus numeros de loteria son: ")
    println(numerosLoteria.joinToString(separator = " * "))

}