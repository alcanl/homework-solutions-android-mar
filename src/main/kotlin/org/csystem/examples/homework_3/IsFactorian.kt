package org.csystem.examples.homework_3

fun isFactorianTest()
{
    for (i in 1..100_000 step 1)
        println(if (isFactorian(i)) "$i" else continue)
}

fun isFactorian(value : Int) : Boolean
{

    var num = value
    var total = 0
    while (num != 0) {
        total += calculateFactorial(num % 10)
        num /= 10
    }
    return total == value
}

fun calculateFactorial(value : Int) : Int
{
    if (value == 0)
        return 1

    var result = 1
    for (i in 2..value)
        result *= i

    return result
}

