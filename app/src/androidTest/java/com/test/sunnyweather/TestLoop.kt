package com.test.sunnyweather

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/12/27 10:54 PM
 * @description
 */
fun main() {
    var items : List<String> = listOf<String>("令狐冲","任盈盈","张无忌")
    items.forEach(){
        println(it)
    }
    var derry:Derry = Derry()
    derry.show()

}

class Derry{
    val  I = "AAA"
    fun show(){
        println(I)
        println(this.I)
        println(this@Derry.I)
    }
}