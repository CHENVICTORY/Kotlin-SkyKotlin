package net.coocaa.skykotlin.test

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.test
 * @author chenguo QQ:1349100246
 * @time 2020/12/24 21:42
 * @chang time
 * @describe describe
 */
public class KtRange {
    val x = 10
    val y = 9
     public fun print(){
        if(y in 1..x){
            println("$y is in Range.")
        }
    }


    // 区间内进行迭代。
    fun ranger(){
        for (x in 1..9){
            println(x)
        }
    }

    //数列迭代

    fun ranger2(){
        for (y in 1..50 step  5){
            println(y)
        }
        for (x in 100 downTo  3 step 5){
            println(x)
        }
    }
    // 使用lambda 表达式来过滤
    val fruits = listOf("orange","banana","apple","kiwifruit")
    fun testLambda(){
        val filter = fruits.filter { it.startsWith("a") }
        val map = filter.map {
            println(it)
            it.toUpperCase()
        }

    }

    fun printArrayTest(){
        val a = intArrayOf(1,2,34,45,6,7,8)
        for (x in 0..a.lastIndex )
            println(x)
        println("-------------------start2-----------")

        val length = a.size
        for (i in 0 until length){
            for (j in 0 until (length-i-1)){
                val temp = a[j];
                if(temp > a[j+1]){
                    a[j]= a[j+1]
                    a[j+1] = temp
                }
            }
        }
        for (x in a)
            println(x)


    }

}
fun main(){
    println("-------------------start-----------")
    var ra = KtRange();
    ra.printArrayTest()
}