fun main(args: Array<String>) {
    val myLambda: (String) -> Int = {
        valor -> valor.length
    }
    println(myLambda("Hola"))

    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)
}