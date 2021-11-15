package com.example.uibestpractice

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

sealed class MsgViewAdapter(view: View) : RecyclerView.ViewHolder(view)

class LeftViewHolder(view: View) : MsgViewAdapter(view) {
    val leftMsg: TextView = view.findViewById(R.id.msgLeft)
}

class RightViewHolder(view: View) : MsgViewAdapter(view) {
    val rightMsg: TextView = view.findViewById(R.id.msgRight)
}