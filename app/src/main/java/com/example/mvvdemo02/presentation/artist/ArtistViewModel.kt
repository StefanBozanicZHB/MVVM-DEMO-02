package com.example.mvvdemo02.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.mvvdemo02.domain.usecase.GetArtistsUseCase
import com.example.mvvdemo02.domain.usecase.UpdateArtistsUseCase

class ArtistViewModel(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase,
) : ViewModel() {

    fun getArtists() = liveData {
        val artistList = getArtistsUseCase.execute()
        emit(artistList)
    }

    fun updateArtists() = liveData {
        val artistList = updateArtistsUseCase.execute()
        emit(artistList)
    }
}