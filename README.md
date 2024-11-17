# FitFinder SDK for Android

FitFinder SDK provides a lightweight API for recommending clothing sizes based on user-provided height and weight, using BMI calculations.

## Usage

```kotlin
import com.fitfinder.sdk.FitFinder

val recommendedSize = FitFinder.recommendSize(height = 170.0, weight = 70.0)
println("Recommended Size: \$recommendedSize")

