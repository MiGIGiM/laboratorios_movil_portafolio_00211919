package com.fmiguelop.laboratorio_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tenCentsImageView: ImageView
    private lateinit var fiveCentsImageView: ImageView
    private lateinit var quarterImageView: ImageView
    private lateinit var dollarImageView: ImageView
    private lateinit var moneyCounterTextView: TextView

    var money = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        moneyCounterTextView.text = money.toString()

        clickListeners()
    }

    private fun clickListeners() {
        tenCentsImageView.setOnClickListener {
            money = (money + 0.10).toFloat()
            moneyCounterTextView.text = money.toString()
        }
        fiveCentsImageView.setOnClickListener {
            money = (money + 0.05).toFloat()
            moneyCounterTextView.text = money.toString()
        }
        quarterImageView.setOnClickListener {
            money = (money + 0.25).toFloat()
            moneyCounterTextView.text = money.toString()
        }
        dollarImageView.setOnClickListener {
            money += 1
            moneyCounterTextView.text = money.toString()
        }
    }

    private fun bind() {
        tenCentsImageView = findViewById(R.id.ten_cents_image_view)
        fiveCentsImageView = findViewById(R.id.five_cents_image_view)
        quarterImageView = findViewById(R.id.quarter_image_view)
        dollarImageView = findViewById(R.id.dollar_image_view)
        moneyCounterTextView = findViewById(R.id.coin_counter_text_view)

    }
}