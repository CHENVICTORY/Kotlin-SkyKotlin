package net.coocaa.skykotlin.test

import java.lang.IllegalArgumentException

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.test
 * @author chenguo QQ:1349100246
 * @time 2021/1/18 20:17
 * @chang time
 * @describe describe
 */
class IntegerTest {
    fun intCompare() {
        val a: Int = 1000
        println(a === a) // true
        val boxedA: Int? = a; //这里针对a进行了一次装箱操作，表示当前应用
        val anotherBoxedA: Int? = a;
        println(boxedA === anotherBoxedA) // false
        println(boxedA == anotherBoxedA) // true表示他们的值是相等的

        val x = ((1) and 0x000f00) shl 2 // 取出某一数字的十六进制中的第三位
    }

    fun charToInt(c: Char): Int {
        if (c !in '0'..'9') {
            throw IllegalArgumentException("Illegal argument/。")
        }
        for (x in '0'..'9')
            println(x)
        println('a'.toInt())
        println('A'.toInt())
         val success :Boolean = true;
        return (c.toInt() - '0'.toInt())
    }
}

fun main() {
    val i = IntegerTest()
    i.charToInt('5')
}