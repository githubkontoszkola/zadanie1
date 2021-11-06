package com.example.z1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.replace).setOnClickListener {
            findViewById<TextView>(R.id.text_output).text = findViewById<EditText>(R.id.i_textbox).text.toString();
        }

        findViewById<Button>(R.id.dodaj).setOnClickListener() {
            findViewById<TextView>(R.id.text_output).text = findViewById<TextView>(R.id.text_output).text.toString() + findViewById<EditText>(R.id.i_textbox).text.toString();
        }

        findViewById<Button>(R.id.suma).setOnClickListener() {
            findViewById<TextView>(R.id.text_output).text = (findViewById<EditText>(R.id.x1).text.toString().toDouble() + findViewById<EditText>(R.id.x2).text.toString().toDouble()).toString();
        }
    }
}