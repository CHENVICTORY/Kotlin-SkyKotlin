package net.coocaa.skykotlin.`class`

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/21 21:14
 * @chang time
 * @describe describe
 */
class KotlinProperty(val name: String, val age: Int) {
    private val mName: String?
    private var mAge: Int

        get() = mAge

    var old: Boolean = false
        get() = age > 30

    var isChen:Boolean = false
        private set

    init {
        mName = name;
        mAge = age
    }
}