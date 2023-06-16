package com.example.daggerconceptapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as MyApp).appComponent
//        val userRegistrationComponent = DaggerUserRegistrationComponent
//            .factory()
//            .create(5, appComponent)

        val userRegistrationSubComponent = appComponent.getUserRegistrationSubComponent()
        userRegistrationSubComponent.injectMyServices(this)
        userRegistrationService.registerUser("test@gmail.com", "test@1234")
    }
}