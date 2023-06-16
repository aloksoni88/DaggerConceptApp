package com.example.daggerconceptapp

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @ActivityScope
    @MessageQualifier
    @Provides
    //fun getMessageService(retryCount: Int) : NotificationService {
    fun getMessageService() : NotificationService {
        return MessageService(3)
    }

    @ActivityScope
    @Named(Constants.QUALIFIER_EMAIL)
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }

}