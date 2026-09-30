//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val cuenta1 = CuentaBancaria("Carlos Ruiz", "ES123456789")

    // Usa el constructor secundario (pasa todos los datos, incluido el saldo)
    val cuenta2 = CuentaBancaria("Lucía Gómez", "ES987654321", 1500.0)

    cuenta1.mostrarInformacion()
    cuenta2.mostrarInformacion()
    cuenta1.retirar(-100.0)
    println()
    cuenta2.retirar(2599.00)
    println()
    cuenta1.mostrarInformacion()
    cuenta2.mostrarInformacion()
    cuenta2.retirar(299.00)
    cuenta2.mostrarInformacion()
}