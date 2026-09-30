class CuentaBancaria(
    var titular: String,
    var numeroCuenta: String,
) {
    var saldo = 0.0
    init {
        println("Cuenta $numeroCuenta creada correctamente para $titular")
        println("Saldo incial $saldo")
    }
    fun ingresar(cantidad : Double) {
        if(cantidad < 0 ){
            println("No puedes introduzcir saldo inferior a 0 ")
            return
        }
        println("$titular ingresado correctamente")
        saldo += cantidad
    }
    fun retirar(cantidad : Double) {
        if(cantidad < 0  ){
            println("No puedes introduzcir saldo inferior a 0")
            return
        }
        if(cantidad > saldo){
            println("No puedes sacar mas dinero del que tienes melon! ")
            return
        }
        println("$titular retirado correctamente")
        saldo -= cantidad
    }
    fun mostrarInformacion(){
        println("Nombre del titular: $titular")
        println("Numero de cuenta: $numeroCuenta")
        println("Saldo de informado: $saldo")
    }
    constructor(titular: String, numeroCuenta: String, saldo: Double) : this(titular, numeroCuenta){
        this.saldo = saldo
    }

}