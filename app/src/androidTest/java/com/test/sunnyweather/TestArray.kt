package com.test.sunnyweather

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/12/27 10:33 PM
 * @description
 */
public fun main() {
    //第一种 常用
    var numbers : Array<Int> = arrayOf(1,2,4,4,5,6,7)
    for(number in numbers){
        println(number)
    }

    val b = Array(3, { i -> (i * 2) })
}