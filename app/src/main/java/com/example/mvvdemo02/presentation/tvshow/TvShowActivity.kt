package com.example.mvvdemo02.presentation.tvshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvdemo02.R
import com.example.mvvdemo02.databinding.ActivityTvShowBinding

class TvShowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTvShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tv_show)
    }
}