package com.example.domain.repository

interface ViewModelSessionCounterRepository {
    fun getCounter(): Int

    fun increment()
}