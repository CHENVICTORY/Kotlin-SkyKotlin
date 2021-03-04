package net.coocaa.skykotlin.test

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.test
 * @author chenguo QQ:1349100246
 * @time 2021/1/18 20:44
 * @chang time
 * @describe describe
 */
class ArrayTest {

    fun testArray(size :Int){
        var arr = Array(size) { i -> (i * i).toString() }
        for (x in arr){
            println(x)
        }
        //arr[6] = 36.toString() //这里会报错， 因为当前数组的大小已经确定，

    }



}

fun main() {
    val t = ArrayTest()
    t.testArray(6)
}