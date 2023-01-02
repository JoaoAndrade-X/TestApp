package com.joaoandrade.teste2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.joaoandrade.teste2.databinding.ActivityMainBinding
import com.joaoandrade.teste2.recycler_view_components.RecyclerViewAdapter
import com.joaoandrade.teste2.recycler_view_components.RecyclerViewItem

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recycler: RecyclerView
    private lateinit var wordList: ArrayList<RecyclerViewItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        recycler = binding.recycler
        recycler.layoutManager = LinearLayoutManager(this)
        wordList = arrayListOf()
        setContentView(view)
        setListeners()
    }

    private fun setListeners() {
        binding.button.setOnClickListener {
            wordList = arrayListOf()
            createList()
        }
    }

    private fun createList() {
        val list = binding.myEditText.text.split(" ")

        for(item in list) {
            val word = RecyclerViewItem(item)
            wordList.add(word)
        }

        recycler.adapter = RecyclerViewAdapter(wordList)
    }

}
