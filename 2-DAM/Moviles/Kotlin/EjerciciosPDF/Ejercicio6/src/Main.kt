import kotlin.collections.MutableMap as MutableMap

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val productos: MutableMap<String, Int> = mutableMapOf();
    do {
        mostrarMenu()
        val opt = pedirNumero("Elige una opcion: ")
        funcionalMenu(opt, productos)
    } while (opt != 6)
}

fun mostrarMenu() {
    println("------ GESTION DE STOCK ----------")
    println()
    println("1. Añadir stock")
    println("2. Modificar stock")
    println("3. Consultar producto")
    println("4. Mostrar todos los productos")
    println("5. Mostrar los productos con poco stock")
    println("6. Salir")
}

fun pedirNumero(mensaje: String): Int {
    println(mensaje)
    var numero : Int?
    do {
        numero =  readln().toIntOrNull()
        if(numero == null){
            println("Escribe un numero")
        }
    } while (numero == null)
    return numero
}

fun pedirCadena(mensaje: String): String {
    println(mensaje)
    return readln()
}

fun funcionalMenu(numero: Int, productos: MutableMap<String, Int>) {
    when (numero) {
        1 -> {
            val nombreProducto = pedirCadena("Dime el nombre del producto: ")

            val stockProducto = pedirNumero("Dime el stock del producto: ")
            crearProducto(productos, nombreProducto, stockProducto)
        }

        2 -> {
            val nombreProducto = pedirCadena("Dime el nombre del producto: ")
            modificarProducto(nombreProducto, productos)
        }

        3 -> {
            val nombreProducto = pedirCadena("Dime el nombre del producto: ")
            mostrarProducto(nombreProducto, productos)
        }

        4 -> mostrarTodosLosProductos(productos)
        5 -> mostrarProductosConBajoStock(productos)
        6 -> println("Saliendo del programa...")
        else -> println("Opcion no valida...")
    }
}

fun crearProducto(productos: MutableMap<String, Int>, nombreProducto: String, stock: Int) {
    productos[nombreProducto] = stock
    println("Se ha creado  correctamente el producto: " + nombreProducto)
}

fun comprobarProducto(nombreProducto: String, productos: MutableMap<String, Int>): Boolean {
    return productos.containsKey(nombreProducto);
}

fun modificarProducto(nombreProducto: String, productos: MutableMap<String, Int>) {
    if (comprobarProducto(nombreProducto, productos)) {
        val numero = pedirNumero("El producto $nombreProducto tiene ${productos[nombreProducto]}: ")
        productos[nombreProducto] = numero
    }
}

fun mostrarProducto(nombreProducto: String, productos: MutableMap<String, Int>) {
    if (comprobarProducto(nombreProducto, productos)) {
        for (i in 1..productos.size) {
            println("Hay ${productos[nombreProducto]} en $nombreProducto  ")
        }
    } else {
        println("Ese $nombreProducto no es un producto")
    }

}

fun mostrarTodosLosProductos(productos: MutableMap<String, Int>) {
    if (productos.isEmpty()) {
        println("No hay productos con bajo stock")
        return
    }
    println()
    for ((clave, valor) in productos) {
        println("$clave -> $valor unidades")
    }
    println()
}

fun mostrarProductosConBajoStock(productos: MutableMap<String, Int>) {
    val productosBajoStock = productos.filterValues { it < 5 }
    if (productosBajoStock.isEmpty()) {
        println("No hay productos con bajo stock")
        return
    }
    for ((clave, valor) in productosBajoStock) {
        println("$clave -> $valor unidades")
    }
    println()
}