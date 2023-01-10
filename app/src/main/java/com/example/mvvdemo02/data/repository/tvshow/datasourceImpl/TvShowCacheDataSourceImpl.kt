package com.example.mvvdemo02.data.repository.tvshow.datasourceImpl

import com.example.mvvdemo02.data.model.movie.Movie
import com.example.mvvdemo02.data.model.tvshow.TvShow
import com.example.mvvdemo02.data.repository.tvshow.datasource.TvShowCacheDataSource

class TvShowCacheDataSourceImpl: TvShowCacheDataSource {
    private var tvShowList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(movies: List<TvShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(movies)
    }
}