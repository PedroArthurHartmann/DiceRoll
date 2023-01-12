package com.example.diceroll.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diceroll.R
import com.example.diceroll.adapter.DiceListAdapter
import com.example.diceroll.databinding.ActivityDiceListBinding

class DiceListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDiceListBinding
    private var diceSides: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDiceListBinding.inflate(layoutInflater)

        setContentView(binding.root)
        diceSides = intent.getIntExtra(SIDES_TAG, 0)
        binding.tvTitle.text = getString(R.string.list_of_possibilities, diceSides)
        binding.rvList.adapter = DiceListAdapter(diceSides)
        binding.rvList.layoutManager = LinearLayoutManager(this)
    }

    companion object {
        const val SIDES_TAG = "SIDES"
    }
}