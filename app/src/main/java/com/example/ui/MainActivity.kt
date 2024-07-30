package com.example.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.data.manager.SessionCounterManager
import com.example.data.manager.ActivitySessionCounterWithScopeManager
import com.example.domain.repository.ActivitySessionCounterRepository
import com.example.hiltproject.ui.theme.HiltProjectTheme
import com.example.ui.composables.navigation.NavigationHost
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var gson: Gson

    @Inject
    @Named("AString")
    lateinit var aString: String

    @Inject
    @Named("BString")
    lateinit var bString: String

    @Inject
    lateinit var activitySessionCounterRepository: ActivitySessionCounterRepository

    @Inject
    lateinit var activitySessionCounterRepository2: ActivitySessionCounterRepository

    @Inject
    lateinit var activitySessionCounterWithScopeManager: ActivitySessionCounterWithScopeManager

    @Inject
    lateinit var sessionCounterManager: SessionCounterManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("aString = $aString")
        println("bString = $bString")
        activitySessionCounterRepository.increment()
        println("MainActivity activitySessionCounterManager.getCounter() = ${activitySessionCounterRepository.getCounter()}")
        activitySessionCounterRepository2.increment()
        println("MainActivity activitySessionCounterRepository2.getCounter() = ${activitySessionCounterRepository2.getCounter()}")
        activitySessionCounterWithScopeManager.increment()
        println("activitySessionCounterWithScopeManager.counter = ${activitySessionCounterWithScopeManager.counter}")

        sessionCounterManager.increment()
        println("MainActivity sessionCounterManager.counter = ${sessionCounterManager.counter}")
        enableEdgeToEdge()
        setContent {
            HiltProjectTheme {
                NavigationHost()
            }
        }
    }
}