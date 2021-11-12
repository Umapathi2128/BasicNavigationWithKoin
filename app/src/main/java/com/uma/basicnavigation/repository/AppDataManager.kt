package com.uma.basicnavigation.repository

import com.uma.basicnavigation.api.ApiHelper
import com.uma.basicnavigation.model.NewsListResponse
import com.uma.basicnavigation.model.WeatherResponse
import retrofit2.Response

class AppDataManager(var apiHelper: ApiHelper) : DataHelper {
    override suspend fun getNewsList(
        country: String,
        category: String
    ): Response<NewsListResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getWeatherByGPS(
        latitude: String,
        longitude: String,
        units: String
    ): Response<WeatherResponse> {
        TODO("Not yet implemented")
    }
}