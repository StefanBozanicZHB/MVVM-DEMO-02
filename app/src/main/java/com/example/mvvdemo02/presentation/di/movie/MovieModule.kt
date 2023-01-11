package com.example.mvvdemo02.presentation.di.movie

import com.example.mvvdemo02.domain.usecase.GetMoviesUseCase
import com.example.mvvdemo02.domain.usecase.UpdateMovieUseCase
import com.example.mvvdemo02.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMovieUseCase: GetMoviesUseCase,
        updateMovieUseCase: UpdateMovieUseCase,
    ): MovieViewModelFactory {
        return MovieViewModelFactory(getMovieUseCase, updateMovieUseCase)
    }
}