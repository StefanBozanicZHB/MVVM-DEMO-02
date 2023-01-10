package com.example.mvvdemo02.data.repository.movie.datasource

import com.example.mvvdemo02.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>
}