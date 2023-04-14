package com.fmiguelop.laboratorio_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: TextInputLayout
    private lateinit var emailEditText: TextInputLayout
    private lateinit var phoneEditText: TextInputLayout
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        setOnClickListeners()
    }

    private fun bind() {
        nameEditText = findViewById(R.id.name_edit_text)
        emailEditText = findViewById(R.id.email_edit_text)
        phoneEditText = findViewById(R.id.phone_edit_text)
        saveButton = findViewById(R.id.save_action)
    }

    private fun setOnClickListeners() {
        saveButton.setOnClickListener {
            var intent = Intent(MainActivity@ this, ConfirmInfoActivity::class.java)
            intent.putExtra(NAME, nameEditText.editText?.text.toString())
            intent.putExtra(EMAIL, emailEditText.editText?.text.toString())
            intent.putExtra(PHONE, phoneEditText.editText?.text.toString())

            startActivity(intent)
        }
    }

    companion object {
        const val NAME = "NAME"
        const val EMAIL = "EMAIL"
        const val PHONE = "PHONE"
    }
}