package com.example.sunnyweather2.android.logic.model

import com.example.sunnyweather2.R

class Sky(val info: String, val icon: Int, val bg: Int)

/*
private val sky = mapOf(
    "CLEAR_DAY" to Sky("晴", drawable.ic_clear_day, drawable.bg_clear_day),
    "CLEAR_NIGHT" to Sky("晴", drawable.ic_clear_night, drawable.bg_clear_night),
    "PARTLY_CLOUDY_DAY" to Sky("多云", drawable.ic_partly_cloud_day, drawable.bg_partly_cloudy_day),
    "PARTLY_CLOUDY_NIGHT" to Sky("多云",
        drawable.ic_partly_cloud_night,
        drawable.bg_partly_cloudy_night),
    "CLOUDY" to Sky("阴", drawable.ic_cloudy, drawable.bg_cloudy),
    "WIND" to Sky("大风", drawable.ic_cloudy, drawable.bg_wind),
    "LIGHT_RAIN" to Sky("小雨", drawable.ic_light_rain, drawable.bg_rain),
    "MODERATE_RAIN" to Sky("中雨", drawable.ic_moderate_rain, drawable.bg_rain),
    "HEAVY_RAIN" to Sky("大雨", drawable.ic_heavy_rain, drawable.bg_rain),
    "STORM_RAIN" to Sky("暴雨", drawable.ic_storm_rain, drawable.bg_rain),
    "THUNDER_SHOWER" to Sky("雷阵雨", drawable.ic_thunder_shower, drawable.bg_rain),
    "SLEET" to Sky("雨夹雪", drawable.ic_sleet, drawable.bg_rain),
    "LIGHT_SNOW" to Sky("小雪", drawable.ic_light_snow, drawable.bg_snow),
    "MODERATE_SNOW" to Sky("中雪", drawable.ic_moderate_snow, drawable.bg_snow),
    "HEAVY_SNOW" to Sky("大雪", drawable.ic_heavy_snow, drawable.bg_snow),
    "STORM_SNOW" to Sky("暴雪", drawable.ic_heavy_snow, drawable.bg_snow),
    "HAIL" to Sky("冰雹", drawable.ic_hail, drawable.bg_snow),
    "LIGHT_HAZE" to Sky("轻度雾霾", drawable.ic_light_haze, drawable.bg_fog),
    "MODERATE_HAZE" to Sky("中度雾霾", drawable.ic_moderate_haze, drawable.bg_fog),
    "HEAVY_HAZE" to Sky("重度雾霾", drawable.ic_heavy_haze, drawable.bg_fog),
    "FOG" to Sky("雾", drawable.ic_fog, drawable.bg_fog),
    "DUST" to Sky("浮尘", drawable.ic_fog, drawable.bg_fog)
)
*/

private val sky = mapOf(
    "CLEAR_DAY" to Sky("晴", R.drawable.ic_clear_day, R.drawable.bg_clear_day),
    "CLEAR_NIGHT" to Sky("晴", R.drawable.ic_clear_night, R.drawable.bg_clear_night),
    "PARTLY_CLOUDY_DAY" to Sky(
        "多云",
        R.drawable.ic_partly_cloud_day,
        R.drawable.bg_partly_cloudy_day
    ),
    "PARTLY_CLOUDY_NIGHT" to Sky(
        "多云",
        R.drawable.ic_partly_cloud_night,
        R.drawable.bg_partly_cloudy_night
    ),
    "CLOUDY" to Sky("阴", R.drawable.ic_cloudy, R.drawable.bg_cloudy),
    "WIND" to Sky("大风", R.drawable.ic_cloudy, R.drawable.bg_wind),
    "LIGHT_RAIN" to Sky("小雨", R.drawable.ic_light_rain, R.drawable.bg_rain),
    "MODERATE_RAIN" to Sky("中雨", R.drawable.ic_moderate_rain, R.drawable.bg_rain),
    "HEAVY_RAIN" to Sky("大雨", R.drawable.ic_heavy_rain, R.drawable.bg_rain),
    "STORM_RAIN" to Sky("暴雨", R.drawable.ic_storm_rain, R.drawable.bg_rain),
    "THUNDER_SHOWER" to Sky("雷阵雨", R.drawable.ic_thunder_shower, R.drawable.bg_rain),
    "SLEET" to Sky("雨夹雪", R.drawable.ic_sleet, R.drawable.bg_rain),
    "LIGHT_SNOW" to Sky("小雪", R.drawable.ic_light_snow, R.drawable.bg_snow),
    "MODERATE_SNOW" to Sky("中雪", R.drawable.ic_moderate_snow, R.drawable.bg_snow),
    "HEAVY_SNOW" to Sky("大雪", R.drawable.ic_heavy_snow, R.drawable.bg_snow),
    "STORM_SNOW" to Sky("暴雪", R.drawable.ic_heavy_snow, R.drawable.bg_snow),
    "HAIL" to Sky("冰雹", R.drawable.ic_hail, R.drawable.bg_snow),
    "LIGHT_HAZE" to Sky("轻度雾霾", R.drawable.ic_light_haze, R.drawable.bg_fog),
    "MODERATE_HAZE" to Sky("中度雾霾", R.drawable.ic_moderate_haze, R.drawable.bg_fog),
    "HEAVY_HAZE" to Sky("重度雾霾", R.drawable.ic_heavy_haze, R.drawable.bg_fog),
    "FOG" to Sky("雾", R.drawable.ic_fog, R.drawable.bg_fog),
    "DUST" to Sky("浮尘", R.drawable.ic_fog, R.drawable.bg_fog)
)

fun getSky(skycon: String): Sky {
    return sky[skycon] ?: sky["CLEAR_DAY"]!!
}