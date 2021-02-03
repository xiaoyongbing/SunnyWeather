 package com.test.sunnyweather.logic

import androidx.lifecycle.liveData
import com.test.sunnyweather.login.model.Place
import com.test.sunnyweather.login.model.PlaceResponse
import com.test.sunnyweather.login.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/11/21 9:50 PM
 * @description
 */
object Repository {
    fun searchPlaces(query : String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if(placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e : Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result as Result<List<Place>>)
    }
}