package com.example.sunnyweather2.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.example.sunnyweather2.android.SunnyWeatherApplication
import com.example.sunnyweather2.android.logic.model.Place
import com.google.gson.Gson

object PlaceDao {
    //用于将Place对象存储到SharePreferences文件中
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    //用于将JSON字符串从SharePreferences文件中读取出来
    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    //判断是否有数据被存储
    fun isPlaceSaved() = sharedPreferences().contains("place")

    //
    private fun sharedPreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}