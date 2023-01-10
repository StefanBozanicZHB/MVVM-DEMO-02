package com.example.mvvdemo02.domain.usecase

import com.example.mvvdemo02.data.model.tvshow.TvShow
import com.example.mvvdemo02.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {

    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}