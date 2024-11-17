package com.fitfinder.sdk

object FitFinder {
    fun recommendSize(height: Double, weight: Double): String {
        val bmi = SizeCalculator.calculateBMI(height, weight)
        return SizeCalculator.sizeFromBMI(bmi)
    }
}
