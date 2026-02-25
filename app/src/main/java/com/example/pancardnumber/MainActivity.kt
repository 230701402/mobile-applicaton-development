package com.example.pancardnumber

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etPan: EditText
    private lateinit var etPincode: EditText
    private lateinit var btnValidate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPan = findViewById(R.id.etPan)
        etPincode = findViewById(R.id.etPincode)
        btnValidate = findViewById(R.id.btnValidate)

        btnValidate.setOnClickListener {
            validateInputs()
        }
    }

    private fun validateInputs() {
        val pan = etPan.text.toString().trim()
        val pincode = etPincode.text.toString().trim()

        // Check if fields are empty
        if (pan.isEmpty() || pincode.isEmpty()) {
            Toast.makeText(this, "Both fields are required", Toast.LENGTH_SHORT).show()
            return
        }

        // Validate PAN (10 alphanumeric characters)
        val panRegex = Regex("^[A-Za-z]{5}[0-9]{4}[A-Za-z]{1}$")
        if (!pan.matches(panRegex)) {
            Toast.makeText(this, "Invalid PAN Card Number", Toast.LENGTH_SHORT).show()
            return
        }

        // Validate Pincode (6 digits)
        val pincodeRegex = Regex("^[0-9]{6}$")
        if (!pincode.matches(pincodeRegex)) {
            Toast.makeText(this, "Invalid Pincode", Toast.LENGTH_SHORT).show()
            return
        }

        // If all validations pass
        Toast.makeText(this, "PAN and Pincode are valid!", Toast.LENGTH_SHORT).show()
    }
}