package com.example.bmicalculator   // ⚠ Change if your package name is different

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editWeight = findViewById<EditText>(R.id.editWeight)
        val editHeight = findViewById<EditText>(R.id.editHeight)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val textResult = findViewById<TextView>(R.id.textResult)

        btnCalculate.setOnClickListener {

            val weightText = editWeight.text.toString()
            val heightText = editHeight.text.toString()

            if (weightText.isNotEmpty() && heightText.isNotEmpty()) {

                val weight = weightText.toDouble()
                val height = heightText.toDouble()

                if (height > 0) {
                    val bmi = weight / (height * height)
                    textResult.text = "Your BMI is: %.2f".format(bmi)
                } else {
                    textResult.text = "Height must be greater than 0"
                }

            } else {
                textResult.text = "Please enter weight and height"
            }
        }
    }
}