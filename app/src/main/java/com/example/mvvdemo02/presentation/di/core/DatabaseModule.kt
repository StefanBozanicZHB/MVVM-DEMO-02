package com.example.mvvdemo02.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.example.mvvdemo02.data.db.ArtistDao
import com.example.mvvdemo02.data.db.MovieDao
import com.example.mvvdemo02.data.db.TMDBDatabase
import com.example.mvvdemo02.data.db.TvShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideMovieDatabase(context: Context): TMDBDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            TMDBDatabase::class.java,
            "tmdb_client",
        ).build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDao {
        return tmdbDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase): ArtistDao {
        return tmdbDatabase.artistDao()
    }

    @Singleton
    @Provides
    fun provideTvShowDao(tmdbDatabase: TMDBDatabase): TvShowDao {
        return tmdbDatabase.tvShowDao()
    }
}