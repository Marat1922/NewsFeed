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
//        binding.tabLayout.tabIconTint = null
        binding.tabLayout.setTabTextColors(getColor(R.color.black), getColor(R.color.red))
        TabLayoutMediator(binding.tabLayout, binding.viewPagerActivityMain) { tab, pos ->
            when (pos) {
                0 -> tab.text = resources.getText(R.string.tab_layout_title_name_all_news)
                1 -> tab.text = resources.getText(R.string.tab_layout_title_name_business_news)
                2 -> tab.text = resources.getText(R.string.tab_layout_title_name_entertainment_news)
                3 -> tab.text = resources.getText(R.string.tab_layout_title_name_general_news)
                4 -> tab.text = resources.getText(R.string.tab_layout_title_name_health_news)
                5 -> tab.text = resources.getText(R.string.tab_layout_title_name_science_news)
                6 -> tab.text = resources.getText(R.string.tab_layout_title_name_sports_news)
                7 -> tab.text = resources.getText(R.string.tab_layout_title_name_technology_news)
            }
        }.attach()
    }
}