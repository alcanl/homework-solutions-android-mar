package org.csystem.examples.homework_3

fun calculateDigitalRootsTest()
{
    while(true) {
        print("Input a number : ")
        val value = readln().toInt()
        if (value == 0)
            break
        println("${calculateDigitalRoot(value)}")
    }
}
fun sumDigits(value: Int) : Int
{
    var total = 0
    var temp = value

    while (temp != 0) {
        total += temp % 10
        temp /= 10;
    }

    return kotlin.math.abs(total)
}

fun calculateDigitalRoot(value : Int) : Int
{
    var value = value

    while (value > 9) {
        value = sumDigits(value)
    }
    return value

}
