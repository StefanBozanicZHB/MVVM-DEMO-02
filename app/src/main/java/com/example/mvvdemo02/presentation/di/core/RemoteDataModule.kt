package com.example.mvvdemo02.presentation.di.core

import com.example.mvvdemo02.data.api.TMDBService
import com.example.mvvdemo02.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.mvvdemo02.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.example.mvvdemo02.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.mvvdemo02.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.example.mvvdemo02.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.example.mvvdemo02.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService, apiKey)
    }
}