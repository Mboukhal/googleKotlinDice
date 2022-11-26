package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.diceroller.algo.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val res: ImageView = findViewById(R.id.imageView)
        // initialize Dice imageView
        res.setImageResource(R.drawable.dice_1)
        // Click button on
        rollButton.setOnClickListener { rollDice(res) }
    }

    private fun rollDice( res: ImageView ) {
        // random value dice object generator
        val dice = Dice(6)
        val diceRoll = dice.rollIt()
        // set imageView to generated value
        when ( diceRoll ) {
            1 -> res.setImageResource(R.drawable.dice_1)
            2 -> res.setImageResource(R.drawable.dice_2)
            3 -> res.setImageResource(R.drawable.dice_3)
            4 -> res.setImageResource(R.drawable.dice_4)
            5 -> res.setImageResource(R.drawable.dice_5)
            else -> res.setImageResource(R.drawable.dice_6)
        }
        val luckyNumber = 4
        // call luck number
        when (diceRoll) {
            luckyNumber -> Toast.makeText(applicationContext,"You win!", Toast.LENGTH_SHORT).show()
        }
    }
}
