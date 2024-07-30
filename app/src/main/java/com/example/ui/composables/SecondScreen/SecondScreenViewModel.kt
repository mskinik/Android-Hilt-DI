package com.example.ui.composables.SecondScreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.data.manager.SessionCounterManager
import com.example.data.manager.ViewModelSessionCounterWithScopeManager
import com.example.domain.repository.ViewModelSessionCounterRepository
import com.example.ui.composables.navigation.EXAMPLE_ARG
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondScreenViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val viewModelSessionCounterRepository: ViewModelSessionCounterRepository,
    private val viewModelSessionCounterRepository2: ViewModelSessionCounterRepository,
    private val sessionCounterManager: SessionCounterManager,
    private val viewModelSessionCounterWithScopeManager: ViewModelSessionCounterWithScopeManager,
    private val viewModelSessionCounterWithScopeManager2: ViewModelSessionCounterWithScopeManager,
    ) : ViewModel() {
    init {
        val arg = savedStateHandle.get<String>(EXAMPLE_ARG)
        println("arg = $arg")
        viewModelSessionCounterRepository.increment()
        println(" SecondScreenViewModel viewModelSessionCounterRepository.getCounter() = ${viewModelSessionCounterRepository.getCounter()}")
        viewModelSessionCounterRepository2.increment()
        println(" SecondScreenViewModel viewModelSessionCounterRepository2.getCounter() = ${viewModelSessionCounterRepository2.getCounter()}")

        sessionCounterManager.increment()
        println("SecondScreenViewModel sessionCounterManager.counter = ${sessionCounterManager.counter}")

        viewModelSessionCounterWithScopeManager.increment()
        println("SecondScreenViewModel  viewModelSessionCounterWithScopeManager.counter = ${viewModelSessionCounterWithScopeManager.counter}")
        viewModelSessionCounterWithScopeManager2.increment()
        println("SecondScreenViewModel  viewModelSessionCounterWithScopeManager2.counter = ${viewModelSessionCounterWithScopeManager2.counter}")
    }
}