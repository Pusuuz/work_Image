package com.example.listsproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {



    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {}




    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_item, viewGroup, false)

        return MyViewHolder(view)
    }



    override fun onBindViewHolder(viewHolder: MyViewHolder, position: Int) {

       val myImage = viewHolder.itemView.findViewById<ImageView>(R.id.imageView)

        val imgRes = when(position){
            1-> R.drawable.c_plus
            2-> R.drawable.kotlin
            else -> R.drawable.js
        }


        myImage.setImageResource(imgRes)

    }

    override fun getItemCount() = 10

}
