package com.example.daggerconceptapp

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService() : AnalyticsService {
        return GoogleAnalytics()
    }

}