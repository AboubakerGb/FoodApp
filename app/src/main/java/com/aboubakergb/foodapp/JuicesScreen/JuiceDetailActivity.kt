package com.aboubakergb.foodapp.JuicesScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aboubakergb.foodapp.Food
import com.aboubakergb.foodapp.FoodsScreens.MainActivity
import com.aboubakergb.foodapp.R
import kotlinx.android.synthetic.main.activity_food_detail.*
import kotlinx.android.synthetic.main.activity_juice_detail.*

class JuiceDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juice_detail)

        // get info
        val juice = intent.getParcelableExtra<Food>(JuicesScreenActivity.INTENT_JUICE)

        //put info in the detail activity
        juiceImage.setImageResource(juice!!.foodImg)
        juiceName.text=juice.foodName
        juiceDesc.text =juice.foodDesc

    }
}