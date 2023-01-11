package com.example.mvvdemo02.presentation.di.artist

import com.example.mvvdemo02.domain.usecase.GetArtistsUseCase
import com.example.mvvdemo02.domain.usecase.UpdateArtistsUseCase
import com.example.mvvdemo02.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase,
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistsUseCase, updateArtistsUseCase)
    }
}