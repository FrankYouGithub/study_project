package com.example.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.third_layout.*

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)
        Log.d("tag", "ThirdActivity taskId is $taskId")
        val data1: String? = intent.getStringExtra("data1")
        val data2: String? = intent.getStringExtra("data2")
        Log.d("data1", data1?:"")
        Log.d("data2", data2?:"")
        button3.setOnClickListener {
            ActivityCollector.finishAll()
        }
    }
}