package com.example.newsfeed.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.adapters.NewsAdapter
import com.example.newsfeed.databinding.FragmentBusinessNewsBinding
import com.example.newsfeed.databinding.FragmentNewsBinding

class BusinessNewsFragment: BaseFragment() {

    lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerViewNewsFeed
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = NewsAdapter("News2")
    }
}