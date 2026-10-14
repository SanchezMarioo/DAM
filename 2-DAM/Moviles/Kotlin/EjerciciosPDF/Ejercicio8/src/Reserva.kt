data class Reserva(
    val cliente: String,
    val habitacion: Int,
    val noches: Int,
    val precioNoche: Double
) {
    override fun toString(): String {
        return String.format("Hab. ${habitacion} | ${cliente} | ${noches} noches | Total: ${precioNoche * noches} €")
    }
}
