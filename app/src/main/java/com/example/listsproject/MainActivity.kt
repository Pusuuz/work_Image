package com.example.listsproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.listsproject.retrofit.Common

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fromServer = Common.retrofitService.getMovieList().execute().body()!!

        val adapter = MyAdapter(fromServer)
        val rv =findViewById<RecyclerView>(R.id.recyclerView)

        rv.adapter=adapter


    }
}