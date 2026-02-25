package com.example.implementaionforemailandpasswordvalidation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val validateButton = findViewById<Button>(R.id.validateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        validateButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val result = validateCredentials(email, password)
            resultTextView.text = result
        }
    }

    private fun validateCredentials(email: String, password: String): String {
        // Check empty fields
        if (email.isEmpty() || password.isEmpty()) {
            return "Email and Password cannot be empty"
        }

        // Check college email pattern (example: ends with @college.edu)
        val emailPattern = "[a-zA-Z0-9._-]+@college\\.edu"
        if (!Pattern.matches(emailPattern, email)) {
            return "Invalid college email"
        }

        // Password rules:
        // 1 uppercase, 1 lowercase, 1 digit, 1 special character, min 12 chars
        val passwordPattern =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#\$%^&+=!]).{12,}$"
        if (!Pattern.matches(passwordPattern, password)) {
            return "Password must have 12+ chars, uppercase, lowercase, digit, special symbol"
        }

        return "Validation Successful ✅"
    }
}