package com.example.carrental

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val barAction = supportActionBar
        val loader = ProgressBar(this)
        val navView: BottomNavigationView = findViewById(R.id.main_bottom_navigation)

        barAction?.setDisplayShowHomeEnabled(true)
        barAction?.setIcon(R.drawable.coche)


        loader.startLoading()


        Handler(Looper.getMainLooper()).postDelayed({
            loader.dismiss()
            supportActionBar?.show()
        }, 3000)

        navView.setOnItemReselectedListener { item -> 
            when(item.itemId){
                R.id.home -> {
                    startActivity(Intent(this,ActivityHome::class.java))
                    true
                }
                R.id.pin_drop ->{
                    startActivity(Intent(this, ActivityHome::class.java))
                    true
                }
                R.id.search_location -> {
                    true
                }
                else -> false
            }
            
        }
        
    }

}

