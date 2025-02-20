abstract class Persona(val nombre: String, var edad: Int, val id: String) {
    abstract fun mostrarRol()

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, ID: $id"
    }
}