package com.example.mvvdemo02.presentation.di.core

import com.example.mvvdemo02.data.repository.artist.ArtistRepositoryImpl
import com.example.mvvdemo02.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.mvvdemo02.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.mvvdemo02.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.mvvdemo02.data.repository.movie.MovieRepositoryImpl
import com.example.mvvdemo02.data.repository.movie.datasource.MovieCacheDataSource
import com.example.mvvdemo02.data.repository.movie.datasource.MovieLocalDataSource
import com.example.mvvdemo02.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.mvvdemo02.domain.repository.ArtistRepository
import com.example.mvvdemo02.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource,
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource,
        )
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource,
    ): ArtistRepository {
        return ArtistRepositoryImpl(
            artistRemoteDataSource,
            artistLocalDataSource,
            artistCacheDataSource,
        )
    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        artistRemoteDataSource: ArtistRemoteDataSource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource,
    ): ArtistRepository {
        return ArtistRepositoryImpl(
            artistRemoteDataSource,
            artistLocalDataSource,
            artistCacheDataSource,
        )
    }
}