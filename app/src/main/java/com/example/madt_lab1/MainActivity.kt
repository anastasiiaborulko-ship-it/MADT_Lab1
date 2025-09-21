package com.example.madt_lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.graphics.Color
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val buttonChangeText = findViewById<Button>(R.id.buttonChangeText)
        val buttonChangeColor = findViewById<Button>(R.id.buttonChangeColor)
        val buttonChangeBackground = findViewById<Button>(R.id.buttonChangeBackground)
        val rootLayout = findViewById<View>(R.id.rootLayout)

        buttonChangeText.setOnClickListener {
            textView.text = "Button clicked — text changed!"
        }

        buttonChangeColor.setOnClickListener {
            textView.setTextColor(Color.RED)
        }

        buttonChangeBackground.setOnClickListener {
            rootLayout.setBackgroundColor(Color.YELLOW)
        }
    }
}


