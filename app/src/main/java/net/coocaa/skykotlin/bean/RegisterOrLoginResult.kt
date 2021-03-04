package net.coocaa.skykotlin.bean

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.bean
 * @author chenguo QQ:1349100246
 * @time 2021/3/4 10:12
 * @chang time
 * @describe describe
 */
data class RegisterOrLoginResult(
    val admin: String,
    var chapterTops: List<*>,
    var coinCount: Int,
    var collectIds: List<*>,
    var email: String,
    var icon: String,
    var id: Long,
    var nickname: String,
    var password: String,
    var publicName: String,
    var token: String,
    var type: Int,
    var username: String
)
