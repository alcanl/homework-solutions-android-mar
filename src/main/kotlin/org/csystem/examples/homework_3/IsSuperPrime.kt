package org.csystem.examples.homework_3

fun isSuperPrimeTest()
{
    while (true) {
        print("Input a number : ")
        val value = readln().toLong()
        if (value == 0L)
            break
        println(if (isSuperPrime(value)) "The number $value is a super prime number." else "The number $value is not a super prime number.")
    }
}

fun isSuperPrime(value : Long) : Boolean = isPrime(value) && isPrime(primeNumberIndex(value))

fun primeNumberIndex(value : Long) : Long
{
    var count = 1L
    for (i in 3..value step 2)
        if (isPrime(i))
            ++count

    return count
}