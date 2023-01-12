package com.example.diceroll.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.diceroll.R
import com.example.diceroll.databinding.ActivityMainBinding
import com.example.diceroll.entity.Dice
import com.example.diceroll.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setContentView(bind.root)

        bindListeners()
    }

    private fun bindListeners() {

        bind.btShowList.setOnClickListener {

            val intent = Intent(this, DiceListActivity::class.java)
            intent.putExtra("SIDES", viewModel.getDiceSides())

            startActivity(intent)
        }

        bind.btRoll.setOnClickListener {
            viewModel.roll()
        }

        viewModel.result.observe(this) {
            bind.tvNumGenerated.text = getString(R.string.result_txt, it)
        }
    }
}