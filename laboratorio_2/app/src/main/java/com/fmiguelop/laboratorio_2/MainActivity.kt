package com.fmiguelop.laboratorio_2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var calculateButton: Button
    private lateinit var weightTextEditText: EditText
    private lateinit var heightTextEditText: EditText
    private lateinit var finalIBMTextView: TextView
    private lateinit var finalIBMClassTextView: TextView
    private lateinit var finalIBMRangeTextView: TextView

    private var ibm: Float = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        calculateButton.setOnClickListener {
            val weight = weightTextEditText.text.toString().toFloat()
            val height = heightTextEditText.text.toString().toFloat()

            ibm = weight / (height / 100).pow(2)

            finalIBMTextView.text = ibm.toString()

            when {
                ibm in 18.5..24.99 -> {
                    finalIBMClassTextView.setTextColor(resources.getColor(R.color.normal_weight))
                    finalIBMClassTextView.text = "Healthy"
                }
                ibm in 25.0..29.99 -> {
                    finalIBMClassTextView.setTextColor(resources.getColor(R.color.over_weight))
                    finalIBMClassTextView.text = "Overweight"
                }
                ibm < 18.5 -> {
                    finalIBMClassTextView.setTextColor(resources.getColor(R.color.under_weight))
                    finalIBMClassTextView.text = "Underweight"
                }
                else -> {
                    finalIBMClassTextView.setTextColor(resources.getColor(R.color.obese))
                    finalIBMClassTextView.text = "Obese"
                }
            }

        }
    }

    private fun bind() {
        calculateButton = findViewById(R.id.btn_calculate_bmi)

        weightTextEditText = findViewById(R.id.edit_text_weight)
        heightTextEditText = findViewById(R.id.edit_text_height)

        finalIBMTextView = findViewById(R.id.final_ibm_tv)
        finalIBMRangeTextView = findViewById(R.id.final_ibm_range)
        finalIBMClassTextView = findViewById(R.id.final_ibm_class)
    }
}