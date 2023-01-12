package com.example.diceroll.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.diceroll.entity.Dice

class MainViewModel : ViewModel() {

    private val mutableResult = MutableLiveData(0)
    val result: LiveData<Int> = mutableResult

    fun roll() {
        mutableResult.value = Dice().roll()
    }
}