package com.rameshlogu.base.ui.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Rule
import org.junit.Test

class HomeViewModelTest {
    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Test
    fun changeText() {
        val homeViewModel = HomeViewModel()
        homeViewModel.changeText(true)
        assert(homeViewModel.text.value == "This is home")
        homeViewModel.changeText(false)
        assert(homeViewModel.text.value == "This is home view")
    }
}