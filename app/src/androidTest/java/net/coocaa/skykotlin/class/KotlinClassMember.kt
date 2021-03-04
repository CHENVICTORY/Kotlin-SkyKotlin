package net.coocaa.skykotlin.`class`

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/21 11:33
 * @chang time
 * @describe describe
 */
class KotlinClassMember : Any() {
}

/**
 * 如果一个类没有使用open修饰，表明这个类是不可以被继承的，就像java中，默认添加了final属性。
 * 如果添加了 open修饰，表明这个类是可以被继承的。
 */
open class MyView: View  {
    constructor(ctx: Context):super(ctx)

    constructor(ctx:Context,attrs:AttributeSet):super(ctx,attrs)
}

class MyView2:MyView{
    constructor(ctx:Context):super(ctx)
}
