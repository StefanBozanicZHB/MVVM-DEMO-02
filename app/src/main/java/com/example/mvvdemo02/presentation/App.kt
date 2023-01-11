package com.example.mvvdemo02.presentation

import android.app.Application
import com.example.mvvdemo02.BuildConfig
import com.example.mvvdemo02.presentation.di.Injector
import com.example.mvvdemo02.presentation.di.artist.ArtistSubcomponent
import com.example.mvvdemo02.presentation.di.core.*
import com.example.mvvdemo02.presentation.di.movie.MovieSubcomponent
import com.example.mvvdemo02.presentation.di.tvshow.TvShowSubcomponent

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubcomponent(): MovieSubcomponent {
        return appComponent.movieSubcomponent().create()
    }

    override fun createArtistSubcomponent(): ArtistSubcomponent {
        return appComponent.artistSubcomponent().create()
    }

    override fun createTvShowSubcomponent(): TvShowSubcomponent {
        return appComponent.tvShowSubcomponent().create()
    }
}