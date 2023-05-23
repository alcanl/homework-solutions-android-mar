package org.csystem.examples.homework_2

fun runGoldbach()
{
    while (true) {
        print("Input an even number greater than 2 : ")
        val value = readln().toLong()
        if (value == 0L)
            break;
        goldbachTheory(value)
    }
}

fun goldbachTheory(value : Long)
{
    if (value == 4L)
        println("Number 4 can printable as 2 + 2")

    for (i in 3..value step 2)
        for (k in 3..i step 2)
            if (i + k == value && isPrime(i) && isPrime(k))
                println("Number $value can printable as $i + $k ")
}

fun isPrime(a: Long) : Boolean
{
    if (a <= 1)
        return false

    if (a % 2 == 0L)
        return a == 2L

    if (a % 3 == 0L)
        return a == 3L

    if (a % 5 == 0L)
        return a == 5L

    if (a % 7 == 0L)
        return a == 7L

    var i = 11L

    while (i * i <= a) {
        if (a % i == 0L)
            return false
        i += 2
    }

    return true
}