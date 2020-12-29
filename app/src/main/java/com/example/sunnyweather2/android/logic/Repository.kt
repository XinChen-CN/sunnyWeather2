package com.example.sunnyweather2.android.logic

import android.util.Log
import androidx.lifecycle.liveData
import com.example.sunnyweather2.android.logic.model.Place
import com.example.sunnyweather2.android.logic.model.Weather
import com.example.sunnyweather2.android.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlin.Exception
import kotlin.RuntimeException
import kotlin.coroutines.CoroutineContext

object Repository {
    //    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
    fun searchPlaces(query: String) = fire(Dispatchers.IO) {
//        val result = try {
        val placeResponse = SunnyWeatherNetwork.searchPlaces(query)

        //test
        Log.d("Repository", placeResponse.toString())

        if (placeResponse.status == "ok") {
            val places = placeResponse.places
            Result.success(places)
        } else {
            Result.failure(RuntimeException("response status is ${placeResponse.status}"))
        }
//        } catch (e: Exception) {
//            Result.failure<List<Place>>(e)
//        }
//        emit(result)
    }

    //刷新天气信息
    fun refreshWeather(lng: String, lat: String) = fire(Dispatchers.IO) {
        /*val result = try {*/
        coroutineScope {
            val deferredRealtime = async {
                SunnyWeatherNetwork.getRealtimeWeather(lng, lat)
            }
            val deferredDaily = async {
                SunnyWeatherNetwork.getDailyWeather(lng, lat)
            }
            val realtimeResponse = deferredRealtime.await()
            val dailyResponse = deferredDaily.await()
            if (realtimeResponse.status == "ok" && dailyResponse.status == "ok") {
                val weather =
                    Weather(realtimeResponse.result.realtime, dailyResponse.result.daily)
                Result.success(weather)
            } else {
                Result.failure(
                    RuntimeException("realtime response status is ${realtimeResponse.status}" + "daily response status is ${dailyResponse.status}")
                )
            }
        }
        /*} catch (e: Exception) {
            Result.failure<Weather>(e)
        }
        emit(result)*/
    }

    private fun <T> fire(context: CoroutineContext, block: suspend () -> Result<T>) =
        liveData<Result<T>>(context) {
            var result = try {
                block()
            } catch (e: Exception) {
                Result.failure<T>(e)
            }
            emit(result)
        }

}