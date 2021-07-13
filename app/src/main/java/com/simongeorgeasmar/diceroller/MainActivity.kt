package com.simongeorgeasmar.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/** This Activity allows the user to toll a dice and view the result on the screen **/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * rolls dice and updates text in textView with the result
     * **/
    private fun rollDice() {
        //Creates Dice object with numSides = 6 and rolls it
        val dice = Dice(6)
        val diceRoll = dice.roll()


        val diceImage: ImageView = findViewById(R.id.imageView)

        //Changes image based on diceRoll
        when (diceRoll){
            //If user rolls a 1, display dice_1 img
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            //If user rolls a 2, display dice_2 img
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            //If user rolls a 3, display dice_3 img
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            //If user rolls a 4, display dice_4 img
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            //If user rolls a 5, display dice_5 img
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            //If user rolls a 6, display dice_6 img
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }

    }
}

class Dice(private val numSides: Int) {
    //Returns a random Int value between the IntRange of 1 and number of sides
    fun roll(): Int {
        return (1..numSides).random()
    }
}