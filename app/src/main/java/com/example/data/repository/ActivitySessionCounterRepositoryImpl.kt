package com.example.data.repository

import com.example.domain.repository.ActivitySessionCounterRepository
import javax.inject.Inject

class ActivitySessionCounterRepositoryImpl @Inject constructor(): ActivitySessionCounterRepository {
    private var counter = 0

    override fun getCounter(): Int = counter

    override fun increment() {
        counter++
    }
}