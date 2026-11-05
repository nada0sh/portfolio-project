package com.example.portfolio

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val etMessage = findViewById<EditText>(R.id.etMessage)
        val btnSend = findViewById<Button>(R.id.btnSend)

        btnSend.setOnClickListener {
            val msg = etMessage.text.toString()
            if (msg.isEmpty()) {
                Toast.makeText(this, "Please write a message", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Message sent", Toast.LENGTH_SHORT).show()
                etMessage.setText("")
            }
        }
    }
}
