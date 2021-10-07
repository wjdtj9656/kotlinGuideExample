package com.example.diceroller

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Dice(val numSides: Int){
    fun roll(): Int{
        return (1..numSides).random()
    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button);
        rollButton.setOnClickListener {
          // val toast = Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT)
            // toast.show()

           // Toast.makeText(this,"Dice Rolled!!",Toast.LENGTH_SHORT).show()
        //val resultTextView: TextView = findViewById(R.id.textView)
         //   resultTextView.text = "6"
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}