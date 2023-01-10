package com.example.mvvdemo02.domain.usecase

import com.example.mvvdemo02.data.model.movie.Movie
import com.example.mvvdemo02.domain.repository.MovieRepository

class UpdateMovieUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}