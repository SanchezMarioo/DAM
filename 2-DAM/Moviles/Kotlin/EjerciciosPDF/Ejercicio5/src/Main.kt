fun main() {
    val MIN_PEDIR_NOTAS = 1;
    val MAX_PEDIR_NOTAS = 30;
    val MIN_NOTA = 0.0;
    val MAX_NOTA = 10.0;

    var numeroNotas : Int?
    var notasAlmacenadas = mutableListOf<Double>();
    var notaAlumno : Double?
    do {
        println("Dime cuantas notas vas a introducir: ")
        numeroNotas = readln()?.toIntOrNull() ?: 0
        if(numeroNotas in MIN_PEDIR_NOTAS..MAX_PEDIR_NOTAS){
            break;
        } else{
            println("Error: Introduzce un numero entre ($MIN_PEDIR_NOTAS y $MAX_PEDIR_NOTAS)")

        }
    } while (true)
    while(notasAlmacenadas.size < numeroNotas) {
        println("Dime la nota ${notasAlmacenadas.size + 1}: ")
        notaAlumno = readln()?.toDoubleOrNull() ?: -1.0
        if(notaAlumno in MIN_NOTA..MAX_NOTA){
            notasAlmacenadas.add(notaAlumno)
        } else{
            println("Introduzce un numero entre $MIN_NOTA y $MAX_NOTA: ")
        }

    }

}
fun mostrarNotas(List <>){
    println()
}