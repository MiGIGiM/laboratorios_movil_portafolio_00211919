package com.fmiguelop.laboratorio_4

import android.content.Intent
import android.content.Intent.EXTRA_TEXT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ConfirmInfoActivity : AppCompatActivity() {
    private lateinit var shareButton: Button
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var phoneTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_info)

        bind()

        if (intent != null) {
            intent.extras?.apply {
                val name = getString(MainActivity.NAME)
                val email = getString(MainActivity.EMAIL)
                val phone = getString(MainActivity.PHONE)
                nameTextView.apply {
                    text = getString(R.string.nombre_info_text, name)
                }
                emailTextView.apply {
                    text = getString(R.string.email_info_text, email)
                }

                phoneTextView.apply {
                    text = getString(R.string.phone_info_text, phone)
                }

            }
        }


        shareButton.setOnClickListener {
            val strToSend = "${nameTextView.text} ${emailTextView.text} ${phoneTextView.text}"
            val intent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(EXTRA_TEXT, strToSend)
                type= "text/plain"
            }

            startActivity(Intent.createChooser(intent, null))
        }
    }

    private fun bind() {
        shareButton = findViewById(R.id.share_action)
        nameTextView = findViewById(R.id.name_info_text)
        emailTextView = findViewById(R.id.email_info_text)
        phoneTextView = findViewById(R.id.phone_info_text)
    }
}