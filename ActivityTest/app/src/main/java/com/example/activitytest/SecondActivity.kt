package com.example.activitytest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Toast
import kotlinx.android.synthetic.main.second_layout.*

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        Log.d("tag", "SecondActivity taskId is $taskId")
//        val extraData = intent.getStringExtra("extra_data")
//        Log.d("SecondActivity", extraData.toString())
        button2.setOnClickListener {
//            this.putReturnedData()
            SecondActivity.actionStart(this, "this is data1", "this is data2")
        }
    }

    companion object {
        fun actionStart(context: Context, data1: String, data2: String){
            // apply 方法应用
            val intent = Intent(context, ThirdActivity::class.java).apply {
                putExtra("data1", data1)
                putExtra("data2", data2)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onBackPressed() {
        this.putReturnedData()
    }

    fun putReturnedData(){
        val intent = Intent()
        intent.putExtra("data_return", "hello FirstActivity, this data is return from SecondActivity")
        setResult(RESULT_OK, intent)
        finish()
    }

    override fun onStart() {
        Log.d("data", "2-onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("data", "2-onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("data", "2-onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("data", "2-onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("data", "2-onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("data", "2-onRestart")
        super.onRestart()
    }
}