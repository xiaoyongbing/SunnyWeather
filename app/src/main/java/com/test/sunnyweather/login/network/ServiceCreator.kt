package com.test.sunnyweather.login.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/11/13 5:30 PM
 * @description
 */
object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/";

    private val retrofit =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

    fun <T> create(serviceClass: Class<T>) : T = retrofit.create(serviceClass)

    inline fun <reified T> create(): T = create(T::class.java)
}