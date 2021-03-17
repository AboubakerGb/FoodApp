package com.aboubakergb.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed({
            // Start your app main activity
            startActivity(Intent(this,MainActivity::class.java))
            // close this activity
            finish()
        }, 3000)
    }
}