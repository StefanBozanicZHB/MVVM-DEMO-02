package com.example.mvvdemo02.presentation.di.tvshow

import com.example.mvvdemo02.domain.usecase.GetMoviesUseCase
import com.example.mvvdemo02.domain.usecase.GetTvShowsUseCase
import com.example.mvvdemo02.domain.usecase.UpdateMovieUseCase
import com.example.mvvdemo02.domain.usecase.UpdateTvShowsUseCase
import com.example.mvvdemo02.presentation.movie.MovieViewModelFactory
import com.example.mvvdemo02.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase,
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowsUseCase, updateTvShowsUseCase)
    }
}