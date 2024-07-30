package com.example.di

import com.example.domain.repository.ExampleRepository
import com.example.data.repository.ExampleRepositoryImpl
import com.example.domain.repository.WrongMatchingRepository
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
    abstract fun bindExampleRepository(
        impl: ExampleRepositoryImpl): ExampleRepository

    //Wrong return type usage example
  //  @Binds
  //  @Singleton
  //  abstract fun bindExampleRepository(impl: ExampleRepositoryImpl): WrongMatchingRepository
}