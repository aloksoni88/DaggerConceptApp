package com.example.daggerconceptapp

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepositoryModule {

    @ActivityScope
    @SqlQualifier
    @Provides
    fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository {
        return sqlRepository
    }

//    @Named("sql")
//    @Binds
//    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository

    @Named(Constants.QUALIFIER_FIREBASE)
    @Provides
    fun getFirebaseRepository(firebaseRepository: FirebaseRepository): UserRepository {
        return firebaseRepository
    }

}