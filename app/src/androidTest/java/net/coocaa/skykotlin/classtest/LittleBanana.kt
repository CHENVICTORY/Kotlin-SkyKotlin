package net.coocaa.skykotlin.classtest

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.classtest
 * @author chenguo QQ:1349100246
 * @time 2021/2/22 16:54
 * @chang time
 * @describe describe
 */
class LittleBanana :Banana() {

    override fun getName(): String {
        return super.getName()
    }

    //父类中的 函数加入了final ，子类不可以进行复写
}