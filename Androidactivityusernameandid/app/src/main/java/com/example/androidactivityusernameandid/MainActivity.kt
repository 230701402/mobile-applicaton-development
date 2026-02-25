package com.example.androidactivityusernameandid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etID = findViewById<EditText>(R.id.etID)
        val btnValidate = findViewById<Button>(R.id.btnValidate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnValidate.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val id = etID.text.toString().trim()

            when {
                username.isEmpty() -> {
                    tvResult.text = "Username cannot be empty"
                }
                !username.matches(Regex("^[a-zA-Z]+$")) -> {
                    tvResult.text = "Username must contain only alphabets"
                }
                id.isEmpty() -> {
                    tvResult.text = "ID cannot be empty"
                }
                !id.matches(Regex("^\\d{4}$")) -> {
                    tvResult.text = "ID must be exactly 4 digits"
                }
                else -> {
                    tvResult.text = "Validation Successful!"
                }
            }
        }
    }
}