package com.example.mvvdemo02.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvdemo02.data.model.artist.Artist
import com.example.mvvdemo02.data.model.movie.Movie
import com.example.mvvdemo02.data.model.tvshow.TvShow

@Database(
    entities = [Movie::class, Artist::class, TvShow::class],
    version = 1,
    exportSchema = false,
)
abstract class TMDBDatabase : RoomDatabase() {

    abstract val movieDao: MovieDao
    abstract val tvShowDao: TvShowDao
    abstract val artistDao: ArtistDao

    companion object {
        private const val databaseName = "tmdb_database"

        @Volatile
        private var INSTANCE: TMDBDatabase? = null
        fun getInstance(context: Context): TMDBDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        TMDBDatabase::class.java,
                        databaseName,
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}