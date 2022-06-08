package com.example.newsfeed.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.adapters.NewsAdapter
import com.example.newsfeed.databinding.FragmentNewsBinding
import com.example.newsfeed.databinding.FragmentTechnologyNewsBinding

class TechnologyNewsFragment: Fragment() {

    private lateinit var binding: FragmentNewsBinding
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewsBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerViewNewsFeed
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = NewsAdapter("News3")
    }
}