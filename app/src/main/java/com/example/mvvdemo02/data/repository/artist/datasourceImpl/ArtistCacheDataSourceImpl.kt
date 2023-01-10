package com.example.mvvdemo02.data.repository.artist.datasourceImpl

import com.example.mvvdemo02.data.model.artist.Artist
import com.example.mvvdemo02.data.model.movie.Movie
import com.example.mvvdemo02.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.mvvdemo02.data.repository.movie.datasource.MovieCacheDataSource

class ArtistCacheDataSourceImpl: ArtistCacheDataSource {
    private var artistList = ArrayList<Artist>()

    override suspend fun getArtistsFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistsToCache(movies: List<Artist>) {
        artistList.clear()
        artistList = ArrayList(movies)
    }
}