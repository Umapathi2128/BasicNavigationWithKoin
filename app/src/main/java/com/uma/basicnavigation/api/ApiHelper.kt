package com.uma.basicnavigation.api

import com.uma.basicnavigation.model.NewsListResponse
import retrofit2.Response

interface ApiHelper {

    suspend fun getNewsList(country : String,category: String) : Response<NewsListResponse>
}