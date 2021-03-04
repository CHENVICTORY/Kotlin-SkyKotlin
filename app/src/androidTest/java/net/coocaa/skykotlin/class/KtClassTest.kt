package net.coocaa.skykotlin.`class`

import android.util.Log

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.`class`
 * @author chenguo QQ:1349100246
 * @time 2021/1/20 20:09
 * @chang time
 * @describe describe
 */
class KtClassTest {

}

/**
 * 可以直接省略类体，连大括号都不用
 */
class KtClassTest2


class KtClassTest3 constructor(classNum:Int){

}


class KtClassTest4 constructor(classNum:Int,name:String){

}

/**
 * 如果构造函数没有限定范围，可以直接进行省略
 */
class KtClassTest5  (classNum:Int)


class KtClassTest6  (classNum:Int){
    init {
        Log.d("KtClassTest6","current inited with $classNum")
    }
}


class KtClassTest7  (className:String){
    val className = className.toUpperCase();
}


class Customer public  constructor(name:String){

}

class Person{
    var name:String = ""
    var age:Int = 0


    constructor(parent:Person){

    }
}

/**
 * 如果在主构造函数中声明了变量，就相当于在类中声明了相应的属性。
 */
class Person2(val name:String,val age :Int){

    /**
     * init 函数是在函数调用构造函数时进行调用的。
     */
 init {
     println("Person name : $name,age is $age")
 }

    fun upperCase(){
        println("Name to uppercase:${name.toUpperCase()}, Age to upperCase:${age.toString().toUpperCase()}")
    }
}

/**
 * 如果没有定义主构造函数， 次构造函数可以不进行引用
 */
class Person3{
    constructor(name:String) {

    }
}

/**
 *  类名后面的括号表示定义了主构造函数（无论主构造函数有没有参数），所有的次级构造函数必须直接或者间接的引用
 */
class Person4(){
    init {
        println("create Person4")
    }

    /**
     * 此构造函数引用了主构造函数
     */
    constructor(name:String,age :Int):this(){

    }

    /**
     * 此构造函数引用了有两个参数的构造函数。
     */
    constructor(name:String,age:Int,sex:String):this(name,age){
       // var no = NoConstructor();  由于构造函数是空的
        val person5 = Person5();

    }


}

class NoConstructor private constructor(){
        init {

        }
}

class Person5 constructor(val name:String = "NoName"){

}