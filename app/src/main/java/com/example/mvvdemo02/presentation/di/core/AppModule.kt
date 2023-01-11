package com.example.mvvdemo02.presentation.di.core

import android.content.Context
import com.example.mvvdemo02.presentation.di.artist.ArtistSubcomponent
import com.example.mvvdemo02.presentation.di.movie.MovieSubcomponent
import com.example.mvvdemo02.presentation.di.tvshow.TvShowSubcomponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    subcomponents = [
        MovieSubcomponent::class,
        ArtistSubcomponent::class,
        TvShowSubcomponent::class,
    ]
)
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }
}