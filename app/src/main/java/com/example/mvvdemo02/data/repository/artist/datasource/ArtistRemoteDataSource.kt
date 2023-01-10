package com.example.mvvdemo02.data.repository.artist.datasource

import com.example.mvvdemo02.data.model.artist.ArtistList
import com.example.mvvdemo02.data.model.movie.MovieList
import retrofit2.Response

interface ArtistRemoteDataSource {

    suspend fun getArtists(): Response<ArtistList>
}