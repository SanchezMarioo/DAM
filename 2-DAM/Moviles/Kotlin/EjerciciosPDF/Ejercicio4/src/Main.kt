fun main() {
    println("Dime el numero de alumnos a generar: ")
    val nAlumnos = readln().toInt() ?: 0;
    if (nAlumnos <= 0) {
        println("Numero no valido. Saliendo del programa... ")
        return
    }
    val alumnoBase = Alumno("Sin asignar", "2DAM", 0.0)
    val listaAlumnos = mutableListOf<Alumno>()
    println("Generando Alumnos....")
    println()
    for (i in 1..nAlumnos) {
        var alumno = alumnoBase.copy(
            "Alumno $i",
            "2ºDAM",
            generarNumeroRandom(10.0)
        );
        listaAlumnos.add(alumno);
        println(listaAlumnos[i - 1]);
    }

}

fun generarNumeroRandom(numero: Double): Double {
    return kotlin.random.Random.nextDouble(0.0, numero);
}