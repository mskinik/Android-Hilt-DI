package com.example.data.datasource

import com.example.domain.datasource.DataSource
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(): DataSource {
    override fun getData(): String = "Local Data"
}