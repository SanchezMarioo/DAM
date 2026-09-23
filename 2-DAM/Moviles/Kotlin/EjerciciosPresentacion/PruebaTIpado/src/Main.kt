//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val diasSemana = mutableListOf<String>("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    val nuevaLista = mutableListOf<String>()
    diasSemana.forEach {
        nuevaLista.add(it)
    }
    println(nuevaLista)
    diasSemana = nuevaLista;
}
