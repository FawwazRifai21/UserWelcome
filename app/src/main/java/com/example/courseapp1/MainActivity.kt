package com.example.courseapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputField = findViewById<EditText>(R.id.etName)
        val submitButton = findViewById<Button>(R.id.Submit)

        submitButton.setOnClickListener {
            val enteredName = inputField.text.toString()

            if (enteredName == "") {
                greetingTextView.text = "Hello New User!"
                Toast.makeText(this@MainActivity,
                    "Please enter a valid name",
                    Toast.LENGTH_SHORT).show()
            }else {
                val message = "Welcome $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
            }
        }
    }
}