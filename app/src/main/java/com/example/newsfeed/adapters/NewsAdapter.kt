package com.example.newsfeed.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.databinding.RecyclerViewNewsItemBinding

class NewsAdapter(private val text: String) : RecyclerView.Adapter<NewsAdapter.VH>() {

    class VH(val binding: RecyclerViewNewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        RecyclerViewNewsItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.titleNewsFeedTextView.text = text
    }

    override fun getItemCount(): Int = 1 //Не использовал константу, потому что это для теста
}