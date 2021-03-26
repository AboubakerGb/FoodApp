package com.aboubakergb.foodapp.JuicesScreen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aboubakergb.foodapp.Food

import com.aboubakergb.foodapp.R

class JuicesAdapter(val context: Context, private val juicesList : List<Food>, var listenerJuice : (Food) -> Unit ): RecyclerView.Adapter<JuicesAdapter.JuicesViewHolder>() {

    class JuicesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView ){

        val JuiceImage : ImageView = itemView.findViewById<ImageView>(R.id.imageView)
        val JuiceName: TextView =itemView.findViewById<TextView>(R.id.tv_Title)

        // set information in card view (item food)
        fun bindValues(food: Food, listenerJuice : (Food) -> Unit) {
            JuiceImage.setImageResource(food.foodImg)
            JuiceName.text = food.foodName
            itemView.setOnClickListener{ listenerJuice(food) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JuicesViewHolder {

        val view= LayoutInflater.from(parent.context).inflate(R.layout.food_item,parent,false)
        return JuicesViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return juicesList.size
    }


    override fun onBindViewHolder(holder: JuicesViewHolder, position: Int) {
        holder.bindValues(juicesList[position]  , listenerJuice )
    }
}