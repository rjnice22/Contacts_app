package com.hfad.a16pa_contactsapp

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val contact1 = findViewById<Button>(R.id.btn_name_1)
        contact1.setOnClickListener {
            startActivity(Intent(this, AlexStone::class.java))
        }

        val contact2 = findViewById<Button>(R.id.btn_name_2)
        contact2.setOnClickListener {
            startActivity(Intent(this, Ash::class.java))
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}