package com.haydar.weatherapp.utils

import java.math.RoundingMode

object HelperFunctions {

    fun formatterDegree(temp: Double?): String {
        val temperature = temp as Double
        val tempToCelcius = temperature - 273.0
        val formatDegree = tempToCelcius.toBigDecimal().setScale(2, RoundingMode.CEILING)
        return "$formatDegree °C"

    }
}