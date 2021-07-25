fun main(args: Array<String>) {
    val numerosDeLoteria = listOf(11, 22, 43, 56, 78, 66)

    val numerosSort = numerosDeLoteria.sorted()
    println(numerosSort)

    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu número de loteria es $numero\n" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)

    val dato = "Amazing"
    val nuevodato = dato.reversed()
    println(nuevodato)
}