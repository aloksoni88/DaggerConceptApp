package com.example.daggerconceptapp

import android.util.Log
import com.example.daggerconceptapp.Constants.TAG
import javax.inject.Named

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

class FirebaseAnalytics: AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.i(TAG, "tracking Firebase event $eventName of type $eventType")
    }
}

class GoogleAnalytics: AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "tracking Google event $eventName of type $eventType")
    }
}