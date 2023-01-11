package com.example.mvvdemo02.presentation.di.core

import com.example.mvvdemo02.presentation.di.artist.ArtistSubcomponent
import com.example.mvvdemo02.presentation.di.movie.MovieSubcomponent
import com.example.mvvdemo02.presentation.di.tvshow.TvShowSubcomponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        DatabaseModule::class,
        UseCaseModule::class,
        RepositoryModule::class,
        RemoteDataModule::class,
        LocalDataModule::class,
        CacheDataModule::class,
    ]
)
interface AppComponent {
    fun movieSubcomponent(): MovieSubcomponent.Factory
    fun artistSubcomponent(): ArtistSubcomponent.Factory
    fun tvShowSubcomponent(): TvShowSubcomponent.Factory
}