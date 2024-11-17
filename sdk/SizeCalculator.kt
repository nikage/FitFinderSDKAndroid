package com.fitfinder.sdk

object SizeCalculator {
    fun calculateBMI(height: Double, weight: Double): Double {
        val heightInMeters = height / 100.0
        return weight / (heightInMeters * heightInMeters)
    }

    fun sizeFromBMI(bmi: Double): String {
        return when {
            bmi < 18.5 -> "S"
            bmi in 18.5..24.9 -> "M"
            bmi in 25.0..29.9 -> "L"
            else -> "XL"
        }
    }
}
