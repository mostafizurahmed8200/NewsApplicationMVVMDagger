package com.example.newsapplicationmvvmdagger.di.service

import com.example.newsapplicationmvvmdagger.di.data.EverythingNewsObj
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/v2/everything")
    suspend fun getEverythingNews(
        @Query("q") query: String = "bitcoin",
        @Query("apiKey") apiKey: String = "1c9372869dbd4f17b0a54d985d2c7ada"
    ): Response<EverythingNewsObj>
}