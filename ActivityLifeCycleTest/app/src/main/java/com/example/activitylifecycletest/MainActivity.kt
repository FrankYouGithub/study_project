package com.example.activitylifecycletest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val tag = "log"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(tag, "main-onCreate")

        btn_normal.setOnClickListener {
            val intent = Intent(this, NormalActivity::class.java)
            startActivity(intent)
        }

        btn_dailog.setOnClickListener {
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "main-onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "main-onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "main-onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "main-onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "main-onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "main-onRestart")
    }
}