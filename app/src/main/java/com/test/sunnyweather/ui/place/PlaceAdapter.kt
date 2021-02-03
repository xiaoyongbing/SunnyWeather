package com.test.sunnyweather.ui.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.test.sunnyweather.R
import com.test.sunnyweather.login.model.Place

/**
 * Copyright (c) 2019 深圳市爱都科技有限公司. All rights reserved.
 * @Author:         xyb
 * @CreateDate:     2020/11/22 10:58 AM
 * @description
 */
class PlaceAdapter(private val fragment: Fragment,private val placeList : List<Place>)
    : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val placeName : TextView = view.findViewById(R.id.placeName)
        val placeAddress : TextView = view.findViewById(R.id.placeAddress)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceAdapter.ViewHolder {
        //return ViewHolder(view = )
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_item,parent,false);
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return placeList.size
    }

    override fun onBindViewHolder(holder: PlaceAdapter.ViewHolder, position: Int) {
        //TODO("Not yet implemented")
        val place = placeList[position]
        holder.placeName.text = place.name
        holder.placeAddress.text = place.address
    }


}