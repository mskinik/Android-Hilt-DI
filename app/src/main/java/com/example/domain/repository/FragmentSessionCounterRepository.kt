package com.example.domain.repository

interface FragmentSessionCounterRepository {
    fun getCounter(): Int

    fun increment()
}