package org.csystem.examples.homework_2

fun runBallFall()
{
    print("Input the height value : ")
    val height = readln().toInt()
    print("Input the width value : ")
    val width = readln().toInt()

    play(width, height)

}

fun printBall(ballIndex : Int, end : Int)
{
    fillSpace(1, ballIndex)
    print("*")
    fillSpace(ballIndex + 1, end - 1)
}

fun fillSpace(begin : Int, end : Int)
{
    for (i in begin..end step 1)
        print(" ")
}
fun calculateRightFlag(isRight : Boolean, ballIndex : Int, width : Int) : Boolean
{
    var isRight = isRight
    if (ballIndex == 0)
        isRight = true;
    else if (ballIndex == width - 1)
        isRight = false;

    return isRight;
}

fun calculateBallIndex(ballIndex : Int, isRight : Boolean) : Int
{
    if (isRight)
        return ballIndex + 1;

    return ballIndex - 1;
}

fun play(width : Int, height : Int)
{
    var ballIndex = 0;
    var isRight = false;

    for (i in 1..height step 1) {
        print("|")
        printBall(ballIndex, width);
        if (width != 1) {
            isRight = calculateRightFlag(isRight, ballIndex, width);
            ballIndex = calculateBallIndex(ballIndex, isRight);
        }
        println("|")
    }
}
