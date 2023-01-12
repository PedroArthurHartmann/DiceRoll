package com.example.diceroll.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.diceroll.entity.Dice

class MainViewModel : ViewModel() {

    private val mutableResult = MutableLiveData(0)
    val result: LiveData<Int> = mutableResult
    private val dice = Dice(20)

    fun roll() {

        var value = 0

        do {
            value = dice.roll()
        } while (value == mutableResult.value)

        mutableResult.value = value
    }

    fun getDiceSides() = dice.sides
}