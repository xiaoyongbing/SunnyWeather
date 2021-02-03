package com.test.sunnyweather

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/12/25 10:10 PM
 * @description
 */
fun main(){
    for(i in 1..9){
        println(i)
    }

    var range = 10 downTo 1
    range.forEach {
        println(it)
    }
}