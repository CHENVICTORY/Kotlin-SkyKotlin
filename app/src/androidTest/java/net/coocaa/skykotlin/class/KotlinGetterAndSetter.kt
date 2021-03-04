package net.coocaa.skykotlin.`class`

import android.content.res.AssetFileDescriptor
import java.lang.AssertionError
import javax.inject.Inject

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/26 16:11
 * @chang time
 * @describe describe
 */
const val SUB_SYSTEM_DEPRACHED : String = "This is deprecated"



class KotlinGetterAndSetter {



    var name = ""
    var age = 0
        get() {
            println("age get invoke")
            return field
        }
    var balance: Double = 0.0
        get() {
            println("balance get invoke")
            //return  balance  //这里不能直接返回balance， 只能返回field
            return field
        }


    var isChild: Boolean = false
        get() = age > 14
        set(value) {
            field = value
        }

    override fun toString(): String {
        return super.toString()
    }

    private var _table: Map<String, Int>? = null
     public var table: Map<String, Int> = TODO()
        get() {
            if (_table == null) {
                _table = HashMap();
            }
            return _table ?: throw  AssertionError("dfsd");
        }

    @Deprecated(SUB_SYSTEM_DEPRACHED)
    fun foo(){

    }

}