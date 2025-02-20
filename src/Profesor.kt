class Profesor(val departamento: String, val aniosExperiencia: Int, nombre: String, edad: Int, id: String) : Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("ROL: PROFESOR.")
    }

    fun mostrarExperiencia() {
        println("Experiencia: $aniosExperiencia.")
    }

}