package com.example.newsfeed.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.databinding.RecyclerViewNewsItemBinding

class NewsAdapter(private val text: String) : RecyclerView.Adapter<NewsAdapter.VH>() {

    class VH(val binding: RecyclerViewNewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerViewNewsItemBinding.inflate(inflater, parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.titleNewsFeedTextView.text = text
    }

    override fun getItemCount(): Int = 1 //Не использовал константу, потому что это для теста
}