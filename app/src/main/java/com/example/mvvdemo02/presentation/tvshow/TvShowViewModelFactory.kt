package com.example.mvvdemo02.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvdemo02.domain.usecase.GetTvShowsUseCase
import com.example.mvvdemo02.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModelFactory(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase,
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(getTvShowsUseCase, updateTvShowsUseCase) as T
    }
}