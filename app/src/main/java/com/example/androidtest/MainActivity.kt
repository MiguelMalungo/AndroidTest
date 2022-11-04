package com.example.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

        fun rollDice(view: View) {
            //val dice = Dice(2)
            //val DiceRoll = dice.roll()
            val numSides= 6
            val resultTextView: TextView = findViewById(R.id.textView3)
            val DiceRoll=(1..numSides).random()

            resultTextView.text = DiceRoll.toString()
            val diceImage: ImageView = findViewById(R.id.imageView2)
            when (DiceRoll) {
                1 -> diceImage.setImageResource(R.drawable._056973_dice_1_icon_1_)
                2 -> diceImage.setImageResource(R.drawable._056833_dice_2_icon)
                3 -> diceImage.setImageResource(R.drawable._056923_dice_3_icon)
                4 -> diceImage.setImageResource(R.drawable._021296_dice_four_bold_icon)
                5 -> diceImage.setImageResource(R.drawable._040066_dice_icon)
                6 -> diceImage.setImageResource(R.drawable._056747_dice_icon)

            }
        }
    }


