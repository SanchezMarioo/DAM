//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val edad = 19

    if (edad is Int) {
        println("Edad valida")
    } else {
        println("Edad no es valida")
    }

}
