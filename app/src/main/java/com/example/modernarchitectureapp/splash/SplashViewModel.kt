package com.example.modernarchitectureapp.splash

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SplashViewModel() : ViewModel() {

    init {
        startInitialization()
    }

    val initializationCompleted = MutableLiveData<Boolean>()

    private fun startInitialization() {
        Handler(Looper.getMainLooper()).postDelayed({
            initializationCompleted.value = true
        }, 5000)
    }

}