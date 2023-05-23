package org.csystem.examples.homework_2

fun runPattern()
{
    print("Input a number :")
    val n = readln().toInt()
    printPattern(n)
}
fun printPattern(n : Int = 0)
{

    for (i in 1..n step 1){
        for (k in i + 1 ..n step 1)
            print(" ")
        for (k in 2..i * 2 step 1)
            print("*")
        println()
    }
    printPatternReverse(n - 1)

}
fun printPatternReverse(n : Int = 0)
{
    var i = n

    while (i > 0) {
        for (k in i..n step 1)
            print(" ")
        for (k in 2.. i * 2 step 1)
            print("*")
        --i
        println()
    }
}