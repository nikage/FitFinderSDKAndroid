
# FitFinder SDK for Android

The **FitFinder SDK** provides a lightweight and efficient way to recommend clothing sizes based on user-provided height and weight, leveraging BMI calculations.

---

## Features

- Lightweight and simple API.
- Supports size recommendations: S, M, L, XL.
- Easy integration into Android apps.

---

## Installation

1. Add the FitFinder SDK to your project.  
   Example: Add as a module or dependency in your `build.gradle` file.

   ```gradle
   implementation "com.github.nikage:fitfindersdkandroid:1.0.0"
   ```
   
   ```kotlin
   implementation("com.github.nikage:fitfindersdkandroid:1.0.0")
   ```
   


2. Sync your project with Gradle files.

---

## Usage

### 1. Import the SDK

```kotlin
import com.fitfinder.sdk.FitFinder
```

### 2. Use the `recommendSize` Method

The `recommendSize` method takes two arguments:
- `height` (in centimeters)
- `weight` (in kilograms)

**Example Usage:**

```kotlin
val recommendedSize = FitFinder.recommendSize(height = 170.0, weight = 70.0)
println("Recommended Size: $recommendedSize")
```

### 3. Integration Example

Integrate the SDK with a simple Android activity:

```kotlin
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
```

---

## Size Recommendations

The SDK uses BMI ranges to determine sizes:

| **Size** | **BMI Range**           |
|----------|--------------------------|
| S        | BMI < 18.5              |
| M        | BMI 18.5–24.9           |
| L        | BMI 25.0–29.9           |
| XL       | BMI ≥ 30                |

---

## Requirements

- Android API Level 21+ (Android 5.0 Lollipop or higher)
- Kotlin 1.5+

