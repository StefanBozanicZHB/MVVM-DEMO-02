package com.example.mvvdemo02.domain.repository

import com.example.mvvdemo02.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}