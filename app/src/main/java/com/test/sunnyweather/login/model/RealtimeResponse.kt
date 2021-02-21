package com.test.sunnyweather.login.model

import com.google.gson.annotations.SerializedName

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2021/2/3 2:45 PM
 * @description
 */

/**
 * "status":"ok",
 * "result":{
 *      "realtime":{
 *          "temperature":23.16,
 *          "skycon":"WIND",
 *          "air_quality":{
 *              "aqi":{"chn":17.0}
 *          }
 *      }
 * }
 */
data class RealtimeResponse(val status: String, val result: Result){


    data class Result(val realtime : Realtime)

    data class Realtime(val skycon: String,val temperature: Float,
                        @SerializedName("air_quality") val airQuality: AirQuality)

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}