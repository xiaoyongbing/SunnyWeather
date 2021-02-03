package com.test.sunnyweather.login.network

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.await
import java.lang.RuntimeException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/11/13 5:43 PM
 * @description
 */
object SunnyWeatherNetwork {
    private val placeService = ServiceCreator.create(PlaceService::class.java)

    suspend fun searchPlaces(query: String) = placeService.searchPlaces(query).await()
    
    private suspend fun <T> Call<T>.await(): T{
        return suspendCoroutine { continuation -> enqueue(object :Callback<T>{
            override fun onResponse(call: Call<T>, response: Response<T>) {
                val body = response.body()
                if(body != null) continuation.resume(body)
                else continuation.resumeWithException(RuntimeException("response body is null"))
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                //
                continuation.resumeWithException(t);
            }
        }
        )
        }
    }

    
}