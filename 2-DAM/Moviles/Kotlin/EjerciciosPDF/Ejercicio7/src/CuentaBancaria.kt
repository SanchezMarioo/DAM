class CuentaBancaria(
    val titular: String,
    val numeroCuenta: String,
    saldoInicial: Double = 0.0,
) {
    var saldo: Double = saldoInicial
        private set

    init {
        require(saldoInicial >= 0) { "El saldo inicial no puede ser negativo" }
        println("Cuenta $numeroCuenta creada correctamente para $titular")
        println("Saldo inicial $saldo")
    }

    fun ingresar(cantidad: Double): Boolean {
        if (cantidad <= 0) {
            println("La cantidad a ingresar debe ser mayor que 0")
            return false
        }

        println("$titular ingresado correctamente")
        saldo += cantidad
        return true
    }

    fun retirar(cantidad: Double): Boolean {
        if (cantidad <= 0) {
            println("La cantidad a retirar debe ser mayor que 0")
            return false
        }

        if (cantidad > saldo) {
            println("No puedes retirar más dinero del que tienes")
            return false
        }

        println("$titular retirado correctamente")
        saldo -= cantidad
        return true
    }

    fun mostrarInformacion() {
        println("Nombre del titular: $titular")
        println("Número de cuenta: $numeroCuenta")
        println("Saldo informado: $saldo")
    }
}