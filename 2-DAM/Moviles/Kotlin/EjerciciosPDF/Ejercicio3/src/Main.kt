fun main() {
//    repetirAccion(4, {
//        println("Estoy praticando lambdas")
//    })
    repetirAccion(3){ println("Estoy practicando lambdas")}
}

fun repetirAccion(nVeces: Int, accion: () -> Unit) {
    var contador = 0;
    while (contador < nVeces) {
        accion()
        contador++
    }
}