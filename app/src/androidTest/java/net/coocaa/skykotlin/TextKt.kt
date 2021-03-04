package net.coocaa.skykotlin

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin
 * @author chenguo QQ:1349100246
 * @time 2020/12/22 20:17
 * @chang time
 * @describe describe
 */
fun main() {
    val a: Int = 0; // 使用val关键字声明的变量，不可进行改变值
    //a = 4; //程序报错，a不可以被重新赋值

    val a1 = 4  // 可以不进行类型声明，自动推断类型

    val tmpValue :Int;
    var tempV :Int;
    val add :Int
    add =5;



    var b: Int = 4;
    b = 5; //这里没有问题，使用var 声明的变量，可以重新进行赋值

    var b1 = 5; // 可以不进行声明类型，自动推断类型
    // b1 = 3.4; // 报错， 类型已经固定


    val c = intArrayOf(1, 2, 3) // 将c声明为一个数组，上面我们说了使用val声明变量，c不可以改变
    c[0] = 3; // 这里赋值成功了 //说明数组的元素是可以变的，说明引用不可变，但是引用对象是可以变的
    println(c[0])
}

fun sum(a: Int, b: Int): Int { // 定义一个有int型返回值的函数
    return a + b
}


fun sum2(a: Int, b: Int) = a + b //可以直接用一个表达式表示当前的函数。

fun printer(A: String, B: String) { //可以不声明函数的返回值，表示是一个空函数
    print("sum of $A and $B is ${A + B}")
}

fun printer2(A: String, B: String): Unit { // 也可以通过使用Unit声明函数返回一个无意义的值。
    print("sum of $A and $B is ${A + B}")

    val c: Int
    var b :Int


}

fun printSum(a:Int, b :Int):Unit{
    print("sum of $a and $b is ${a+b}")
}
fun printSum2(a:Int, b :Int){
    print("sum of $a and $b is ${a+b}")
}


fun printArray(args:Array<String>){
    if(args.isEmpty()){
        return;
    }
    print("First parameter is ${args[0]}")
}

fun parseInt(param:String):Int?{
    return null;
}


fun parseParameter( ob:Any):Any?{
    if(ob is Int){
        return  ob
    }
    if(ob is String){
        return  ob
    }
    return null
}

fun printArray2(args : Array<String>){
    for (a in args) print(a)
    for (a in args.indices) print(args[a])
}







