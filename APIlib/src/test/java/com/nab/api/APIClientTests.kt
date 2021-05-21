package com.nab.api

import org.junit.Assert.assertNotNull
import org.junit.Test

class APIClientTests {
    private val apiClient = APIClient()

    @Test
    fun GET_articles(){
        val articles = apiClient.api.getArticles()
        assertNotNull(articles.body()?.articles)
    }
}