package net.coocaa.skykotlin.`class`

import android.content.Context
import android.content.Intent

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/21 20:38
 * @chang time
 * @describe describe
 */

open class Base{
    open fun f(){
        KotlinStaticMethod.printLog("你好")
        StaticClass.printLog("我不好")
    }
}

abstract class KotlinAbstractClass:Base() {
    abstract override fun f()
}


fun startIntent(context: Context, intent: Intent){

}

