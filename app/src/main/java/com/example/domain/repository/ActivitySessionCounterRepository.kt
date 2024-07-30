package com.example.domain.repository

interface ActivitySessionCounterRepository {
    fun getCounter(): Int

    fun increment()
}