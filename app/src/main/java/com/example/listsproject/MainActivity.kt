package com.example.listsproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter =MyAdapter()
        val rv =findViewById<RecyclerView>(R.id.recyclerView)

        rv.adapter=adapter


    }
}