package com.test.sunnyweather

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/12/27 10:26 PM
 * @description
 */
fun main(){
    var name1 : String = "张三"
    var name2 : String = "张三"
    println(name1.equals(name2))
    println(name1 == name2)
    println(name1 === name2)

    val test1 : Int = 1000
    var test2 : Int = 1000
    println(test1.equals(test2))
    println(test1 == test2)
    println(test1 === test2)
}