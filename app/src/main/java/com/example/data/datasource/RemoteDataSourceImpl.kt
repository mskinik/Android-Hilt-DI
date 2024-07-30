package com.example.data.datasource

import com.example.domain.datasource.DataSource
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(): DataSource {
    override fun getData(): String = "Remote Data"
}