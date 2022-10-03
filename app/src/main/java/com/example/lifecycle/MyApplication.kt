package com.example.lifecycle

import android.app.Application
import android.util.Log
import androidx.lifecycle.ProcessLifecycleOwner

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(ApplicationLifecycleObserver())
        Log.d(LOG_TAG, "$LOG_TAG MyApplication: onCreate")
    }

    companion object {
        const val LOG_TAG = "LifecycleAware"
    }
}
