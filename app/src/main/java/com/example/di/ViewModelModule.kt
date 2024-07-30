package com.example.di

import com.example.data.repository.ViewModelSessionCounterRepositoryImpl
import com.example.domain.repository.ViewModelSessionCounterRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelSessionCounterRepository(impl: ViewModelSessionCounterRepositoryImpl): ViewModelSessionCounterRepository
}