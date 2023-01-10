package com.example.mvvdemo02.data.repository.artist.datasource

import com.example.mvvdemo02.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistsFromDB(): List<Artist>
    suspend fun saveArtistsToDB(movies: List<Artist>)
    suspend fun clearAllData()
}