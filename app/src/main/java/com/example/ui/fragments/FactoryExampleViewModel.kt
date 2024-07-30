package com.example.ui.fragments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.data.manager.SessionCounterManager

class FactoryExampleViewModel(
    private val sessionCounterManager: SessionCounterManager
) : ViewModel() {

    fun callSessionCounter() {
        sessionCounterManager.increment()
        println("session = ${sessionCounterManager.counter}")
    }


    companion object {
        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                return FactoryExampleViewModel(
                    SessionCounterManager()
                ) as T
            }
        }
    }
}