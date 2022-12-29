package com.example.courseapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$userName , You will get all the content for free for 1 month"
        textView.text = message
        val skipOffer = findViewById<Button>(R.id.btnSkip)
        skipOffer.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("USER", userName)
            startActivity(intent)
        }
    }
}