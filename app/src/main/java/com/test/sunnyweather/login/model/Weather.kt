package com.test.sunnyweather.login.model

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2021/2/3 3:42 PM
 * @description
 */
data class Weather (val realtime: RealtimeResponse.Realtime,val daily: DailyResponse.Daily)