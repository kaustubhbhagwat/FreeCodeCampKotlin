fun main() {
    var x = 5
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

    x = 0
    //postIncrementation
    println("x= ${x++}")
    //preIncrementation
    println("x= ${++x}")
    //postDecrementation
    println("x=${x--}")
    //preDecrementation
    println("x=${--x}")




    val myNumber = 151
    if (myNumber >= 150) {
        println("Number is greater than 150")
    } else if (myNumber > 90) {
        println("Number is greater than 90")
    } else {
        println("All commands failed")
    }

    val isActive = false
    if(isActive){
        println("User is Active")
    }else{
        println("User is Not Active")
    }
}