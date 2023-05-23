package org.csystem.examples.homework_6

import kotlin.random.Random

class CrapsSimulation (val random: Random = Random) {
    private var totalDices : Int = 0


    private fun isWin() : Boolean = when (totalDices) {
        7, 11 -> true
        2, 3, 12 -> false
        else -> isNextTourWin()
    }

    private fun isNextTourWin(): Boolean {
        var temp : Int
        while (totalDices != 7) {
            temp = totalDices
            rollDices()
            if (temp == totalDices)
                return true
        }
        return false
    }
    private fun printResult() : String = if (isWin()) "Tebrikler kazandınız!" else "Üzgünüm, kaybettiniz!"
    private fun rollDices() {totalDices = random.nextInt(1, 7) + random.nextInt(1, 7)}

    fun run() {
        rollDices()
        println(printResult())
    }
}
