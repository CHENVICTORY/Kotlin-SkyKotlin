package net.coocaa.skykotlin.test

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.test
 * @author chenguo QQ:1349100246
 * @time 2020/12/23 19:38
 * @chang time
 * @describe describe
 */
class KTTest {
    val PI = 3.14;
    var x = 0;


    //字符模板
    var a = "ss";

    var b = "a is $a"
    var s2 = "${b.replace("is", "was")},but now is $b"


    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    fun maxOf2(a:Int ,b :Int) = if (a>b)a else b;
    fun maxOf3(a:Int ,b :Int):Int{
        return if (a > b) {
            a;
        } else {
            b;
        }
    }

    // 空值与 Null检测

    fun parseInt(str:String): Int?{
        if(str == null){
            return  null;
        }
        return Integer.parseInt(str);
    }


    fun getStringLength(obt:Any):Int?{
        if(obt is String){
            return obt.length;
        }
        return null;
    }

    fun getStringLength2(obt:Any):Int?{
        return  if(obt is String){
             obt.length;
        }else{
            null;
        }

    }

    // for 循环

    private val items = listOf("a","hello","wokaka")

   fun printStringList(){
       println(items.toString())
       for(item in items){
           println(item)
       }

       for (i in items.indices){
           println("item ad $i is ${items[i]}")
       }
   }

    fun main( ){
        printStringList()
    }

}