package net.coocaa.skykotlin.`class`

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/2/7 16:55
 * @chang time
 * @describe describe
 */
class Kotlin_expand {

    val list = mutableListOf<Int>(1,2,3);

    fun MutableList<Int>.swap(x:Int, y:Int){
        val tmp = this[x];
        this[x] = this[y];
        this[y] = tmp;
    }

    fun testSwap(){
    }

}


fun main() {


}