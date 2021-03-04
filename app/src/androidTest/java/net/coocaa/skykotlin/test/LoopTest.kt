package net.coocaa.skykotlin.test

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.test
 * @author chenguo QQ:1349100246
 * @time 2021/1/18 21:08
 * @chang time
 * @describe describe
 */
var nullableString: String? = null;

class LoopTest {
    fun testLoop() {
        tag@ for (x in 0..4) {
            for (y in 9..100 step 3) {
                if (y == 21) {
                    break@tag
                }
                continue;
            }
        }
    }


}

class User {
    var name: String = ""

        set(value) {
            field = name + "chen"
        }
    var age: Int = 0
}

fun main() {
    println(nullableString?.length)

    /*   if(nullableString !=null){
           println(nullableString.length)
       }*/

    var user: User = User()
    if (!user.name.isNullOrBlank()) {

    }
}