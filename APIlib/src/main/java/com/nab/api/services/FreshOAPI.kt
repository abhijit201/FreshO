package com.nab.api.services

import com.nab.api.models.ArticlesResponse
import retrofit2.Response
import retrofit2.http.GET

interface FreshOAPI {
    @GET("articles")
    fun getArticles(): Response<ArticlesResponse>

}