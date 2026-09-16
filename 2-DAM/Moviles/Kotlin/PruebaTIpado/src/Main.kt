//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Dime un nombre: ")
    var nombre = readln()
    println("Dime la edad: ")
    var edad= readln().toIntOrNull()

    println("Mi nombre es $nombre y tengo $edad")

}
