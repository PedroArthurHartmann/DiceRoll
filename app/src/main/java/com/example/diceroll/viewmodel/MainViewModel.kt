package com.example.diceroll.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.diceroll.R
import com.example.diceroll.databinding.ActivityMainBinding
import com.example.diceroll.entity.Dice

class MainViewModel : ViewModel() {

    private val mutableResult = MutableLiveData(0)
    val result: LiveData<Int> = mutableResult
    private val mutableDice = MutableLiveData(Dice(4))

    fun roll() {

        var value = 0

        do {

            value = mutableDice.value!!.roll()

        } while (value == mutableResult.value)

        mutableResult.value = value
    }

    fun changeImage(binder: ActivityMainBinding) {
        when (mutableDice.value!!.sides) {
            4 -> binder.ivDice.setImageResource(R.drawable.im_dice_d4)
            6 -> binder.ivDice.setImageResource(R.drawable.im_dice_d6)
            8 -> binder.ivDice.setImageResource(R.drawable.d8)
            10 -> binder.ivDice.setImageResource(R.drawable.im_dice_d10)
            12 -> binder.ivDice.setImageResource(R.drawable.im_dice_d12)
            20 -> binder.ivDice.setImageResource(R.drawable.d20)
        }
    }

    fun getDiceSides() = mutableDice.value!!.sides
    fun setDiceSlides(sides: Int) {
        mutableDice.value = Dice(sides)
    }
}