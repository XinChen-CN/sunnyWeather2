package com.example.sunnyweather2.android.logic.model

import com.google.gson.annotations.SerializedName

data class RealtimeResponse(val status: String, val result: Result) {
    /*data class Result(val realtime: Realtime)
    data class Realtime(
        val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality,
    )

    data class AirQuality(val aqi: AQI)
    data class AQI(val chn: Float)*/
    class Result(val realtime: Realtime)

    class Realtime(
        val skycon: String,
        val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    class AirQuality(val aqi: AQI)

    class AQI(val chn: Float)

}