package net.coocaa.skykotlin.`class`

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/21 20:12
 * @chang time
 * @describe describe
 */
open class KotlinClassOverrideMember {
    //使用open 修饰一个方法表示这个方法可以被重写
    open fun v(){

    }
    open fun v(name:String){}

    fun nv(){

    }
}

open class OverrideKotlin: KotlinClassOverrideMember() {
    final override fun v() {

    }
    fun writeName(){}

}

class OverRideRideKotlin:OverrideKotlin(){

}