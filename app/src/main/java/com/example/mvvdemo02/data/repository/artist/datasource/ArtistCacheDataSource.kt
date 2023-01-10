package com.example.mvvdemo02.data.repository.artist.datasource

import com.example.mvvdemo02.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache(): List<Artist>
    suspend fun saveArtistsToCache(movies: List<Artist>)
}