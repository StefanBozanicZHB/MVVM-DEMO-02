package com.example.mvvdemo02.domain.usecase

import com.example.mvvdemo02.data.model.artist.Artist
import com.example.mvvdemo02.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {

    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}