package com.example.mvvdemo02.data.repository.movie

import android.util.Log
import com.example.mvvdemo02.data.model.movie.Movie
import com.example.mvvdemo02.data.repository.movie.datasource.MovieCacheDataSource
import com.example.mvvdemo02.data.repository.movie.datasource.MovieLocalDataSource
import com.example.mvvdemo02.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.mvvdemo02.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource,
) : MovieRepository {
    override suspend fun getMovies(): List<Movie>? {
        return getMovieFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val newListOfMovies = getMovieFromAPI()
        movieLocalDataSource.clearAllData()
        movieLocalDataSource.saveMoviesToDB(newListOfMovies)
        movieCacheDataSource.saveMoviesToCache(newListOfMovies)
        return newListOfMovies
    }

    private suspend fun getMovieFromAPI(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            val response = movieRemoteDataSource.getMovies()
            val body = response.body()
            if (body != null) {
                movieList = body.movies
            }
        } catch (ex: java.lang.Exception) {
            Log.e("MyTag", ex.message.toString())
        }
        return movieList
    }

    private suspend fun getMovieFromDB(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            movieList = movieLocalDataSource.getMoviesFromDB()
        } catch (ex: java.lang.Exception) {
            Log.e("MyTag", ex.message.toString())
        }
        if (movieList.isNotEmpty()) {
            return movieList
        } else {
            movieList = getMovieFromAPI()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }
        return movieList
    }

    private suspend fun getMovieFromCache(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            movieList = movieCacheDataSource.getMoviesFromCache()
        } catch (ex: java.lang.Exception) {
            Log.e("MyTag", ex.message.toString())
        }
        if (movieList.isNotEmpty()) {
            return movieList
        } else {
            movieList = getMovieFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList)
        }
        return movieList
    }
}