package com.test.sunnyweather

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/12/25 9:49 PM
 * @description
 */
fun main(){
    var info :String ? = null
    //第一种补救措施
    println(info?.length)
    //第二种补救方式 info ！！ 我自己负责 我确定info 不为空
    //println(info!!.length)
    //
    if(info != null){
        println(info.length)
    }

    println(testMethod(""))

}

fun testMethod(name :String):Int?{
    if(name == "张三"){
        return 99
    }else{}
    return null
}