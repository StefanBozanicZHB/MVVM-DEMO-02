package com.example.mvvdemo02.presentation.di

import com.example.mvvdemo02.presentation.di.artist.ArtistSubcomponent
import com.example.mvvdemo02.presentation.di.movie.MovieSubcomponent
import com.example.mvvdemo02.presentation.di.tvshow.TvShowSubcomponent

interface Injector {
    fun createMovieSubcomponent():MovieSubcomponent
    fun createArtistSubcomponent():ArtistSubcomponent
    fun createTvShowSubcomponent():TvShowSubcomponent
}