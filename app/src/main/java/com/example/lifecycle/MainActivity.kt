package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import com.example.lifecycle.MyApplication.Companion.LOG_TAG
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "$LOG_TAG MainActivity: onCreate")
    }
}
