package com.example.data.manager

import javax.inject.Inject
import javax.inject.Singleton

class SessionCounterManager @Inject constructor() {
    var counter = 0
        private set

    fun increment() {
        counter++
    }
}