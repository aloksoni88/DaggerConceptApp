package com.example.daggerconceptapp

import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun injectMyServices(mainActivity: MainActivity)
}