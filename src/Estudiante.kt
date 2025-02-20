class Estudiante(val curso: String, val calificacionesPromedio: Double, nombre: String, edad: Int, id: String) : Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("ROL: ESTUDIANTE.")
    }

    fun mostrarCalificacion() {
        println("Calificaciones promedio: $calificacionesPromedio.")
    }

}