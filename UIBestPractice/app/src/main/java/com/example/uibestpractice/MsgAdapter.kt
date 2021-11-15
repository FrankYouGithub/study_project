package com.example.uibestpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.Error
import java.lang.IllegalArgumentException

class MsgAdapter(val msgList: List<Msg>) : RecyclerView.Adapter<MsgViewAdapter>() {
    override fun getItemViewType(position: Int): Int {
        val msg = msgList[position]
        return msg.type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = if (viewType == Msg.TYPE_RECEIVED) {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.message_left_item, parent, false)
        LeftViewHolder(view)
    } else {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.message_right_item, parent, false)
        RightViewHolder(view)
    }
    override fun getItemCount() = msgList.size
    override fun onBindViewHolder(holder: MsgViewAdapter, position: Int) {
        val msg = msgList[position]
        when(holder) {
            is LeftViewHolder -> holder.leftMsg.text = msg.content
            is RightViewHolder -> holder.rightMsg.text = msg.content
        }
    }
}

