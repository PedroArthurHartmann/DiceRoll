package com.example.diceroll.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroll.R
import com.example.diceroll.databinding.ActivityDiceListBinding

class DiceListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDiceListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDiceListBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val diceSides = intent.getIntExtra("SIDES", 0)

        binding.tvTitle.text = getString(R.string.list_of_possibilities, diceSides)
    }
}