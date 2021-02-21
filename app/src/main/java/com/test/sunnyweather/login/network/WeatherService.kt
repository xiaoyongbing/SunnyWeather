package com.test.sunnyweather.login.network

import com.test.sunnyweather.SunnyWeatherApplication
import com.test.sunnyweather.login.model.DailyResponse
import retrofit2.http.GET
import retrofit2.http.Path
import com.test.sunnyweather.login.model.RealtimeResponse
import retrofit2.Call

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2021/2/3 3:46 PM
 * @description
 */
interface WeatherService {

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng:String,@Path("lat") lat:String):
            Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String,@Path("lat") lat:String):
            Call<DailyResponse>


}