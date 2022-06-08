package com.example.newsfeed.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.R
import com.example.newsfeed.adapters.NewsAdapter
import com.example.newsfeed.databinding.FragmentNewsBinding

class AllNewsFragment: BaseFragment(){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView.adapter = NewsAdapter("News")
    }
}