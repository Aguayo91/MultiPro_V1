package com.chris.aguayo.multipro.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.chris.aguayo.multipro.R
import com.chris.aguayo.multipro.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private val detailViewModel:DetailViewModel by viewModels()
    private lateinit var binding: ActivityDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}