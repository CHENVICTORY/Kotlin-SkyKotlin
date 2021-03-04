package net.coocaa.skykotlin.`class`

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/21 20:21
 * @chang time
 * @describe describe
 */
open class KotlinExtend {
    open fun f() {
        println(" f function")
    }

    fun a(){
        println(" a function")
    }
}

interface  B{
    fun f(){
        println("B.f function")
    }

    fun b(){
        println("B.b function")
    }
}

open class C:B {

}

open class D:KotlinExtend(){

}

class E:KotlinExtend(),B{
    override fun f() { // 由于Class E 从 B继承了函数f(),同时也从KotlinExtend中继承了函数f(), 所以这里必须进行重写，表示引用的是哪一个函数f
        super<KotlinExtend>.f()  // 通过Super<T>形式，表明调用的是哪一个父类的函数。
        super<B>.f()
    }
}

class F:D(),B{
    override fun f() {
        TODO("Not yet implemented")
    } // class F的直接父类， 只有B

}