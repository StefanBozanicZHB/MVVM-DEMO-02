package com.example.mvvdemo02.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.mvvdemo02.domain.usecase.GetArtistsUseCase
import com.example.mvvdemo02.domain.usecase.GetTvShowsUseCase
import com.example.mvvdemo02.domain.usecase.UpdateArtistsUseCase
import com.example.mvvdemo02.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase,
) : ViewModel() {

    fun getTvShows() = liveData {
        val artistList = getTvShowsUseCase.execute()
        emit(artistList)
    }

    fun updateTvShows() = liveData {
        val artistList = updateTvShowsUseCase.execute()
        emit(artistList)
    }
}