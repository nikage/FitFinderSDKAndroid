package com.fitfinder.sdk

object SizeCalculator {
    /**
     * Calculates the Body Mass Index (BMI) using the given height and weight.
     *
     * @param height The user's height in centimeters (e.g., 175.0 for 175 cm).
     * @param weight The user's weight in kilograms (e.g., 70.0 for 70 kg).
     * @return A Double representing the calculated BMI value.
     */
    fun calculateBMI(height: Double, weight: Double): Double {
        val heightInMeters = height / 100.0
        return weight / (heightInMeters * heightInMeters)
    }

    /**
     * Determines the clothing size based on the calculated BMI.
     *
     * @param bmi The Body Mass Index value calculated using `calculateBMI`.
     * @return A string representing the clothing size:
     * - "S" for Small (BMI < 18.5)
     * - "M" for Medium (BMI between 18.5 and 24.9)
     * - "L" for Large (BMI between 25.0 and 29.9)
     * - "XL" for Extra Large (BMI >= 30.0)
     */
    fun sizeFromBMI(bmi: Double): String {
        return when {
            bmi < 18.5 -> "S"
            bmi in 18.5..24.9 -> "M"
            bmi in 25.0..29.9 -> "L"
            else -> "XL"
        }
    }
}
