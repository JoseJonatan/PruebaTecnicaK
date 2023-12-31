package com.f8fit.pruebatecnica.di

import com.f8fit.pruebatecnica.data.remote.RandomUserRepositoryImpl
import com.f8fit.pruebatecnica.domain.repository.RandomUserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRandomUserRepository(
        randomUserRepositoryImpl: RandomUserRepositoryImpl
    ): RandomUserRepository

}