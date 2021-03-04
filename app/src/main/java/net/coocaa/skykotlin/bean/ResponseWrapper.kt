package net.coocaa.skykotlin.bean

/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.bean
 * @author chenguo QQ:1349100246
 * @time 2021/3/3 17:42
 * @chang time
 * @describe describe
 */
data class ResponseWrapper<T>(val data: T, val errorCode: Long, val errorMsg: String)
