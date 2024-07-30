package com.example.data.repository

import com.example.domain.repository.FragmentSessionCounterRepository
import javax.inject.Inject

class FragmentSessionCounterRepositoryImpl @Inject constructor(): FragmentSessionCounterRepository {
    private var counter = 0

    override fun getCounter(): Int = counter

    override fun increment() {
        counter++
    }
}