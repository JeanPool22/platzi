import java.util.*

fun main(args: Array<String>) {
    val fraseAleatoria = "En Platzi nunca paramos de aprender".randomCase()
    imprimirFrase(fraseAleatoria)
}

fun imprimirFrase(frase : String) : Unit {
    println("Tu frase es: $frase")
}

fun String.randomCase() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0) {
        this.uppercase(Locale.getDefault())
    } else {
        this.toLowerCase()
    }
}

/*
fun randomCase(frase : String) : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0) {
        frase.uppercase(Locale.getDefault())
    } else {
        frase.toLowerCase()
    }
}*/
