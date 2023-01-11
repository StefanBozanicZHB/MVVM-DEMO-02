package com.example.mvvdemo02.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.mvvdemo02.domain.usecase.GetMoviesUseCase
import com.example.mvvdemo02.domain.usecase.UpdateMovieUseCase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMovieUseCase,
) : ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }
}