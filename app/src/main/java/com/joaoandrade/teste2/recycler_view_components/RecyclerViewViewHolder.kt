package com.joaoandrade.teste2.recycler_view_components

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.joaoandrade.teste2.R

class RecyclerViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val word: TextView = itemView.findViewById(R.id.word)
}