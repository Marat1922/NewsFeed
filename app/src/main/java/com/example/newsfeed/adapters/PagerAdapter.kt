package com.example.newsfeed.adapters


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newsfeed.fragments.*

class PagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return ITEM_COUNT_ADAPTER
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AllNewsFragment()
            1 -> BusinessNewsFragment()
            2 -> EntertainmentNewsFragment()
            3 -> GeneralNewsFragment()
            4 -> HealthNewsFragment()
            5 -> ScienceNewsFragment()
            6 -> SportsNewsFragment()
            7 -> TechnologyNewsFragment()
            else -> AllNewsFragment()
        }
    }

    companion object {
        const val ITEM_COUNT_ADAPTER = 8
    }
}