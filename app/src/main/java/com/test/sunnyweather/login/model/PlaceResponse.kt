package com.test.sunnyweather.login.model

import android.location.Address
import com.google.gson.annotations.SerializedName

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/10/17 10:12 PM
 * @description
 */

    class PlaceResponse(val status:String,val query : String,val places :List<Place>)

     class Place(val  name : String,val id : String,val location : Location,
                     @SerializedName("formatted_address") val  address: String)

    class Location(val lng:String,val lat:String)


