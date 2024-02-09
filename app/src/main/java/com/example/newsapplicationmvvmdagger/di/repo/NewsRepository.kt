package com.example.newsapplicationmvvmdagger.di.repo

import com.example.newsapplicationmvvmdagger.di.data.EverythingNewsObj
import com.example.newsapplicationmvvmdagger.di.service.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject


class NewsRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getProducts(): Response<EverythingNewsObj> {
        return withContext(Dispatchers.IO) {
            try {
                apiService.getEverythingNews()
            } catch (e: IOException) {
                // Handle IO exception (e.g., network issues)
                Response.error(500, okhttp3.ResponseBody.create(null, ""))
            }
        }
    }
}