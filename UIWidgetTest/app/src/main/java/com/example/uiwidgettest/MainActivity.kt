package com.example.uiwidgettest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.button -> {
                val text = editText.text
                textView.text = text
                Log.d("button", text.toString())
            }
            R.id.button2 -> {
                imageView.setImageResource(R.drawable.ic_launcher_background)
                Log.d("button", "button2")
            }
            R.id.button3 -> {
                Log.d("button", "button3 ${processBar.visibility.toString()}")
                if (processBar.visibility == View.VISIBLE) {
                    processBar.visibility = View.GONE
                } else {
                    processBar.visibility = View.VISIBLE
                }
//                processBar.progress = processBar.progress + 10
            }
            R.id.button4 -> {
                AlertDialog.Builder(this).apply {
                    setTitle("this is Dialog")
                    setMessage("something important message")
                    setCancelable(false)
                    setPositiveButton("submit") {dialog, which ->
                        Log.d("dailog", "submit")
                    }
                    setNegativeButton("cancel") {dialog, which ->
                        Log.d("dailog", "cancel")
                    }
                    show()
                }
            }
        }
    }
}