package com.example.newsfeed

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.newsfeed.adapters.PagerAdapter
import com.example.newsfeed.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPagerActivityMain.adapter = PagerAdapter(this)
        binding.tabLayout.tabIconTint = null
        binding.tabLayout.setTabTextColors(getColor(R.color.black), getColor(R.color.red))
        TabLayoutMediator(binding.tabLayout, binding.viewPagerActivityMain) { tab, pos ->
            when (pos) {
                0 -> tab.text = "ALL NEWS"
                1 -> tab.text = "BUSINESS NEWS"
                2 -> tab.text = "ENTERTAINMENT NEWS"
                3 -> tab.text = "GENERAL NEWS"
                4 -> tab.text = "HEALTH NEWS"
                5 -> tab.text = "SCIENCE NEWS"
                6 -> tab.text = "SPORTS NEWS"
                7 -> tab.text = "TECHNOLOGY NEWS"
            }
        }.attach()
    }
}