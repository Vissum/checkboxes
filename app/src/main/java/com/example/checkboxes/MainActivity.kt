package com.example.checkboxes



import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var sumCheckBox: CheckBox
    private lateinit var subtractCheckBox: CheckBox
    private lateinit var calculateButton: Button
    private lateinit var resultTextView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1EditText = findViewById(R.id.number1EditText)
        number2EditText = findViewById(R.id.number2EditText)
        sumCheckBox = findViewById(R.id.sumCheckBox)
        subtractCheckBox = findViewById(R.id.subtractCheckBox)
        calculateButton = findViewById(R.id.calculateButton)
        resultTextView = findViewById(R.id.resultTextView)

        calculateButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toInt()
            val number2 = number2EditText.text.toString().toInt()

            var result = 0

            if (sumCheckBox.isChecked) {
                result = number1 + number2
            } else if (subtractCheckBox.isChecked) {
                result = number1 - number2
            }

            resultTextView.text = "El resultado es: $result"
        }
    }
}
