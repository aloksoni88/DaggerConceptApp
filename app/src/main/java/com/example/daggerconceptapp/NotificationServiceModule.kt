package com.example.daggerconceptapp

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService {
        return MessageService()
    }

    @Named(Constants.QUALIFIER_EMAIL)
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }

}