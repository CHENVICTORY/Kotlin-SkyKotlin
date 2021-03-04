package net.coocaa.skykotlin.`class`

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/26 17:07
 * @chang time
 * @describe describe
 */
interface KotlinInterface {

    val nameProp: String

    val ageProp: Int
        get() = getAge()



    fun getAge(): Int
}