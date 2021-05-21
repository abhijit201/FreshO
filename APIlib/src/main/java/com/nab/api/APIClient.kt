package com.nab.api

import com.nab.api.services.FreshOAPI
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class APIClient {
    val retrofit =Retrofit.Builder()
        .baseUrl("https://conduit.productionready.io/api/articles")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val api = retrofit.create(FreshOAPI::class.java)
}