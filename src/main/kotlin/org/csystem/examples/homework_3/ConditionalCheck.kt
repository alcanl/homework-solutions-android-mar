package org.csystem.examples.homework_3

fun runConditionalCheck()
{
    for (i in 100L..999L step 1)
        if (isTrue(i))
            println(i)

}

fun isTrue(value : Long) : Boolean
{
    val a = value / 100
    val b = value / 10 % 10
    val c = value % 10

    fun condition1() : Boolean = reversed(value) > value
    fun condition2() : Boolean = isPrime(value)
    fun condition3() : Boolean = isPrime(reversed(value))
    fun condition4() : Boolean = isPrime(10 * a + b)
    fun condition5() : Boolean = isPrime(10 * b + c)
    fun condition6() : Boolean = isPrime(10 * c + b)
    fun condition7() : Boolean = isPrime(10 * b + a)

    return condition1() && condition2() && condition3() && condition4() && condition5() && condition6() && condition7()
}

fun reversed(value: Long) : Long
{
    var result = 0L
    var temp = value

    while (temp != 0L) {
        result = result * 10 + temp % 10
        temp /= 10
    }

    return result
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
