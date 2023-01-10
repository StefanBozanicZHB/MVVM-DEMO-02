package com.example.mvvdemo02.data.repository.tvshow.datasourceImpl

import com.example.mvvdemo02.data.db.MovieDao
import com.example.mvvdemo02.data.db.TvShowDao
import com.example.mvvdemo02.data.model.movie.Movie
import com.example.mvvdemo02.data.model.tvshow.TvShow
import com.example.mvvdemo02.data.repository.movie.datasource.MovieLocalDataSource
import com.example.mvvdemo02.data.repository.tvshow.datasource.TvShowLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(
    private val tvShowDao: TvShowDao,
) : TvShowLocalDataSource {
    override suspend fun getTvShowsFromDB(): List<TvShow> =
        tvShowDao.getTvShows()

    override suspend fun saveTvShowsToDB(tvShows: List<TvShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.saveTvShows(tvShows)
        }
    }

    override suspend fun clearAllData() {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.deleteAllTvShows()
        }
    }
}