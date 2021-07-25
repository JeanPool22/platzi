fun main(args: Array<String>) {
    var contador = 10
    while (contador > 0) {
        println("El valor de contado es $contador")
        contador--
    }

    do {
        println("Generando número aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("El número generado es $numeroAleatorio")
    } while (numeroAleatorio > 50)
}