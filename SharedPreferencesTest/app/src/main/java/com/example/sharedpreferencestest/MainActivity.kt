package com.example.sharedpreferencestest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val editor = getSharedPreferences("data", Context.MODE_PRIVATE).edit()
            editor.putString("name", "frank")
            editor.putInt("age", 27)
            editor.putBoolean("merried", true)
            editor.apply()
        }
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val reader = getSharedPreferences("data", Context.MODE_PRIVATE)
            val name = reader.getString("name", "")
            val age = reader.getInt("age", 0)
            val merried = reader.getBoolean("merried", false)

            Log.d("store data", "name is $name, age is $age, he is merried? $merried")
        }
    }
}