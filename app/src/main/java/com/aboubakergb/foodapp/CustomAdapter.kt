package com.aboubakergb.foodapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val img: Array<Int>,val  title: Array<String>): RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(itemView: View ) : RecyclerView.ViewHolder(itemView ){

        // set information in card view (item food)
        fun bindValues(image: Int, txt: String) {
            itemView.findViewById<ImageView>(R.id.imageView).setImageResource(image)
            itemView.findViewById<TextView>(R.id.tv_Title).text =txt
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val v= LayoutInflater.from(parent.context).inflate(R.layout.food_item,parent,false)
        return CustomViewHolder(v)
    }

    override fun getItemCount(): Int {
        return img.size
    }


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindValues(img[position]  , title[position] )
    }

}
