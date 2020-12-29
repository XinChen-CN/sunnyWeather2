package com.example.sunnyweather2.android.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

class DailyResponse(val status: String, val result: Result) {
    //    data class Result(val daily: Daily)
//    data class Daily(
//        val temperature: List<Temperature>, val skycon: List<Skycon>,
//        @SerializedName("life_index") val lifeIndex: lifeIndex,
//    )
//
//    data class Temperature(val max: Float, val min: Float)
//    data class Skycon(val value: String, val date: Date)
//    data class lifeIndex(
//        val coldRisk: List<LifeDescription>,//感冒风险
//        val carWashing: List<LifeDescription>,//洗车
//        val ultraviolet: List<LifeDescription>,//紫外线辐射
//        val dressing: List<LifeDescription>,//穿衣
//    )
//
//    data class LifeDescription(val desc: String)
    class Result(val daily: Daily)

    class Daily(
        val temperature: List<Temperature>,
        val skycon: List<Skycon>,
        @SerializedName("life_index") val lifeIndex: LifeIndex
    )

    class Temperature(val max: Float, val min: Float)

    class Skycon(val value: String, val date: Date)

    class LifeIndex(
        val coldRisk: List<LifeDescription>,
        val carWashing: List<LifeDescription>,
        val ultraviolet: List<LifeDescription>,
        val dressing: List<LifeDescription>
    )

    class LifeDescription(val desc: String)
}