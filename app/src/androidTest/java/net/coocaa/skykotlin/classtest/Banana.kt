package net.coocaa.skykotlin.classtest

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.classtest
 * @author chenguo QQ:1349100246
 * @time 2021/2/22 15:05
 * @chang time
 * @describe describe
 */
open class Banana : Colorable(), IEatable {
    final override fun getColor(): String {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun flavor(): String {
        TODO("Not yet implemented")
    }

    companion object {
        fun getName(): String {
            TODO("Not yet implemented")
        }
    }

    override fun printer() {
        super<IEatable>.printer()
    }
}