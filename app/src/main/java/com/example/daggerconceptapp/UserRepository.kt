package com.example.daggerconceptapp

import android.util.Log
import com.example.daggerconceptapp.Constants.TAG
import javax.inject.Inject
import javax.inject.Named

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ApplicationScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.i(TAG, "User saved in SQL repository with $email & $password")
        analyticsService.trackEvent("Save User", "Created")
    }
}

class FirebaseRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.i(TAG, "User saved in Firebase repository with $email & $password")
        analyticsService.trackEvent("Save User", "Created")
    }

}