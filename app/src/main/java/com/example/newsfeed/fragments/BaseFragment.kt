package com.example.newsfeed.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsfeed.adapters.NewsAdapter
import com.example.newsfeed.databinding.FragmentNewsBinding

open class BaseFragment(private val text: String) : Fragment() {

    lateinit var binding: FragmentNewsBinding
    lateinit var adapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = NewsAdapter(text)
        val layoutManager = LinearLayoutManager(activity)
        binding.recyclerViewNewsFeed.layoutManager = layoutManager
        binding.recyclerViewNewsFeed.adapter = adapter
    }
}