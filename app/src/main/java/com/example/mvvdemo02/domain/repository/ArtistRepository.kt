package com.example.mvvdemo02.domain.repository

import com.example.mvvdemo02.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}