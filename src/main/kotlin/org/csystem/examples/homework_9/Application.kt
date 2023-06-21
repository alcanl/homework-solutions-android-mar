package org.csystem.examples.homework_9

fun main()
{
    val mm = MasterMindApp()
    mm.run()

    val a = IntArray(10) {it + 1}
    println(secondMax(a))
}
fun secondMax(arr : IntArray) : Int
{
    var max1 = arr[0]; var max2 = arr[0]

    for (i in arr)
        if (i > max1) {
            max2 = max1
            max1 = i
    }
    return max2
}