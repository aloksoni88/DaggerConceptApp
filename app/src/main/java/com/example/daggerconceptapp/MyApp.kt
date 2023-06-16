package com.example.daggerconceptapp

import android.app.Application

class MyApp : Application() {
    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent = DaggerUserRegistrationComponent
            .factory()
            .create(3)
    }
}