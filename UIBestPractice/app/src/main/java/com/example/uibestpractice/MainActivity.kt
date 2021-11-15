package com.example.uibestpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val msgList = ArrayList<Msg>()
    private lateinit var adapter: MsgAdapter

    private fun initMsg() {
        val msg1 = Msg("Hello guy.", Msg.TYPE_RECEIVED)
        msgList.add(msg1)
        val msg2 = Msg("Hello who is that", Msg.TYPE_SEND)
        msgList.add(msg2)
        val msg3 = Msg("you father", Msg.TYPE_RECEIVED)
        msgList.add(msg3)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMsg()
        button.setOnClickListener(this)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        adapter = MsgAdapter(msgList)
        recyclerView.adapter = adapter
    }

    override fun onClick(v: View?) {
        when(v) {
            button -> {
                val content = editText.text.toString()
                val msg = Msg(content, Msg.TYPE_SEND)
                msgList.add(msg)
                adapter.notifyItemInserted(msgList.size - 1)
                recyclerView.scrollToPosition(msgList.size - 1)
                editText.setText("")
            }
        }
    }
}