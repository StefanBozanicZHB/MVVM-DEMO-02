package com.example.mvvdemo02.data.repository.movie.datasource

import com.example.mvvdemo02.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}