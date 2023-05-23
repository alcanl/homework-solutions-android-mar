package org.csystem.examples.homework_3

fun isDecimalHarshadTest()
{
    while (true) {
        print("Input a number : ")
        val value = readln().toInt()
        if (value == 0)
            break
        println(if (isDecimalHarshad(value)) "The number $value is a Harshad number." else "The number $value is not a Harshad number.")
    }
}

fun isDecimalHarshad(value : Int) : Boolean
{
    if (value < 0)
        return false

    return value % sumDigits(value) == 0

}

