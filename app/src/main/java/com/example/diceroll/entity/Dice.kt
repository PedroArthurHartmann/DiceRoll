package com.example.diceroll.entity

class Dice(val sides: Int = 6) {

    fun roll(): Int {
        return IntRange(1, sides).random()
    }

}