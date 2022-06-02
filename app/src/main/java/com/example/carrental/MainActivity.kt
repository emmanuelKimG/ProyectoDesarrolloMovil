package com.example.carrental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {

    private var progressBar : ProgressBar? = null;
    private var i =0;
    private var txtView : TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val loader = ProgressBar(this)
        val handler = android.os.Handler()
        loader.startLoading()

        handler.postDelayed(object :Runnable{
            override fun run(){
                loader.dismiss()
            }
        },5000)

    }
}

