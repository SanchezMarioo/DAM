fun main() {
    var reservaHoteles = mutableListOf<Reserva>()
    var opt = 0;
    do {
        mostrarMenu()
        opt = pedirNumero("Escoge una opcion: ")
        funcionalidadMenu(opt, reservaHoteles)
    } while (opt != 6)

}

fun funcionalidadMenu(opt: Int, reservaHoteles: MutableList<Reserva>) {
    when (opt) {
        1 -> reservarHabitacion(reservaHoteles)
        2 -> mostrarReservas(reservaHoteles)
        3 -> buscarReservasPorCliente(reservaHoteles)
        4 -> buscarReservasMayores(reservaHoteles)
        5 -> duplicarReserva(reservaHoteles)
        6 -> println("Saliendo del programa...")
    }
}

fun duplicarReserva(reservaHoteles: MutableList<Reserva>) {
    val nombreReserva: String = pedirCadena("Indique el nombre del reservante: ")
    for (reserva in reservaHoteles) {
        if (nombreReserva == reserva.cliente) {
            val habitacionNueva = pedirNumeroEntreRangos("Dime el numero de habitacion nueva ", 0)
            reservaHoteles.add(reserva.copy(reserva.cliente, habitacionNueva, reserva.noches, reserva.precioNoche))
            println("Se ha copiado correctamente")
            return
        }
    }
    println("No hay inquilinos que se llamen asi ")
}

fun mostrarReservas(reservaHoteles: MutableList<Reserva>) {
    var nombreReserva: String
    if(comprobarSiEstaVacio(reservaHoteles)){
        println("No hay reservas disponibles")
        return
    }
    for (reserva in reservaHoteles) {
        val total = reserva.precioNoche * reserva.noches
        var cadena = String.format("Hab. ${reserva.habitacion} | ${reserva.cliente} | ${reserva.noches} noches | Total: $total €")
        println(cadena)
    }
}

fun comprobarSiEstaVacio(reservaHoteles: MutableList<Reserva>): Boolean {
    return reservaHoteles.isEmpty()
}


fun buscarReservasPorCliente(reservaHoteles: MutableList<Reserva>) {
    val nombreReserva: String = pedirCadena("Indique el nombre del reservante: ")
    var existeCliente: Boolean = false
    if(comprobarSiEstaVacio(reservaHoteles)){
        println("No hay reservas disponibles")
        return
    }
    for (reserva in reservaHoteles) {
        if (nombreReserva == reserva.cliente) {
            val total = reserva.precioNoche * reserva.noches
            println(String.format("Hab. ${reserva.habitacion} | ${reserva.cliente} | ${reserva.noches} noches | Total: $total €"))
            existeCliente = true
        }
    }
    if (!existeCliente) {
        println("El cliente $nombreReserva no tiene ninguna reserva")
    }

}
fun buscarReservasMayores(reservaHoteles: MutableList<Reserva>) {
    if(comprobarSiEstaVacio(reservaHoteles)){
        println("No hay reservas disponibles")
        return
    }
    val reservaMayor = reservaHoteles.filter { reserva -> reserva.precioNoche * reserva.noches > 300 }
    if(reservaMayor.isEmpty()) {
        println("No hay reservas disponibles")
        return
    }
    for (reservaMayor in reservaMayor) {
        val total = reservaMayor.precioNoche * reservaMayor.noches
        println(String.format("Hab. ${reservaMayor.habitacion} | ${reservaMayor.cliente} | ${reservaMayor.noches} noches | Total: $total €"))
    }
}


fun reservarHabitacion(hoteles: MutableList<Reserva>) {
    val cliente = pedirCadena("Dime su nombre: ")
    val habitacion = pedirNumeroEntreRangos("Habitacion: ", 0)
    val noches = pedirNumeroEntreRangos("Noches: ", 1, 30)
    val precioNoche = pedirNumeroDecimalEntreRangos("Precio por noche: ", 0)

    hoteles.add(Reserva(cliente = cliente, habitacion = habitacion, noches, precioNoche))
    println("Habitacion creada correctamente. ")
}

fun mostrarMenu() {
    println("----- HOTEL KOTLIN -----")
    println("1. Nueva reserva")
    println("2. Mostrar reserva")
    println("3. Buscar reserva por cliente")
    println("4. Mostrar reserva de mas 300€")
    println("5. Duplicar reserva")
    println("6. Salir")
    println()
}

fun pedirNumero(msg: String): Int {
    var numero: Int? = null
    do {
        print(msg)
        numero = readln().toIntOrNull()
    } while (numero == null)
    return numero
}

fun pedirNumeroEntreRangos(msg: String, min: Int, max: Int): Int {
    var numero: Int? = null
    do {
        print(msg)
        numero = readln().toIntOrNull()
        if (numero !in min..max) {
            println("El numero debe de estar entre $min y $max")
        }
    } while (numero == null || numero !in min..max)
    return numero
}

fun pedirNumeroEntreRangos(msg: String, min: Int): Int {
    var numero: Int? = null
    do {
        print(msg)
        numero = readln().toIntOrNull()
        if (numero != null && numero <= min) {
            println("El numero debe de ser mayor que  $min")
        }
    } while (numero == null || numero <= min)
    return numero
}

fun pedirNumeroDecimal(msg: String): Double {
    var numero: Double? = null
    do {
        print(msg)
        numero = readln().toDoubleOrNull()
    } while (numero == null)
    return numero
}

fun pedirNumeroDecimalEntreRangos(msg: String, min: Int): Double {
    var numero: Double? = null
    do {
        print(msg)
        numero = readln().toDoubleOrNull()
        if (numero != null && numero <= min) {
            println("El numero debe de ser mayor que $min")
        }
    } while (numero == null || numero <= min)
    return numero
}

fun pedirCadena(msg: String): String {
    print(msg)
    return readln().trim()
}


