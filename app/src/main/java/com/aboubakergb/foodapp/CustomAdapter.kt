package com.aboubakergb.foodapp


import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val context: Context, private val foodList : List<Food> , var listener : (Food) -> Unit ): RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

     class CustomViewHolder(itemView: View ) : RecyclerView.ViewHolder(itemView ){

         val foodImage :ImageView = itemView.findViewById<ImageView>(R.id.imageView)
         val foodName: TextView =itemView.findViewById<TextView>(R.id.tv_Title)

        // set information in card view (item food)
        fun bindValues(food: Food,  listener : (Food) -> Unit) {
            foodImage.setImageResource(food.foodImg)
            foodName.text = food.foodName
            itemView.setOnClickListener{ listener(food) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val v= LayoutInflater.from(parent.context).inflate(R.layout.food_item,parent,false)
        return CustomViewHolder(v)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindValues(foodList[position]  , listener )
    }

}
