package com.example.mvvdemo02.data.repository.artist.datasourceImpl

import com.example.mvvdemo02.data.db.ArtistDao
import com.example.mvvdemo02.data.db.MovieDao
import com.example.mvvdemo02.data.model.artist.Artist
import com.example.mvvdemo02.data.model.movie.Movie
import com.example.mvvdemo02.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.mvvdemo02.data.repository.movie.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(
    private val artistDao: ArtistDao,
) : ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
        return artistDao.getArtists()
    }

    override suspend fun saveArtistsToDB(movies: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(movies)
        }
    }

    override suspend fun clearAllData() {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.deleteAllArtists()
        }
    }
}