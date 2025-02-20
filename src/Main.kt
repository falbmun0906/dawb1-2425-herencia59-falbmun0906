fun main() {
    val estudiante1: Estudiante = Estudiante("Primero", 8.98, "Pablo", 18, "123456A")
    val profesor1: Profesor = Profesor("Informática", 26, "Irene", 55, "654321Z")

    println(estudiante1)
    estudiante1.mostrarRol()
    estudiante1.mostrarCalificacion()
    println("")
    println(profesor1)
    profesor1.mostrarRol()
    profesor1.mostrarExperiencia()

}