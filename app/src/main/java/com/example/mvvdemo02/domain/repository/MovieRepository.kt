package com.example.mvvdemo02.domain.repository

import com.example.mvvdemo02.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}