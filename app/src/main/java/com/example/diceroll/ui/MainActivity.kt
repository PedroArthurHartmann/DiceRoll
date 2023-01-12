package com.example.diceroll.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceroll.databinding.ActivityMainBinding
import com.example.diceroll.entity.Dice

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bind.root)

        bind.btRoll.setOnClickListener {
            bind.tvNumGenerated.text = "The result is ${Dice().roll()}"
        }
    }
}