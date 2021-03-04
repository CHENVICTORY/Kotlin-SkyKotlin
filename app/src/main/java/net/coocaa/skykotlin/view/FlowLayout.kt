package net.coocaa.skykotlin.view

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import net.coocaa.skykotlin.bean.User

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.view
 * @author chenguo QQ:1349100246
 * @time 2021/2/22 19:26
 * @chang time
 * @describe describe
 */
public class FlowLayout(context: Context, attr: AttributeSet?, defStyle: Int) :
    ViewGroup(context, attr, defStyle) {
    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        TODO("Not yet implemented")
        var user:User = User("chen",3)
        var (name, age) = user
        var any: Any?
    }
}

