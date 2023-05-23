package org.csystem.examples.homework_7

import kotlin.random.Random

fun main() = printRandomDate()

fun printRandomDate(r : Random = Random) {

    var year = r.nextInt(1900, 2101)
    var month = r.nextInt(1,13)
    var day = r.nextInt(1, when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 32
        2 -> if (isLeapYear(year)) 30 else 29
        else -> 31
    } )

    println("$day ${getDaySuffix(day)} ${getMonthAbbr(month)} $year")
}
fun isLeapYear(year : Int) = year % 4 == 0 && year % 100 != 0 || year % 400 == 0
fun getDaySuffix(day : Int) : String
{
    return when (day) {
            1, 21, 31 -> "st"
            2, 22 -> "nd"
            3, 23 -> "rd"
            else -> "th"
    }
}
fun getMonthAbbr(month : Int) : String
{
    return when (month) {
            1 -> "Jan"
            2 -> "Feb"
            3 -> "Mar"
            4 -> "Apr"
            5 -> "May"
            6 -> "Jun"
            7 -> "Jul"
            8 -> "Aug"
            9 -> "Sep"
            10 ->"Oct"
            11 ->"Nov"
            else -> "Dec"
    }
}