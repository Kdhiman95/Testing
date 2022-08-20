package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var btn : Button
    private lateinit var getName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.sendData)
        getName = findViewById(R.id.getName)

        val name = getName.text

        btn.setOnClickListener {
            val intent = Intent(this, DisplayName::class.java)
            Log.d("Tag1", name.toString())
            intent.putExtra("name",name.toString())
            startActivity(intent)
        }
    }
}