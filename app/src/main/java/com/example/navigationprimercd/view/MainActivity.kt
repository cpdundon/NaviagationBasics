package com.example.navigationprimercd.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationprimercd.R
import com.example.navigationprimercd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}