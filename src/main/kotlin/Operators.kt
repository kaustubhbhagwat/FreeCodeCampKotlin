fun main() {
    var x= 5
    val y = 3.0


    //Placeholder expression
    println("x + y= ${x + y}")
    println("x - y= ${x - y}")
    println("x * y= ${x * y}")
    println("x % y= ${x % y}")
    println("x / y= ${x / y}")

    var result = x + y

    result += 2
    println(result)

    result -= 2
    println(result)

    result *= 2
    println(result)

    result /= 2
    println(result)

    result %= 2
    println(result)

    println(" 3 + 3 * 4 = ${(3 + 3) * 4}")

    x=0
    //postIncrementation
    println("x= ${x++}")
    //preIncrementation
    println("x= ${++x}")
    //postDecrementation
    println("x=${x--}")
    //preDecrementation
    println("x=${--x}")


    /*


     */


}