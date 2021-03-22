package com.aboubakergb.foodapp.JuicesScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.aboubakergb.foodapp.MainActivity
import com.aboubakergb.foodapp.R
import kotlinx.android.synthetic.main.activity_juices_screen.*
import kotlinx.android.synthetic.main.activity_main.*

class JuicesScreenActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juices_screen)

        toggle = ActionBarDrawerToggle(this, drawerLayoutJuices, R.string.open, R.string.close)
        drawerLayoutJuices.addDrawerListener(toggle)
        toggle.syncState()

        // set back button when drawer is open
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // select menu item
        navViewJuices.setNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.mi_food_activity -> {
                    val intentFoodActivity = Intent(this, MainActivity::class.java)
                    startActivity(intentFoodActivity)
                }

            }
            true

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}