package com.example.newsfeed.adapters


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newsfeed.fragments.*

class PagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return 8
    }

    override fun createFragment(position: Int): Fragment {
       return when(position){
           0 -> AllNewsFragment()
           1 -> BusinessNewsFragment()
           2 -> EntertainmentNewsFragment()
           3 -> GeneralNewsFragment()
           4 -> HealthNewsFragment()
           5 -> ScienceNewsFragment()
           6 -> SportsNewsFragment()
           else -> TechnologyNewsFragment()
       }
    }
}