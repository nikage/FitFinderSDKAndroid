package com.fitfinder.sample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.fitfinder.sdk.FitFinder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightInput: EditText = findViewById(R.id.heightInput)
        val weightInput: EditText = findViewById(R.id.weightInput)
        val resultText: TextView = findViewById(R.id.resultText)
        val calculateButton: Button = findViewById(R.id.calculateButton)

        calculateButton.setOnClickListener {
            val height = heightInput.text.toString().toDoubleOrNull()
            val weight = weightInput.text.toString().toDoubleOrNull()

            if (height != null && weight != null) {
                val recommendedSize = FitFinder.recommendSize(height, weight)

                resultText.text = "Your Recommended Size: $recommendedSize"
            } else {
                resultText.text = "Please enter valid height and weight!"
            }
        }
    }
}
