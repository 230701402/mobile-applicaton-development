package com.example.celsiusandfahernheit

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputTemp = findViewById<EditText>(R.id.inputTemperature)
        val btnToF = findViewById<Button>(R.id.btnToFahrenheit)
        val btnToC = findViewById<Button>(R.id.btnToCelsius)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnToF.setOnClickListener {
            val celsius = inputTemp.text.toString().toDoubleOrNull()
            if (celsius != null) {
                val fahrenheit = (celsius * 9 / 5) + 32
                tvResult.text = "$celsius °C = $fahrenheit °F"
            } else {
                tvResult.text = "Enter a valid number"
            }
        }

        btnToC.setOnClickListener {
            val fahrenheit = inputTemp.text.toString().toDoubleOrNull()
            if (fahrenheit != null) {
                val celsius = (fahrenheit - 32) * 5 / 9
                tvResult.text = "$fahrenheit °F = $celsius °C"
            } else {
                tvResult.text = "Enter a valid number"
            }
        }
    }
}