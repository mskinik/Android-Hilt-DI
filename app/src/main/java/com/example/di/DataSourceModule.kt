package com.example.di

import com.example.data.datasource.LocalDataSourceImpl
import com.example.data.datasource.RemoteDataSourceImpl
import com.example.domain.datasource.DataSource
import com.example.utils.LocalDataSource
import com.example.utils.RemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Binds
    @Singleton
    @LocalDataSource
    abstract fun bindLocalDataSource(localDataSourceImpl: LocalDataSourceImpl): DataSource

    @Binds
    @Singleton
    @RemoteDataSource
    abstract fun bindRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): DataSource

}