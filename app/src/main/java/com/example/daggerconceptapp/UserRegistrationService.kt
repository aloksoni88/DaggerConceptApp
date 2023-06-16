package com.example.daggerconceptapp

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Qualifier

class UserRegistrationService @Inject constructor(
    @Named(Constants.QUALIFIER_FIREBASE) private val userRepository: UserRepository,
    @Named(Constants.QUALIFIER_EMAIL) private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@gmail.com", "user registration succesfull!!!")
    }
}