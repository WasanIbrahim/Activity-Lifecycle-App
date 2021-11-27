package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("in onCreate")
    }


    override fun onStart() {
        super.onStart()
        println("in onStart")
    }

    override fun onResume() {
        super.onResume()
        println("in onResume")
    }

    override fun onPause() {
        super.onPause()
        println("in onPause")
    }

    override fun onStop() {
        super.onStop()
        println("in onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("in onDestroy")
    }

}