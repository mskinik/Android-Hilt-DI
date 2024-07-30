package com.example.data.manager

import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ViewModelSessionCounterWithScopeManager @Inject constructor(){
    var counter = 0
        private set

    fun increment() {
        counter++
    }
}