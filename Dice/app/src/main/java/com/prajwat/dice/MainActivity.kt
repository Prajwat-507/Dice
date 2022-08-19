package com.prajwat.dice

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton : Button = findViewById(R.id.button)
        rollbutton.setOnClickListener{
            val toast = Toast.makeText(this, "Dice rolled", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM, 1,1)
            toast.show()
            rolldice()
        }
    }

    private fun rolldice() {
        val Dice = Dice_roller(6)
        val dice = Dice.randomnumber()
        val diceImage: ImageView = findViewById(R.id.imageView)//Find th image view in the layout
        when(dice){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
   class Dice_roller(private var Sides: Int) {
        fun randomnumber(): Int {
            val randomnumber = (1..Sides).random()
            return randomnumber
        }
    }
}