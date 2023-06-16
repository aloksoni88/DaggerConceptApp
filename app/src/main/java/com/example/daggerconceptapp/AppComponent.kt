package com.example.daggerconceptapp

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    //fun getAnalyticsService() : AnalyticsService
    /** as using subcomponent no need to expose explicitly **/


    //fun getUserRegistrationSubComponentFactory() : UserRegistrationComponent.Factory
    fun getUserRegistrationSubComponent() : UserRegistrationComponent
}