package com.example.mvvdemo02.data.repository.tvshow.datasource

import com.example.mvvdemo02.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache(): List<TvShow>
    suspend fun saveTvShowsToCache(movies: List<TvShow>)
}