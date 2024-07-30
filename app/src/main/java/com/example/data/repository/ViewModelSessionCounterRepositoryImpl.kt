package com.example.data.repository

import com.example.domain.repository.ViewModelSessionCounterRepository
import javax.inject.Inject

class ViewModelSessionCounterRepositoryImpl @Inject constructor(): ViewModelSessionCounterRepository {
    private var counter = 0

    override fun getCounter(): Int = counter

    override fun increment() {
        counter++
    }
}