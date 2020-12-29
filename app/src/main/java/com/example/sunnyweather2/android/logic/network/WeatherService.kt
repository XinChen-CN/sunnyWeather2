package com.example.sunnyweather2.android.logic.network

import com.example.sunnyweather2.android.SunnyWeatherApplication
import com.example.sunnyweather2.android.logic.model.DailyResponse
import com.example.sunnyweather2.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
//    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
////    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/lng?,lat?/daily.json")
//    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
//
//    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
////    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/lng?,lat?/realtime.json")
//    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String, ): Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>

}