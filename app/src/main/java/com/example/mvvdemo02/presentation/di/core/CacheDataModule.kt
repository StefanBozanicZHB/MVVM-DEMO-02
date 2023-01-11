package com.example.mvvdemo02.presentation.di.core

import com.example.mvvdemo02.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.mvvdemo02.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.example.mvvdemo02.data.repository.movie.datasource.MovieCacheDataSource
import com.example.mvvdemo02.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.example.mvvdemo02.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.mvvdemo02.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }
}