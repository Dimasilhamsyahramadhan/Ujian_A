package com.example.upa_xipplg1_2983

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)

        btn1.setOnClickListener {
            val Intent = Intent(this, biodata::class.java)
            startActivity(Intent)
        }
        btn2.setOnClickListener {
            val Intent = Intent(this, Pendidikan::class.java)
            startActivity(Intent)
        }
        btn3.setOnClickListener {
            val Intent = Intent(this, Portofolio::class.java)
            startActivity(Intent)
        }
    }
}