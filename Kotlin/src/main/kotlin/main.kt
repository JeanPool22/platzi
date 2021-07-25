//Variable declarada en tiempo de compilación
const val PI = 3.1416
fun main(args: Array<String>) {
    println("Hello World!")
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    //Variable declara en tiempo de ejecución
    val nombre = "Maria"
    println(nombre)
    println(PI)

    val boolean = true
    val numeroLargo = 3L
    val double = 2.7182
    val float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor - segundoValor
    println(tercerValor)

    val apellido = "Zambrano"
    val jean = "Jean"
    val nombreCompleto = "Mi nombre es $jean $apellido"
    //val nombreCompleto = jean + " " + apellido
    println(nombreCompleto)
}