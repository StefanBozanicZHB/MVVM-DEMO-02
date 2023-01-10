package com.example.mvvdemo02.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mvvdemo02.data.model.tvshow.TvShow

@Dao
interface TvShowDao {

    @Insert
    suspend fun saveTvShows(tvShows: List<TvShow>)

    @Query("DELETE FROM popular_tv_show")
    suspend fun deleteAllTvShows(): Int

    @Query("SELECT * FROM popular_tv_show")
    suspend fun getTvShows(): List<TvShow>
}