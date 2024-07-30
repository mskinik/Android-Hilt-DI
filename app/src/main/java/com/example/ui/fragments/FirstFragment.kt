package com.example.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.data.manager.ActivitySessionCounterWithScopeManager
import com.example.data.manager.SessionCounterManager
import com.example.domain.repository.ActivitySessionCounterRepository
import com.example.domain.repository.FragmentSessionCounterRepository
import com.example.hiltproject.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FirstFragment : Fragment() {
    private val viewModel: FactoryExampleViewModel by activityViewModels { FactoryExampleViewModel.Factory }
    @Inject
    lateinit var sessionCounterManager: SessionCounterManager

    @Inject
    lateinit var fragmentSessionCounterRepository: FragmentSessionCounterRepository

    @Inject
    lateinit var activitySessionCounterWithScopeManager: ActivitySessionCounterWithScopeManager

    @Inject
    lateinit var activitySessionCounterWithScopeManager2: ActivitySessionCounterWithScopeManager

    @Inject
    lateinit var fragmentSessionCounterWithScopeManager: ActivitySessionCounterWithScopeManager

    @Inject
    lateinit var activitySessionCounterRepository: ActivitySessionCounterRepository

    @Inject
    lateinit var activitySessionCounterRepository2: ActivitySessionCounterRepository


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sessionCounterManager.increment()
        println("session = ${sessionCounterManager.counter}")
        fragmentSessionCounterRepository.increment()
        println("fragmentSessionCounterManager.counter = ${fragmentSessionCounterRepository.getCounter()}")
        activitySessionCounterWithScopeManager.increment()
        println(" FirstFragment activitySessionCounterWithScopeManager.counter = ${activitySessionCounterWithScopeManager.counter}")
        activitySessionCounterWithScopeManager2.increment()
        println(" FirstFragment activitySessionCounterWithScopeManager2.counter = ${activitySessionCounterWithScopeManager2.counter}")

        fragmentSessionCounterWithScopeManager.increment()
        println("fragmentSessionCounterWithScopeManager.counter = ${fragmentSessionCounterWithScopeManager.counter}")


        activitySessionCounterRepository.increment()
        println(" FirstFragment activitySessionCounterManager.getCounter() = ${activitySessionCounterRepository.getCounter()}")
        activitySessionCounterRepository2.increment()
        println(" FirstFragment activitySessionCounterRepository2.getCounter() = ${activitySessionCounterRepository2.getCounter()}")
    }

}