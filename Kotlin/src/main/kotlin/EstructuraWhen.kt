fun main(args: Array<String>) {
    val nombreColor = "Rojo"

    when (nombreColor) {
        "Amarillo" -> println("El amarillo es color de la alegria")
        "Rojo", "Carmesi" -> println("El $nombreColor simboliza el calor")
        else -> println("Error, no tengo informacion del color")
    }

    val code = 400
    when (code) {
        /*Así se especifica un rango en Kotlin, usando la palabra reservada in numberMin..numberMax*/
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo a fallado")
        else -> println("Código desconocido, algo ha fallado")
    }

    val tallaDeZapatos = 45
    val mensaje = when (tallaDeZapatos) {
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no nos quedan"
        45 -> "Lo siento no tenemos disponible"
        else -> "Estos zapatos solo vienen en tallas 41, 42, 43, 44 y 45"
    }
    println(mensaje)
}