package com.example.data.manager

import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

@FragmentScoped
class FragmentSessionCounterWithScopeManager @Inject constructor(){
    var counter = 0
        private set

    fun increment() {
        counter++
    }
}