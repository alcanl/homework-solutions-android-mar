package org.csystem.examples.homework_8

import java.lang.Character.*

fun getSubstring(s : String): String {

    if (!s.contains('{') || !s.contains('}'))
        return "yanlış bir giriş"

    return s.substringAfterLast('{').substringBefore('}')
}

fun printQueuedLine(s : String) {for (i in s) println(i)}

fun getStringInParanthesis(s : String) : String
{
    var sb = StringBuilder()
    return sb.append('(').append(s.trim()).append(')').toString()
}

fun squeeze(s1 : String, s2 : String) : String
{
    var sb = StringBuilder()

    for (s in s1)
        if (!s2.contains(s))
            sb.append(s)

    return sb.toString()
}

fun changeCase(s : String) : String
{
    var sb = StringBuilder()
    for (i in s)
        sb.append(if (isUpperCase(i)) i.lowercaseChar() else i.uppercaseChar())

    return sb.toString()
}

fun isIdentifier(s : String) : Boolean
{
    if (isDigit(s[0]))
        return false

    for (i in s)
        if (!isLetter(i) && i != '_' && !isDigit(i))
            return false

    return true
}