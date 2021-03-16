package com.aboubakergb.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val img = arrayOf(
        R.drawable.food_,
        R.drawable.food_1,
        R.drawable.food_2,
        R.drawable.food_5,
        R.drawable.food_6,
        R.drawable.food_7,
        R.drawable.food_8,
        R.drawable.food_9,
        R.drawable.food_10
    )

    val title = arrayOf(
        "cake",
        "cake au chocolat",
        "cake au citron",
        "cake birthday",
        "cake anniversaire",
        "cake au orange",
        "cake au chocolat marbré",
        "cake banane chocolat",
        "cake frais."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle_view.layoutManager = LinearLayoutManager(this)
        recycle_view.adapter = CustomAdapter(img , title)
    }


}