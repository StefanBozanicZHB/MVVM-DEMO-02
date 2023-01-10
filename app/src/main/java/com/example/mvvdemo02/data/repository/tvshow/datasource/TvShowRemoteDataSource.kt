package com.example.mvvdemo02.data.repository.tvshow.datasource

import com.example.mvvdemo02.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {

    suspend fun getTvShows(): Response<TvShowList>
}