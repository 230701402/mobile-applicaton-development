package com.example.togglebuttoncontrollingatextviewsvisibility  // Must match your project package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton
import com.example.togglebuttoncontrollingatextviewsvisibility.R  // Use your project’s R

class MainActivity : AppCompatActivity() {

    private lateinit var toggleButton: ToggleButton
    private lateinit var messageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        toggleButton = findViewById(R.id.toggleButton)
        messageTextView = findViewById(R.id.messageTextView)

        // Toggle the visibility of the TextView
        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            messageTextView.visibility = if (isChecked) TextView.VISIBLE else TextView.GONE
        }
    }
}