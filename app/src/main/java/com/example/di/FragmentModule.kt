package com.example.di

import com.example.data.repository.FragmentSessionCounterRepositoryImpl
import com.example.domain.repository.FragmentSessionCounterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
abstract class FragmentModule {
    @Binds
   abstract fun bindFragmentSessionCounterManager(impl: FragmentSessionCounterRepositoryImpl): FragmentSessionCounterRepository
}