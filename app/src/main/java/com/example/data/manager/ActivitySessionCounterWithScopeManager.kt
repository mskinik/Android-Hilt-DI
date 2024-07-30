package com.example.data.manager

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ActivitySessionCounterWithScopeManager @Inject constructor() {
    var counter = 0
        private set

    fun increment() {
        counter++
    }
}