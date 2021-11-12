package com.uma.basicnavigation.api

import com.uma.basicnavigation.api.API
import com.uma.basicnavigation.api.ApiHelper
import com.uma.basicnavigation.model.NewsListResponse
import retrofit2.Response

class ApiHelperImpl(private val api : API) : ApiHelper {

    override suspend fun getNewsList(country: String, category: String): Response<NewsListResponse> {
        return api.getNewsList(country, category)
    }
}