package com.test.sunnyweather

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/12/27 10:42 PM
 * @description
 */
fun main() {
    var number1 : Int = 99999
    var number2 : Int = 88888;

    var maxValue : Int = if(number1 > number2) number1 else number2
    println(maxValue)

    val numer = 5
    when(numer){
        1 -> println(1)
        2 -> println(2)
        3 -> println(3)
        4 -> println(4)
        5 -> println(5)
        else -> println(6)

    }

    var number3 : Int = 3

    val result: Any = when(number3){
        1->{
           4
        }
        2->{
            "nihao"
        }
        3->{
            "星辰大海"
        }
        else -> {
            ""
        }
    }
    println(result)
}