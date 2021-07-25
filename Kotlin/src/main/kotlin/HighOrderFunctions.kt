fun main(args: Array<String>) {
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!", block = { valor -> valor.length })
    println(largoDelValorInicial)

    val lambda: () -> String = funionInception("Enrique")
    println(lambda())
}

fun superFuncion(valorInicial: String, block: (String) -> Int): Int {
    return block(valorInicial)
}

fun funionInception(nombre: String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}