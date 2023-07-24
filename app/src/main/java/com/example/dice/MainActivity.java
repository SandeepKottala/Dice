package com.example.dice;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import  android.widget.Toast;
import com.example.dice.R;
import kotlinx.android.synthetic.main.activity_main.button_id;
import kotlinx.android.synthetic.main.activity_main.imageView_id;

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_id.setOnClickListener{
        diceRoll()

        }
        }


private fun diceRoll() {
        var randomNo = (1..6).random()
        var imageDice: Int
        when (randomNo) {
        1 -> {
        imageDice= R.drawable.one
        }
        2 -> {
        imageDice= R.drawable.two
        }
        3 -> {
        imageDice= R.drawable.three
        }
        4 -> {
        imageDice= R.drawable.four
        }
        5 -> {
        imageDice=  R.drawable.five
        }
        else -> {
        imageDice=  R.drawable.six
        }
        }

        imageView_id.setImageResource(imageDice)
        Toast.makeText(this ,"dice is rolled",Toast.LENGTH_SHORT).show()

        }
        
