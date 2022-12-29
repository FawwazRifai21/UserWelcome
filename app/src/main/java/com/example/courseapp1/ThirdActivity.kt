package com.example.courseapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val userName = intent.getStringExtra("USER")
        val welcome = findViewById<TextView>(R.id.tvWelcome)
        welcome.text = "Welcome Home, $userName"
    }
}