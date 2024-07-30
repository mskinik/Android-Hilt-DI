package com.example.ui

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.MyApplication
import com.example.data.manager.ActivitySessionCounterWithScopeManager
import com.example.data.manager.SessionCounterManager
import com.example.domain.repository.ActivitySessionCounterRepository
import com.example.hiltproject.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragmentsActivity : AppCompatActivity() {
    @Inject
    lateinit var sessionCounterManager: SessionCounterManager

    @Inject
    lateinit var activitySessionCounterWithScopeManager: ActivitySessionCounterWithScopeManager

    @Inject
    lateinit var activitySessionCounterWithScopeManager2: ActivitySessionCounterWithScopeManager

    @Inject
    lateinit var activitySessionCounterRepository: ActivitySessionCounterRepository

    @Inject
    lateinit var activitySessionCounterRepository2: ActivitySessionCounterRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragments)
        sessionCounterManager.increment()
        println("session = ${sessionCounterManager.counter}")

        activitySessionCounterWithScopeManager.increment()
        println("MainFragmentsActivity activitySessionCounterWithScopeManager.counter = ${activitySessionCounterWithScopeManager.counter}")
        activitySessionCounterWithScopeManager2.increment()
        println("MainFragmentsActivity activitySessionCounterWithScopeManager2.counter = ${activitySessionCounterWithScopeManager2.counter}")

        activitySessionCounterRepository.increment()
        println("FirstFragment activitySessionCounterManager.getCounter() = ${activitySessionCounterRepository.getCounter()}")
        activitySessionCounterRepository2.increment()
        println("FirstFragment activitySessionCounterRepository2.getCounter() = ${activitySessionCounterRepository2.getCounter()}")

    }
}