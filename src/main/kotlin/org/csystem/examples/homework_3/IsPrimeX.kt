package org.csystem.examples.homework_3

fun runIsPrimeX()
{
    for (i in 1..9999L step 1)
        if (isPrimeX(i))
            println(i)

}

fun isPrimeX(value : Long) : Boolean
{
    var value = value

    while (value > 9 && isPrime(value))
        value = sumDigits(value)

    return isPrime(value)
}
fun sumDigits(value: Long) : Long
{
    var total = 0L
    var temp = value

    while (temp != 0L) {
        total += temp % 10
        temp /= 10;
    }

    return kotlin.math.abs(total)
}


