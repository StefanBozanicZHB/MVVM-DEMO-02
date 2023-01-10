package com.example.mvvdemo02.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvdemo02.R
import com.example.mvvdemo02.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)
    }
}