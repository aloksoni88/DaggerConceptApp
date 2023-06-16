package com.example.daggerconceptapp

import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun injectMyServices(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int) : UserRegistrationComponent
    }
}