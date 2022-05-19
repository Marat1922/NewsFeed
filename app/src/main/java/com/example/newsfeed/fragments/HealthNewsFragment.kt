package com.example.newsfeed.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newsfeed.databinding.FragmentHealthNewsBinding

class HealthNewsFragment: Fragment() {

    private lateinit var binding: FragmentHealthNewsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHealthNewsBinding.inflate(inflater, container, false)
        return binding.root
    }
}