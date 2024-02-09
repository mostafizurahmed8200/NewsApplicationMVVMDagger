package com.example.newsapplicationmvvmdagger.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Applications: Application() {
    override fun onCreate() {
        super.onCreate()
    }


}