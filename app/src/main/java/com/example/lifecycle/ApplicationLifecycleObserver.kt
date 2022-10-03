package com.example.lifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.example.lifecycle.MyApplication.Companion.LOG_TAG

class ApplicationLifecycleObserver : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d(LOG_TAG, "$LOG_TAG LifecycleObserver: onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d(LOG_TAG, "$LOG_TAG LifecycleObserver: onStart")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d(LOG_TAG, "$LOG_TAG LifecycleObserver: onStop")
    }
}
