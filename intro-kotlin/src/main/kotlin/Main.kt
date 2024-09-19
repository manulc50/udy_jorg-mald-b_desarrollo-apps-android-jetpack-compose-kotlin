import java.lang.NumberFormatException

fun main() {
    //println("Hola Mundo");

    var a1 = arrayOf("Luis", "Mario", 2, true, 2.5)
    println(a1.contentToString())
    val numeros1 = intArrayOf(1, 2, 3, 4, 5)
    println(numeros1[1])
    a1[1] = "Juan"
    println(a1[1])
    println(numeros1.size)
    // Crea un nuevo array y le añade "Sergio"
    a1 += "Sergio"
    println(a1.contentToString())
    val numeros2 = intArrayOf(4, 3, 6, 8, 9 ,1)
    numeros2.sort()
    println(numeros2.contentToString())
    val numeros3 = intArrayOf(2, 2, 5, 7, 8, 8, 3, 5, 6)
    val duplicados = numeros3.groupBy { it }.filter { it.value.size > 1 }.keys
    println(duplicados)
}

fun variables() {
    // Tipos: String, Int, Float, Double, Boolean.
    val v1: Int = 1
    println(v1)
    var v2 = 2.1
    println(v2)
    //v2 = "hola" // Error porque v2 es de tipo Double
    v2 = 4.5
    println(v2)
    val texto1 = "Hola "
    val texto2 = "Mundo"
    println(texto1 + texto2)
}

fun nullSafety() {
    // Null Safety - Por defecto, una variable es requerida y debe tener un valor no nulo.
    // El caracter '?' hace que una variable sea opcional y, por lo tanto, que pueda adquirir el valor nulo.
    var x: String? = null
    x = "hola"
    println(x)

    // Forma de realizar una tarea en caso de que una variable opcional tenga valor.
    x?.let { println("Tiene valor") }
}

fun cambiarTipoYConcatenaciones() {
    // Cambio de tipos y concatenaciones
    val num1 = 5
    val num2 = "10"
    println(num1 + num2.toInt())

    val t1 = "Hola"
    val t2 = "Mundo"
    println(t1 + " " + t2)
    println(t1.plus(" ").plus(t2))
    println("Soy el número: $num1")
    val a1 = arrayOf("Hola", "Mundo")
    println(a1.joinToString(" "))
}

fun tryCatch() {
    try {
        println("Escribe el primer número")
        val n1 = readln().toDouble()
        println("Escribe el segundo número")
        val n2 = readln().toDouble()
        println(n1 + n2)
    }
    catch(e: NumberFormatException) {
        //("Error: Debes introducir un número entero $e")
        println("Error: Debes introducir un número")
    }
}

fun bucleWhile() {
    /*var num = 1
    while(num <= 10) {
        println(num)
        num++
    }*/

    var n1: Double
    var n2: Double
    while(true) {
        try {
            println("Escribe el primer número")
            n1 = readln().toDouble()
            println("Escribe el segundo número")
            n2 = readln().toDouble()
            break;
        } catch (e: NumberFormatException) {
            //("Error: Debes introducir un número entero $e")
            println("Error: Debes introducir un número")
        }
    }

    println(n1 + n2)
}