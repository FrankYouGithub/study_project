package com.example.databasetest

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dbHelper = MyDatabaseHelper(this, "BookStore.db", 3)
        val button = findViewById<Button>(R.id.button)
        // 建库建表
        button.setOnClickListener {
            dbHelper.writableDatabase
        }
        // 添加数据
        val addData = findViewById<Button>(R.id.addData)
        addData.setOnClickListener {
            val db = dbHelper.writableDatabase
            val value1 = ContentValues().apply {
                put("name", "The Da Vinci Code")
                put("author", "frank")
                put("pages", 454)
                put("price", 16.99)
            }
            db.insert("Book", null, value1)
            val value2 = ContentValues().apply {
                put("name", "The Lost Symbol")
                put("author", "frank")
                put("pages", 590)
                put("price", 19.99)
            }
            db.insert("Book", null, value2)
            Toast.makeText(this, "insert success", Toast.LENGTH_SHORT).show()
        }
        // 更新数据
        val updateData = findViewById<Button>(R.id.updateDate)
        updateData.setOnClickListener {
            val db = dbHelper.writableDatabase
            val values = ContentValues()
            values.put("price", 10.99)
            db.update("Book", values, "name = ?", arrayOf("The Da Vinci Code"))
        }
        // 删除数据
        val deleteData = findViewById<Button>(R.id.deleteDate)
        deleteData.setOnClickListener {
            val db = dbHelper.writableDatabase
            db.delete("Book","pages > ?", arrayOf("500"))
        }
        // 查询数据

    }
}