package org.csystem.examples.homework_7

import org.csystem.examples.homework_2.isPrime
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random


class BingoSimulation (private var random : Random) {
    private val tokens : BooleanArray = BooleanArray(100)
    private var tokensTotal : Int = 0

    init {
        random = Random
        for (i in tokens.indices)
            tokens[i] = true
    }

    fun isTotalTokenLessThan150() : Boolean {pick3Tokens(); return tokensTotal < 150}

    fun isPrimeTotalToken() : Boolean {pick3Tokens(); return isPrime(tokensTotal.toLong())}

    fun isSubtractGreaterThanMid() : Boolean
    {
        val x = pickToken()
        val y = pickToken()
        val z = pickToken()

        val max = max(max(x, y), z)
        val min = min(min(x, y), z)
        tokensTotal = x + y + z
        val mid = tokensTotal - max - min

        return max - min > mid
    }

    private fun pick3Tokens()
    {
        for (i in 1..3) {
            tokensTotal += pickToken()
        }
    }
    private fun pickToken() : Int
    {
        var i : Int

        while (true) {
            i = random.nextInt(1, 100)
            if (tokens[i]) {
                tokens[i] = false
                break
            }
        }
        return i
    }
}
