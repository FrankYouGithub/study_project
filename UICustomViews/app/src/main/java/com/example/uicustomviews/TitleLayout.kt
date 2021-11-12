package com.example.uicustomviews

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.title.view.*

class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        title_back.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
        title_edit.setOnClickListener {
            Toast.makeText(context, "you click edit", Toast.LENGTH_SHORT).show()
        }
    }
}