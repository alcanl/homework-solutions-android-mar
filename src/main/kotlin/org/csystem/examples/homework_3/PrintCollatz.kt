package org.csystem.examples.homework_3

fun printCollatzApp()
{
    while (true) {
        print("Input a number : ")
        val value = readln().toInt()
        if (value == 0)
            break
        printCollatz(value)
        println()
    }
}

fun isEven(value : Int) : Boolean = value % 2 == 0
fun evenValue(value : Int) : Int = value / 2
fun oddValue(value : Int) : Int = value * 3 + 1


fun printCollatz(value : Int) {
    var n = value

    while (n != 1) {
        n = if (isEven(n)) evenValue(n) else oddValue(n)
        print("$n ")
    }
}