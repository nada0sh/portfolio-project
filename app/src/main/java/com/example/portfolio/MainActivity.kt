package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbout = findViewById<Button>(R.id.btnAbout)
        btnAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        val btnBlog = findViewById<Button>(R.id.btnBlog)
        btnBlog.setOnClickListener {
            startActivity(Intent(this, BlogActivity::class.java))
        }

        val btnContact = findViewById<Button>(R.id.btnContact)
        btnContact.setOnClickListener {
            startActivity(Intent(this, ContactActivity::class.java))
        }
    }
}
