package com.example.mvvdemo02.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvdemo02.data.model.artist.Artist

@Dao
interface ArtistDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveArtists(artists: List<Artist>): Int

    @Query("DELETE FROM popular_artist")
    suspend fun deleteAllArtists(): Int

    @Query("SELECT * FROM popular_artist")
    suspend fun getArtists(): List<Artist>
}