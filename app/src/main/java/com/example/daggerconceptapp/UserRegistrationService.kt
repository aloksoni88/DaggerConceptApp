package com.example.daggerconceptapp

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Qualifier

class UserRegistrationService @Inject constructor(
    @SqlQualifier private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@gmail.com", "user registration succesfull!!!")
    }
}