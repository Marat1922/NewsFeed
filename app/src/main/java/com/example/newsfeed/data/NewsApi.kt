package com.example.newsfeed.data

import android.database.Observable
import com.example.newsfeed.data.newsModel.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("top-headlines")
    fun getNews(): Observable<List<NewsResponse>>

    @GET("top-headlines")
    fun getNewsByCategory(
        @Query("country") country: String,
        @Query("category") category: String
    ): Observable<List<NewsResponse>>
}
