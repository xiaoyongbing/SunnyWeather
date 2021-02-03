package com.test.sunnyweather

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/12/25 9:26 PM
 * @description
 */
fun main(){
    var str  = """
        星光点亮了
          海水泛起皱着
        晚风咸咸的
        吹散身旁余热
    """.trimIndent()

    println(str)
    println(str.trim())
    println(str.trimIndent())
    println(str.trimMargin("|"))


    val str1 = "abc"
    val str2 = """value1\n
    value2
    value3
    "value4"
    """.trimIndent()
    println("$str1,$str2")

    val e = """
        我爱你，
        不仅仅是因为你的样子，
        还因为，
        和你在一起时，
        我的样子
    """.trimIndent()
    println(e)
}
