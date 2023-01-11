package com.example.mvvdemo02.presentation.di.core

import com.example.mvvdemo02.data.db.ArtistDao
import com.example.mvvdemo02.data.db.MovieDao
import com.example.mvvdemo02.data.db.TvShowDao
import com.example.mvvdemo02.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.mvvdemo02.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.example.mvvdemo02.data.repository.movie.datasource.MovieLocalDataSource
import com.example.mvvdemo02.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.example.mvvdemo02.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.mvvdemo02.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideArtistDataSource(artistDao: ArtistDao): ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }
}