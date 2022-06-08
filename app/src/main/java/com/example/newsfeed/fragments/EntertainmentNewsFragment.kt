package com.example.newsfeed.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsfeed.adapters.NewsAdapter
import com.example.newsfeed.databinding.FragmentEntertainmentNewsBinding
import com.example.newsfeed.databinding.FragmentNewsBinding

class EntertainmentNewsFragment: BaseFragment()   {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerViewNewsFeed
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = NewsAdapter("News2")
    }
}