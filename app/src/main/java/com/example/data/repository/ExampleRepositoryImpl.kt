package com.example.data.repository

import com.example.domain.datasource.DataSource
import com.example.domain.repository.ExampleRepository
import com.example.utils.LocalDataSource
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    @LocalDataSource private val localDataSource: DataSource
): ExampleRepository {
    override fun getDummyData(): String = "Hello World"
    override fun getLocalData(): String = localDataSource.getData()
}