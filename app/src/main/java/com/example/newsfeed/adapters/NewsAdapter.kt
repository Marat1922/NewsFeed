package com.example.newsfeed.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.R
import com.example.newsfeed.databinding.RecyclerViewNewsItemBinding

class NewsAdapter(val text: String) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>(){

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = RecyclerViewNewsItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_news_item, parent, false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.binding.titleNewsFeedTextView.text = text
    }

    override fun getItemCount(): Int = 1
}