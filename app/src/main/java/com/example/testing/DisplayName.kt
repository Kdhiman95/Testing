package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class DisplayName : AppCompatActivity() {
    private lateinit var show : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_name)
        show = findViewById(R.id.showData)

//        val it = intent
        val name = intent.getStringExtra("name")
        Log.d("Tag", name.toString())
        show.text = name.toString()

    }
}