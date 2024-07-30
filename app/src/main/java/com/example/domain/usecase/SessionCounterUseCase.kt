package com.example.domain.usecase

import com.example.data.manager.SessionCounterManager
import javax.inject.Inject


class SessionCounterUseCase @Inject constructor(
    private val sessionCounterManager: SessionCounterManager
) {
    fun incrementCounter() {
        sessionCounterManager.increment()
    }

    fun getCounter() = sessionCounterManager.counter
}