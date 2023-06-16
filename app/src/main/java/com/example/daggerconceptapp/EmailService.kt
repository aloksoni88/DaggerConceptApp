package com.example.daggerconceptapp

import android.util.Log
import com.example.daggerconceptapp.Constants.TAG
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, emailBody: String)
}

class EmailService @Inject constructor() : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.i(TAG,  "Sent email from : $from To $to with email body $body")
    }
}

class MessageService : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.i(TAG,  "Sent message from : $from To $to with email body $body")
    }
}