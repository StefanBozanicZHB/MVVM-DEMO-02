package com.example.mvvdemo02.data.repository.movie.datasource

import com.example.mvvdemo02.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAllData()
}