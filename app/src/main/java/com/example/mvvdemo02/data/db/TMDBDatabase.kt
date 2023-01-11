package com.example.mvvdemo02.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvdemo02.data.model.artist.Artist
import com.example.mvvdemo02.data.model.movie.Movie
import com.example.mvvdemo02.data.model.tvshow.TvShow

@Database(
    entities = [Movie::class, Artist::class, TvShow::class],
    version = 1,
    exportSchema = false,
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
    abstract fun tvShowDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
}