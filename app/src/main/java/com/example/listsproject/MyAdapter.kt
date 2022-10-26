package com.example.listsproject

import android.content.res.ColorStateList
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.getColor
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
        val myText = viewHolder.itemView.findViewById<TextView>(R.id.namethird)
        val myLayout = viewHolder.itemView.rootView


        val contextt = viewHolder.itemView.context
        val stringArray = contextt.resources.getStringArray(R.array.programming_laguages)

        val textRes = stringArray[position]
        myText.text=textRes



        val resColor = when(position){
            0->R.color.one
            1-> R.color.two
            2-> R.color.three
            3-> R.color.four
            4-> R.color.five
            5-> R.color.six
            else -> R.color.six
        }
        val color = ColorStateList.valueOf(getColor(contextt,resColor))
        myLayout.backgroundTintList = color



        val imgRes = when(position){
            0->R.drawable.js
            1-> R.drawable.c_plus
            2-> R.drawable.kotlin
            3-> R.drawable.swift
            4-> R.drawable.roby
            5-> R.drawable.dart
            else -> R.drawable.dart
        }


        myImage.setImageResource(imgRes)

    }

    override fun getItemCount() = 6

}
