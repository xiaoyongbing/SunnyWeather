package com.test.sunnyweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.test.sunnyweather.logic.Repository
import com.test.sunnyweather.login.model.Location

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2021/2/3 4:47 PM
 * @description
 */
class WeatherViewModel : ViewModel() {

    private val locationLiveData = MutableLiveData<Location>()

    var locationLng = ""

    var locatonLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData){
        location -> Repository.refreshWeather(location.lng,location.lat)
    }

    fun refreshWeather(lng: String,lat: String){
        locationLiveData.value = Location(lng,lat)
    }
}