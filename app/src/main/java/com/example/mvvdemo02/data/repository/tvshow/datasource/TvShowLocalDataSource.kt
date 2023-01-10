package com.example.mvvdemo02.data.repository.tvshow.datasource

import com.example.mvvdemo02.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
    suspend fun getTvShowsFromDB(): List<TvShow>
    suspend fun saveTvShowsToDB(tvShows: List<TvShow>)
    suspend fun clearAllData()
}