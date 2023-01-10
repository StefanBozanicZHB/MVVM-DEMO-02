package com.example.mvvdemo02.data.repository.tvshow.datasourceImpl

import com.example.mvvdemo02.data.api.TMDBService
import com.example.mvvdemo02.data.model.tvshow.TvShowList
import com.example.mvvdemo02.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String,
) : TvShowRemoteDataSource {
    override suspend fun getTvShows(): Response<TvShowList> =
        tmdbService.getPopularTvShows(apiKey)

}