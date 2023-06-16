package com.example.daggerconceptapp

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent


@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun injectMyServices(mainActivity: MainActivity)

//    @Subcomponent.Factory
//    interface Factory{
//        fun create(@BindsInstance retryCount: Int) : UserRegistrationComponent
//    }


}

/** Below code is having component with dependecny **/
//@ActivityScope
//@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class, NotificationServiceModule::class])
//interface UserRegistrationComponent {
//    fun injectMyServices(mainActivity: MainActivity)
//
//    @Component.Factory
//    interface Factory{
//        fun create(@BindsInstance retryCount: Int, appComponent: AppComponent) : UserRegistrationComponent
//    }
//}