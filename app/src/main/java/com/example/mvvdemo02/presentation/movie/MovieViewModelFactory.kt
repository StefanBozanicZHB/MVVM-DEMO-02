package com.example.mvvdemo02.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvdemo02.domain.usecase.GetMoviesUseCase
import com.example.mvvdemo02.domain.usecase.UpdateMovieUseCase

class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMovieUseCase: UpdateMovieUseCase,
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase, updateMovieUseCase) as T
    }
}