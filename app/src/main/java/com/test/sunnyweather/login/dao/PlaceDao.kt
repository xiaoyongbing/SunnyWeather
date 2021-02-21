package com.test.sunnyweather.login.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.test.sunnyweather.SunnyWeatherApplication
import com.test.sunnyweather.login.model.Place

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2021/2/5 2:32 PM
 * @description
 */
object PlaceDao {

    fun savePlace(place : Place){
        sharePreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace() : Place{
        val placeJson = sharePreferences().getString("place","")
        return Gson().fromJson(placeJson,Place::class.java)
    }

    fun isPlaceSaved() = sharePreferences().contains("place")


    private fun sharePreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather",Context.MODE_PRIVATE)
}