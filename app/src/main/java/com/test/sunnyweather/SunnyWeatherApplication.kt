package com.test.sunnyweather


import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/10/17 10:00 PM
 * @description
 */
class SunnyWeatherApplication : Application() {


    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "k3jGWcbU44YSjoEW"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}