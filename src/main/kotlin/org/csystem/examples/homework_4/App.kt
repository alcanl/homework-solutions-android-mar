package org.csystem.examples.homework_4

import kotlin.math.max
import kotlin.math.min

fun main() = runApp();

fun runApp()
{
    var max = 0; var min = 0; var avg = .0; var total = 0; var count = 0

    do {
        print("Bir tamsayı giriniz : ")
        val value = readln().toInt();
        if (value < 0 || value > 100) {
            print("Geçersiz değer girdiniz !...\nYeni bir değer giriniz : ")
            continue
        }
        ++count
        max = max(max, value)
        min = min(min, value)
        total += value
        avg = total / count.toDouble()
    } while (continueVal() == 1)
    println(endLine(max, min, count, avg))

}
fun continueVal(): Int {

    while (true) {
        print("Yeni bir değer girmek istiyor musunuz? [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]")
        val temp = readln().toInt()
        if (temp == 1 || temp == 0)
            return temp
        println("Geçersiz bir değer girdiniz!")
    }
}
fun endLine(max : Int = 0, min : Int = 0, count : Int = 1, avg : Double = .0) : String
{
    return "Toplam $count değer girildi\nMax = $max\nMin = $min\nOrtalama = $avg"
}