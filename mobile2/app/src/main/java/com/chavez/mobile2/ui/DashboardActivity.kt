package com.chavez.mobile2.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chavez.mobile2.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvWelcome.text = "Welcome! You are logged in."
    }
}
