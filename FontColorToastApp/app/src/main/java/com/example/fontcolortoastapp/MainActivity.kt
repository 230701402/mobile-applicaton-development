package com.example.fontcolortoastapp

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private var isChanged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener {

            if (!isChanged) {
                textView.setTextColor(getColor(android.R.color.holo_blue_dark))
                textView.setTypeface(Typeface.SERIF, Typeface.BOLD)
                Toast.makeText(this, "Font and Color Changed", Toast.LENGTH_SHORT).show()
                isChanged = true
            } else {
                textView.setTextColor(getColor(android.R.color.black))
                textView.setTypeface(Typeface.DEFAULT, Typeface.NORMAL)
                Toast.makeText(this, "Font and Color Reset", Toast.LENGTH_SHORT).show()
                isChanged = false
            }
        }
    }
}
