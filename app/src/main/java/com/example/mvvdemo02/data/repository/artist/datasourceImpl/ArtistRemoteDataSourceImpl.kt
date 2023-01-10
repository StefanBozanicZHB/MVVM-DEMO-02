package com.example.mvvdemo02.data.repository.artist.datasourceImpl

import com.example.mvvdemo02.data.api.TMDBService
import com.example.mvvdemo02.data.model.artist.ArtistList
import com.example.mvvdemo02.data.model.movie.MovieList
import com.example.mvvdemo02.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.mvvdemo02.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String,
) : ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> =
        tmdbService.getPopularArtist(apiKey)

}