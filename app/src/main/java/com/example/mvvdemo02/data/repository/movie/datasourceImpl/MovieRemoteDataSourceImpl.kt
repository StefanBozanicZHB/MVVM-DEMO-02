package com.example.mvvdemo02.data.repository.movie.datasourceImpl

import com.example.mvvdemo02.data.api.TMDBService
import com.example.mvvdemo02.data.model.movie.MovieList
import com.example.mvvdemo02.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String,
) : MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> =
        tmdbService.getPopularMovies(apiKey)

}