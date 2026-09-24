fun main() {
    val MIN_PEDIR_NOTAS = 1;
    val MAX_PEDIR_NOTAS = 30;
    val MIN_NOTA = 0.0;
    val MAX_NOTA = 10.0;

    var numeroNotas: Int?
    var notasAlmacenadas = mutableListOf<Double>();
    var notaAlumno: Double?
    do {
        println("Dime cuantas notas vas a introducir: ")
        numeroNotas = readln()?.toIntOrNull() ?: 0
        if (numeroNotas in MIN_PEDIR_NOTAS..MAX_PEDIR_NOTAS) {
            break;
        } else {
            println("Error: Introduzce un numero entre ($MIN_PEDIR_NOTAS y $MAX_PEDIR_NOTAS)")

        }
    } while (true)
    while (notasAlmacenadas.size < numeroNotas) {
        println("Dime la nota ${notasAlmacenadas.size + 1}: ")
        notaAlumno = readln()?.toDoubleOrNull() ?: -1.0
        if (notaAlumno in MIN_NOTA..MAX_NOTA) {
            notasAlmacenadas.add(notaAlumno)
        } else {
            println("Introduzce un numero entre $MIN_NOTA y $MAX_NOTA: ")
        }

    }
    println("---------- RESULTADOS ----------")
    println("Notas introducidas $notasAlmacenadas")
    println("Nota media: %.2f".format(calcularMedia(notasAlmacenadas)))
    println("Nota mas alta: ${calcularNotaMasAlta(notasAlmacenadas)}")
    println("Notas mas baja: ${calcularNotaMinima(notasAlmacenadas)}")
    println("Numero aprobados:  ${calcularNumeroAprobados(notasAlmacenadas)}")
    println("Numero suspensos:  ${calcularNumeroSuspensos(notasAlmacenadas)}")
    println("Notas aprobadas: ${numeroAprobados(notasAlmacenadas)}")
}

fun calcularMedia(notas: List<Double>): Double {
    return notas.sumByDouble { it } / notas.size
}

fun calcularNotaMasAlta(notas: List<Double>): Double {
    return notas.maxOfOrNull { it } ?: 0.0
}

fun calcularNotaMinima(notas: List<Double>): Double {
    return notas.minByOrNull { it } ?: 0.0
}

fun calcularNumeroAprobados(listaNotas: List<Double>): Int {
    val esAprobado = { aprobados : Double -> aprobados >= 5.0 }
    return listaNotas.filter(esAprobado).size
}
fun calcularNumeroSuspensos(listaNotas: List<Double>): Int {
    val esSuspenso = {suspensos : Double -> suspensos <= 5.0}
    return listaNotas.filter(esSuspenso).size - 1
}
fun numeroAprobados(listaNotas: List<Double>): List<Double> {
    val esAprobado = {aprobados : Double -> aprobados >= 5.0}
    return listaNotas.filter(esAprobado)
}