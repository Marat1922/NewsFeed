package com.example.newsfeed.data.newsModel

data class NewsResponse(
    val articles: List<Article>
)

data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)

data class Source(
    val name: String
)

