package com.example.firebaseappdistribution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("onCreate_called1", "onCreate_called1")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume_Called_12", "onResume_Called_12")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause_Called_13", "onPause_Called_13")
    }
}