package com.example.daggerconceptapp

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int) : NotificationService {
        return MessageService(retryCount)
    }

    @ApplicationScope
    @Named(Constants.QUALIFIER_EMAIL)
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }

}