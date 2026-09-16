fun main() {
    var opcion: Int
    val PRECIO_MADRID = 18
    val PRECIO_VALLADOLID = 14
    val PRECIO_ZAMORA = 12
    val PRECIO_AVILA = 10
    var numViajeros = 0;

    do {
        println("VENTA DE BILLETES: ")
        println("1. Madrid")
        println("2.Valladolid")
        println("3. Zamora")
        println("4. Avila")
        println("5. Salir")
        println("Elige una opcion: ")
        opcion = readln().toInt()

        if (opcion in 1..4) {
            println("Numero de viajeros: ")
            numViajeros = readln().toInt()
            while (numViajeros !in 1..10) {
                println("Opcion invalida.")
                println("Numero de viajeros: ")
                numViajeros = readln().toInt()
            }
        } else {
            continue;
        }

        println("RESUMEN DE LA RESERVA")
        println()
        when (opcion) {
            1 -> {
                println("Destino : Madrid ")
                println("Numero de viajeros : $numViajeros")
                println("Precio por persona : $PRECIO_MADRID")
                println("Precio total : ${numViajeros * PRECIO_MADRID}")
            }

            2 -> {
                println("Destino : Valladolid")
                println("Numero de viajeros : $numViajeros")
                println("Precio por persona : $PRECIO_VALLADOLID")

            }

            3 -> {
                println("Destino : Zamora ")
                println("Numero de viajeros : $numViajeros")
                println("Precio por persona : $PRECIO_VALLADOLID")
            }

            4 -> {
                println("Destino : Avila")
                println("Numero de viajeros : $numViajeros")
                println("Precio por persona : $PRECIO_AVILA")
            }
            5 -> println("Gracias por utilizar nuestro sistema de venta de billetes.")
            else -> println("Opcion invalida.")
        }
        println()
        println("Billete generados: ")
        println()
        for (i in 1..numViajeros) {
            println("Billete nº $i")
        }
        println()
    } while (opcion != 5)

}