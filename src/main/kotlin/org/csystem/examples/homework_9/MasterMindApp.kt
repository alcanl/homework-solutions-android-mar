package org.csystem.examples.homework_9

import org.csystem.util.kotlin.digits
import kotlin.random.Random

fun Int.checkTrueLocEquality(a : Int) = this == a
fun Int.checkWrongLocEquality(a : IntArray, index : Int) : Boolean
{
    for (i in a.indices)
        if (index != i && this == a[i])
            return true

    return false
}

class MasterMindApp(private var mrandom : Random = Random,
                    private var mdeterminedValue : IntArray = mrandom.nextInt(1000, 10000).digits())
{
    private var mguess : IntArray = IntArray(4)
    private var mresults : Pair<Int, Int> = Pair(0 , 0)

    private fun checkGuess()
    {
        var countTrueLoc  = 0; var i = 0;
        mguess.forEach { if (it.checkTrueLocEquality(mdeterminedValue[i++])) ++countTrueLoc }

        var countWrongLoc = 0; var k = 0;
        mguess.forEach { if (it.checkWrongLocEquality(mdeterminedValue, k++)) ++countWrongLoc }

        mresults = Pair(countTrueLoc, -countWrongLoc)
    }
    private fun getGuess()
    {
        print("Dört haneli sayı tahmininizi giriniz : ")
        mguess = readln().toLong().digits()
    }
    private fun isWin() = mresults.first + mresults.second == 4
    private fun printResult()
    {
        val sb = StringBuilder()
        sb.append(if (mresults.first != 0) "+" + mresults.first else "").append(" ").append(if (mresults.second != 0) mresults.second else "")
        println(sb)
    }
    fun run()
    {
        var count = 10
        fun printCount() = println("${count + 1} tahmin hakkınız var!")
        while (count-- > 0) {
            printCount()
            getGuess()
            checkGuess()
            printResult()
            if (isWin()) {print("Tebrikler kazandınız! Belirlenen sayı : "); mdeterminedValue.forEach { print(it) }; return}
        }
        print("Başka tahmin hakkınız kalmadı. Kaybettiniz! Belirlenen sayı : "); mdeterminedValue.forEach { print(it) }
    }
}