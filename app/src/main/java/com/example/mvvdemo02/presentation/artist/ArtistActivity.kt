package com.example.mvvdemo02.presentation.artist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvdemo02.R
import com.example.mvvdemo02.databinding.ActivityArtistBinding

class ArtistActivity : AppCompatActivity() {
    private lateinit var binding: ActivityArtistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_artist)
    }
}