package net.coocaa.skykotlin.`class`

import java.io.Console

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/26 16:12
 * @chang time
 * @describe describe
 */
class KotlinGSTest {

    fun testGetterAndSetter() {
        /*    var g: KotlinGetterAndSetter = KotlinGetterAndSetter();
            g.age = 12;
            g.name = "chenguo"
            g.balance = 9.8
            println(g.age)
            println(g.name)
            println(g.balance)
            println(SUB_SYSTEM_DEPRACHED)*/
        var lateIntObjet = KotlinLateInit()
        lateIntObjet.test()

    }

    companion object invokeMethod {
        @JvmField
        var flat = true;
        fun plus(num1: Int, num2: Int): Int {
            return num1 + num2;
        }
    }
}

fun main() {
    KotlinGSTest().testGetterAndSetter()
    println(KotlinGSTest.plus(1, 2))
    println(KotlinGSTest.flat)
}