fun main() {
    val numerosLoteria = mutableListOf<Int>()
    var i = 0;
    println("------------ SORTEO LOTERIA -----------------")
    println("Porfavor introduzca 6 numero entre 0 y 50 ambos incluidos")
    println("----------------------------------------------------------")
    while (numerosLoteria.size < 6) {
        var numero = 0;
        try {
            do {
                print("Dime el numero ${i + 1}: ")
                numero = readln().toInt()
                if (numero !in 0..50) {
                    println("El numero $numero debe de estar entre 0 y 50.")
                    continue
                }
                numerosLoteria.forEach {
                    if (numero == it) {
                        println("El numero $numero esta repetido.")
                        break;
                    }
                }
                numerosLoteria.add(numero);
                i++;
            } while ((numero !in 0..50))
        } catch (e: NumberFormatException) {
            println(e.toString())
        }
    }
    println()
    var j = 0;
    println("Boleto completado. Tus numeros de loteria son: ")
    numerosLoteria.forEach {
        j++;
        if (j < 6) {
            print("$it * ")
        } else {
            println("$it")
        }


    }
}