package com.example.daggerconceptapp

import android.util.Log
import com.example.daggerconceptapp.Constants.TAG
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, emailBody: String)
}

@ApplicationScope
class EmailService @Inject constructor() : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.i(TAG,  "Sent email from : $from To $to with email body $body")
    }
}

class MessageService(private val retryCount: Int) : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.i(TAG,  "Sent message from : $from To $to with email body $body with retrycount $retryCount")
    }
}