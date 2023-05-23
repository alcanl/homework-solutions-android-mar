package org.csystem.examples.homework_2

fun runPrimeFactors()
{
    while(true) {
        print("Input a number :")
        val value = readln().toLong()
        if (value == 0L)
            break
        getPrimeFactors(value)
        println()
    }
}
fun getPrimeFactors(value : Long)
{
    var value = value
    var divider = 2L

    while (value != 1L) {
        if (value % divider == 0L) {
            value /= divider
            print("$divider ")
        }
        else
            ++divider
    }
}