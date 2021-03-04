package net.coocaa.skykotlin.`class`

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/21 20:56
 * @chang time
 * @describe describe
 */

//使用object修饰类，然后这个类里的方法都可以进行静态调用
object KotlinStaticMethod {  //使用object修饰类名，表示
    fun printLog(content:String){
        println(content)
    }

}

//或者使用伴生类， 伴生类内的方法也可以使用类名+方法名来进行调用
class StaticClass{
    companion object{
        fun printLog(content:String){
            println(content)
        }
    }
}

