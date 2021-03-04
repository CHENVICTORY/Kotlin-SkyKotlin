package net.coocaa.skykotlin.classtest

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.classtest
 * @author chenguo QQ:1349100246
 * @time 2021/2/22 15:01
 * @chang time
 * @describe describe
 */
abstract class Colorable {
    abstract fun getColor(): String

    abstract fun getName(): String


    open fun printer() {

        println("this is colorAble")
    }
}