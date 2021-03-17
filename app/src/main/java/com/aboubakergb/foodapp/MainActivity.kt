package com.aboubakergb.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    
    val foodList = listOf<Food>(

        Food(R.drawable.food_,"cake au chocolat",
            "Découvrez la recette de Cake au citron, un délicieux accompagnement pour le thé ou le goûter des enfants. Préchauffer le four à 180°C (thermostat 6)."),
        Food(R.drawable.food_1,"cake au citron",
            "Découvrez la recette de Cake au citron, un délicieux accompagnement pour le thé ou le goûter des enfants. Préchauffer le four à 180°C (thermostat 6)."),
        Food(R.drawable.food_2,"cake au chocolate",
            "Découvrez la recette de Cake au citron, un délicieux accompagnement pour le thé ou le goûter des enfants. Préchauffer le four à 180°C (thermostat 6)."),
        Food(R.drawable.food_5,"cake banane",
            "Découvrez la recette de Cake au citron, un délicieux accompagnement pour le thé ou le goûter des enfants. Préchauffer le four à 180°C (thermostat 6)."),
        Food(R.drawable.food_6,"cake au orange",
            "Découvrez la recette de Cake au citron, un délicieux accompagnement pour le thé ou le goûter des enfants. Préchauffer le four à 180°C (thermostat 6)."),
        Food(R.drawable.food_7,"cake au frais",
            "Découvrez la recette de Cake au citron, un délicieux accompagnement pour le thé ou le goûter des enfants. Préchauffer le four à 180°C (thermostat 6)."),
        Food(R.drawable.food_8,"cake anniverssair",
            "Découvrez la recette de Cake au citron, un délicieux accompagnement pour le thé ou le goûter des enfants. Préchauffer le four à 180°C (thermostat 6)."),
        Food(R.drawable.food_9,"cake birthday ",
            "Découvrez la recette de Cake au citron, un délicieux accompagnement pour le thé ou le goûter des enfants. Préchauffer le four à 180°C (thermostat 6)."),
        Food(R.drawable.food_10,"cake",
            "Découvrez la recette de Cake au citron, un délicieux accompagnement pour le thé ou le goûter des enfants. Préchauffer le four à 180°C (thermostat 6).")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        recycle_view.layoutManager = LinearLayoutManager(this)
        recycle_view.setHasFixedSize(true)

        recycle_view.adapter = CustomAdapter(this , foodList ){
            // item when item clicked
            val intent = Intent(this , FoodDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE , it)
            startActivity(intent)
        }

        fun onCreateOptionsMenu(menu: Menu): Boolean {
            val inflater: MenuInflater = menuInflater
            inflater.inflate(R.menu.main_menu, menu)
            return true
        }

         fun onOptionsItemSelected(item: MenuItem): Boolean {
            // Handle item selection
            return when (item.itemId) {
                R.id.About -> {
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
        }

    }


}
