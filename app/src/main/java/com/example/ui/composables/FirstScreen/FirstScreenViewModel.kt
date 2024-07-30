package com.example.ui.composables.FirstScreen

import androidx.lifecycle.ViewModel
import com.example.data.manager.SessionCounterManager
import com.example.data.manager.ViewModelSessionCounterWithScopeManager
import com.example.domain.repository.ExampleRepository
import com.example.domain.repository.ViewModelSessionCounterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstScreenViewModel @Inject constructor(
    private val exampleRepository: ExampleRepository,
    private val viewModelSessionCounterRepository: ViewModelSessionCounterRepository,
    private val viewModelSessionCounterRepository2: ViewModelSessionCounterRepository,
    private val sessionCounterManager: SessionCounterManager,
    private val viewModelSessionCounterWithScopeManager: ViewModelSessionCounterWithScopeManager,
    private val viewModelSessionCounterWithScopeManager2: ViewModelSessionCounterWithScopeManager,
) :
    ViewModel() {
    init {
        println(exampleRepository.getDummyData())
        println("data = ${exampleRepository.getLocalData()}")

        viewModelSessionCounterRepository.increment()
        println(" FirstScreenViewModel viewModelSessionCounterRepository.getCounter() = ${viewModelSessionCounterRepository.getCounter()}")
        viewModelSessionCounterRepository2.increment()
        println(" FirstScreenViewModel viewModelSessionCounterRepository2.getCounter() = ${viewModelSessionCounterRepository2.getCounter()}")


        sessionCounterManager.increment()
        println("FirstScreenViewModel sessionCounterManager.counter = ${sessionCounterManager.counter}")


        viewModelSessionCounterWithScopeManager.increment()
        println("FirstScreenViewModel  viewModelSessionCounterWithScopeManager.counter = ${viewModelSessionCounterWithScopeManager.counter}")
        viewModelSessionCounterWithScopeManager2.increment()
        println("FirstScreenViewModel  viewModelSessionCounterWithScopeManager2.counter = ${viewModelSessionCounterWithScopeManager2.counter}")
    }
}
