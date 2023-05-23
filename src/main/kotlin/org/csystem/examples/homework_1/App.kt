package org.csystem.examples.homework_1

import kotlin.math.max
import kotlin.math.min

fun main()
{
    sortValues()
    mid(10,20,30)
    signum(-5)

}
fun sortValues()
{
    val a = readln().toInt(); val b = readln().toInt(); val c = readln().toInt()
    val max = max(max(a, b), c); val min = min(min(a, b), c); val mid = a + b + c - max - min

    if (max == mid && mid == min)
        println("$max = $mid= $min")
    else if (max == mid)
        println("$max = $mid > $min")
    else if (mid == min)
        println("$max > $mid = $min")
    else
        println("$max > $mid > $min")
}
fun mid(a : Int, b : Int, c : Int) : Int
{
    if (b in c..a || b in a..c)
        return b

    if (a in b..c || a in c..b)
        return a

    return c

}
fun signum(a : Int) : Int = if (a > 0) 1 else if (a == 0) 0 else -1
