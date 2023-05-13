package com.uts.perkiraancuaca_nursyahri.viewModel.repository

import com.uts.perkiraancuaca_nursyahri.model.CurrentWeatherModel
import com.uts.perkiraancuaca_nursyahri.model.ForeCast3HoursModel
import com.uts.perkiraancuaca_nursyahri.network.Results
import com.uts.perkiraancuaca_nursyahri.network.SafeApi
import com.example.shyama.android.database.ApiService

class Repository {

    suspend fun getCurrentWeather(lat: Double, lon: Double): Results<CurrentWeatherModel> {

        return SafeApi.safeApiCall {
            ApiService.getCurrentWeather(lat,lon)
        }
    }

    suspend fun get3HoursForecast(lat: Double, lon: Double): Results<ForeCast3HoursModel> {

        return SafeApi.safeApiCall {
            ApiService.get3HoursForecast(lat,lon)
        }
    }

}

