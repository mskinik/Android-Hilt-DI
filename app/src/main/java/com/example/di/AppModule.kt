package com.example.di

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideGson() = Gson()

    @Provides
    @Named("AString")
    fun provideAString() = "A String"

    @Provides
    @Named("BString")
    fun provideBString() = "B String"


}