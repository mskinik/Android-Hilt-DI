package com.example.di

import com.example.data.repository.ActivitySessionCounterRepositoryImpl
import com.example.domain.repository.ActivitySessionCounterRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ActivityModule {
    @Binds
    abstract fun bindActivitySessionCounterRepository(impl: ActivitySessionCounterRepositoryImpl): ActivitySessionCounterRepository
}