package org.csystem.examples.homework_2

fun runDuration()
{
    print("Input the time as second :")
    val sec = readln().toLong()
    printDuration(sec)
}
fun printDuration(a : Long) {

    val hour = calculateHour(a)
    val minute = calculateMinute(a)
    val second = calculateSecond(a)
    print("$a seconds is ")

    if (hour != 0L)
        print("$hour hours ")
    if (minute != 0L)
        print("$minute minutes ")
    if (second != 0L)
        print("$second seconds")

}

fun calculateHour(a : Long) : Long = a / 60
fun calculateMinute(a : Long) : Long = (a / 60) % 60
fun calculateSecond(a : Long) : Long = a % 60
