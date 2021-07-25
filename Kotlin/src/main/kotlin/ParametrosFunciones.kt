fun main(args: Array<String>) {
    imprimirNombre(nombre = "Jean", apellido = "Zambrano")
}

fun imprimirNombre(nombre : String, segundoNombre: String = "", apellido: String) {
    println("Mi nombre es $nombre y mi apellido es $apellido")
    println("Mo nombre completo es $nombre $apellido")
    println("Mo nombre completo es $nombre $segundoNombre $apellido")
}