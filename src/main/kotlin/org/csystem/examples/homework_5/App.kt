package org.csystem.examples.homework_5

import org.csystem.examples.homework_3.calculateFactorial

fun main()
{
    eulerNumber()
    println(sumFactors(65))
    println(areFriends(220,284))
    println(isPerfect(6))
    find4DigitsPerfectNumber()
}
fun eulerNumber()
{
    var sum = 0.0
    for (i in 0..30)
        sum += 1.0 / calculateFactorial(i)

    println(sum)
}
fun sumFactors(a : Int) : Int
{
    if (a <= 2)
        return 1

    var sum = 1

    for (i in 2..a / 2)
        sum += if (a % i == 0) i else 0

    return sum
}
fun areFriends(a : Int, b : Int) = sumFactors(a) == b && sumFactors(b) == a

fun isPerfect(a : Int) = sumFactors(a) == a

fun find4DigitsPerfectNumber()
{
    for (i in 1000..9999)
        if (isPerfect(i))
            println(i)
}
