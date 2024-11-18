package com.fitfinder.sdk

object FitFinder {

    /**
     * Recommends a clothing size based on the user's height and weight.
     *
     * This function calculates the BMI (Body Mass Index) using the provided height and weight
     * and then determines an appropriate size based on the BMI value.
     *
     * @param height The user's height in meters (e.g., 1.75 for 175 cm).
     * @param weight The user's weight in kilograms (e.g., 70.0 for 70 kg).
     * @return A string representing the recommended clothing size (e.g., "M" for Medium).
     */
    fun recommendSize(height: Double, weight: Double): String {
        val bmi = SizeCalculator.calculateBMI(height, weight)
        return SizeCalculator.sizeFromBMI(bmi)
    }
}
