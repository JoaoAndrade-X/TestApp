package com.joaoandrade.teste2.recycler_view_components

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joaoandrade.teste2.R

class RecyclerViewAdapter(private val list: ArrayList<RecyclerViewItem>): RecyclerView.Adapter<RecyclerViewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return RecyclerViewViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        val item = list[position]
        holder.word.text = (position + 1).toString()  + " - " + item.word
    }

    override fun getItemCount(): Int {
        return list.size
    }
}