data class Alumno(val nombre: String,
                  val curso: String,
                  val notaMedia: Double
                 ) {
    override fun toString(): String {
        return String.format("El nombre %s esta matriculado en curso %s con un %.2f de media. \n",nombre, curso, notaMedia);
    }
}
