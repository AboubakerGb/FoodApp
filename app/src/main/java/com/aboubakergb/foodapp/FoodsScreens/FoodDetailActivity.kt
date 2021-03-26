package com.aboubakergb.foodapp.FoodsScreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aboubakergb.foodapp.Food
import com.aboubakergb.foodapp.FoodsScreens.MainActivity
import com.aboubakergb.foodapp.R
import kotlinx.android.synthetic.main.activity_food_detail.*

class FoodDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        // get info
        val food = intent.getParcelableExtra<Food>(MainActivity.INTENT_PARCELABLE)

        //put info in the detail activity
        foodImage.setImageResource(food!!.foodImg)
        foodName.text=food.foodName
        foodDesc.text =food.foodDesc

    }
}