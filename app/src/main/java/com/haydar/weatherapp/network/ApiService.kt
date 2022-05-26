package com.haydar.weatherapp.network

import com.haydar.weatherapp.BuildConfig
import com.haydar.weatherapp.BuildConfig.API_KEY
import com.haydar.weatherapp.data.ForecastResponse
import com.haydar.weatherapp.data.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("weather")
    fun weatherByCity(
        @Query("q") city: String,
        @Query("appid") app_key: String = API_KEY
    ) : Call<WeatherResponse>
    @GET("forecast")
    fun forecastByCity(
        @Query("q") city: String,
        @Query("appid") app_key: String = API_KEY
    ) : Call<ForecastResponse>

    @GET("weather")
    fun weatherByCurrentLocation(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") app_key: String = API_KEY
    ) : Call<WeatherResponse>

    @GET("forecast")
    fun forecastByCurrentLocation(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") app_key: String = API_KEY
    ) : Call<ForecastResponse>


}