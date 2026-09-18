//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var numero : Int? = null
    while (numero != 0) {
        println("Dime el numero pulsa 0 para salir: ")
        val numeroLeido = readln().trim()

        numero = numeroLeido.toIntOrNull()
        var mensaje : String? = null


        println(mensaje?: "No es un numero entero ")

    }
}