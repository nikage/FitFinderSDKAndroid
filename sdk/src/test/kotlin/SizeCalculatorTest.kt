package com.fitfinder.tests

import com.fitfinder.sdk.SizeCalculator
import org.junit.Assert.assertEquals
import org.junit.Test

class SizeCalculatorTest {

    @Test
    fun testCalculateBMI() {
        val bmi = SizeCalculator.calculateBMI(170.0, 70.0)
        assertEquals(24.22, bmi, 0.01)
    }

    @Test
    fun testSizeRecommendation() {
        assertEquals("S", SizeCalculator.sizeFromBMI(17.0))
        assertEquals("M", SizeCalculator.sizeFromBMI(20.0))
        assertEquals("L", SizeCalculator.sizeFromBMI(27.0))
        assertEquals("XL", SizeCalculator.sizeFromBMI(35.0))
    }
}
