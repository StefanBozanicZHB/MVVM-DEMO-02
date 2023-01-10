package com.example.mvvdemo02.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvdemo02.data.model.movie.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies: List<Movie>): Int

    @Query("DELETE FROM popular_movie")
    suspend fun deleteAllMovies(): Int

    @Query("SELECT * FROM popular_movie")
    suspend fun getMovies(): List<Movie>
}