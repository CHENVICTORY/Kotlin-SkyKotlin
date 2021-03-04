package net.coocaa.skykotlin.api

import io.reactivex.Observable
import net.coocaa.skykotlin.bean.RegisterOrLoginResult
import net.coocaa.skykotlin.bean.ResponseWrapper
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


/**
 * @name SkyKotlin
 * @package name：net.coocaa.skykotlin.network
 * @author chenguo QQ:1349100246
 * @time 2021/3/3 17:05
 * @chang time
 * @describe describe
 */
public interface API<T> {


    // https://www.wanandroid.com/user/login
    @POST("user/login")
    @FormUrlEncoded
    fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): Observable<ResponseWrapper<RegisterOrLoginResult>>


    @POST("user/register")
    @FormUrlEncoded
    fun register(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("repassword") repassword: String
    ): Observable<ResponseWrapper<RegisterOrLoginResult>>

}