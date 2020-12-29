package com.example.sunnyweather2.android.logic.network

import com.example.sunnyweather2.android.SunnyWeatherApplication
import com.example.sunnyweather2.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    //    https://api.caiyunapp.com/v2/place?query=%E5%8C%97%E4%BA%AC&token={IbxcHZ0d74RhJ2gv}&lang=zh_CN
//    @GET("v2/place?query={query}&token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}