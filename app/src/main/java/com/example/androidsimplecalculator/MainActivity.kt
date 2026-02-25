package com.example.androidsimplecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editNumber1: EditText
    private lateinit var editNumber2: EditText
    private lateinit var btnAdd: Button
    private lateinit var btnSubtract: Button
    private lateinit var btnMultiply: Button
    private lateinit var btnDivide: Button
    private lateinit var textResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNumber1 = findViewById(R.id.editNumber1)
        editNumber2 = findViewById(R.id.editNumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        textResult = findViewById(R.id.textResult)

        btnAdd.setOnClickListener { calculateResult(Operation.ADD) }
        btnSubtract.setOnClickListener { calculateResult(Operation.SUBTRACT) }
        btnMultiply.setOnClickListener { calculateResult(Operation.MULTIPLY) }
        btnDivide.setOnClickListener { calculateResult(Operation.DIVIDE) }
    }

    private fun calculateResult(operation: Operation) {
        val num1Str = editNumber1.text.toString()
        val num2Str = editNumber2.text.toString()

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            return
        }

        val num1 = num1Str.toDoubleOrNull()
        val num2 = num2Str.toDoubleOrNull()

        if (num1 == null || num2 == null) {
            Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            return
        }

        val result = when (operation) {
            Operation.ADD -> num1 + num2
            Operation.SUBTRACT -> num1 - num2
            Operation.MULTIPLY -> num1 * num2
            Operation.DIVIDE -> {
                if (num2 == 0.0) {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                    return
                } else {
                    num1 / num2
                }
            }
        }

        textResult.text = "Result: $result"
    }

    enum class Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }
}