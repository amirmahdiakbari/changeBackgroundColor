package com.example.test1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    private lateinit var rootLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rootLayout = findViewById(R.id.rootLayout)
        val changeBackgroundColorButton: Button = findViewById(R.id.changeBackgroundColo)
        changeBackgroundColorButton.setOnClickListener {
            changeBackgroundColor()
        }
    }
    private fun changeBackgroundColor() {
        val randomColor = getRandomColor()
        rootLayout.setBackgroundColor(randomColor)
    }

    private fun getRandomColor(): Int {
        val randomRed = (0..255).random()
        val randomGreen = (0..255).random()
        val randomBlue = (0..255).random()
        return Color.rgb(randomRed, randomGreen, randomBlue)
    }

}

