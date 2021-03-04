package net.coocaa.skykotlin.test

import java.io.File
import java.lang.IllegalArgumentException
import java.nio.file.Files
import java.nio.file.OpenOption
import java.nio.file.StandardOpenOption

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.test
 * @author chenguo QQ:1349100246
 * @time 2021/1/18 15:56
 * @chang time
 * @describe describe
 */
class UsualLanguage {
    data class Consumer(val name: String, val email: String);
    private val name: String by lazy {
        return@lazy "dksjfk"
    }

/*    */
    /**
     * 可以自己定义 String类的扩展函数
     *//*
    fun String.spaceToCamelCase():String{

    }*/

    object UsualLanguage {

    }


    fun foo(a: Int = 0, b: String = "") {
        val a = intArrayOf(1, 2, 56, 7, 89, 4, -9, -45, -0)
        val positives = a.filter { x -> x > 0 }
        for (x in positives)
            println(x)
        println("================== $name")
        val b: Map<String, String> = mapOf("r" to "red", "g" to "green", "y" to "yellow")
        for ((x, y) in b) {
            println("$x -> $y")
        }

    }


    fun transFormStringToColor(co: String): Int {
        return when (co) {
            "red" -> 0;
            "green" -> 1;
            "black" -> 2
            else -> throw IllegalArgumentException("Invalid color param value.")
        }
    }

    fun arrOfMinusOnes(length:Int):IntArray{
        return IntArray(length).apply { fill(-1) }
    }

    /**
     * 从指定路径文件中读取文字信息的方法。
     */
   public fun printFileContent(path:String){
        val stream =File(path);
      var fileStream =  Files.newInputStream(stream.toPath(),StandardOpenOption.WRITE)
        fileStream.buffered().reader().use {
            outer ->
            println(outer.readText())
        }

    }

}

fun main() {
    val u = UsualLanguage();
    try {
        u.foo()
    } catch (e: IndexOutOfBoundsException) {

    }finally {

    }
    with(u){
        foo(1,"")

    }
}