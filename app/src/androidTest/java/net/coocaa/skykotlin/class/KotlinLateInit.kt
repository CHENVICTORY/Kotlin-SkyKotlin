package net.coocaa.skykotlin.`class`

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/26 16:56
 * @chang time
 * @describe describe
 */
class KotlinLateInit {

      var  getter:KotlinGetterAndSetter? = null

    fun setUp(){
        println("setUp")
        getter = KotlinGetterAndSetter()
    }

    fun test(){
        println("startTest")

        println(getter?.balance)
    }
}