package com.example.diceroll.entity

class Dice(private val sizes: Int = 6) {

    fun roll(): Int {
        return IntRange(1, sizes).random()
    }

}