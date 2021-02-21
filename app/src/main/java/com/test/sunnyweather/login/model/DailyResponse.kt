package com.test.sunnyweather.login.model

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2021/2/3 2:52 PM
 * @description
 */
/**
 * {"status":"ok",
 *  "result":{
 *      "daily":{
 *          "temperature":[{"max":25.7,"min":20.3,...}],
 *          "skycon":[{"value":"CLOUDY","date":"2019-10-20T00:00+08:00"},.....],
 *          "life_index":{
 *              "coldRisk":[{"desc":"易发"}]，
 *              "carWsahing":[{"desc":"适宜"}]，
 *              "ultraviolet":[{"desc","无"}]，
 *              "dressing":[{"desc":"舒适"}]
 *          }
 *      }
 *      }}
 */


data class DailyResponse(val status: String,val result: Result){

    data class Result(val daily: Daily)

    data class Daily(val temperature: List<Temperature>,val skycon: List<Skycon>,
                     @SerializedName("life_index") val lifeIndex: LifeIndex)

    data class Temperature(val max: Float,val min: Float)

    data class Skycon(val value:String,val date: Date)

    data class LifeIndex(val coldRisk: List<LifeDescription>,val carWashing:List<LifeDescription>
    ,val ultraviolet: List<LifeDescription>,val dressing: List<LifeDescription>)

    data class LifeDescription(val desc: String)
}