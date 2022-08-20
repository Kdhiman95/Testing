package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    private lateinit var btn2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btn2 = findViewById(R.id.button3)

        btn2.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("Activity1", "onStart B")

    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity1", "onResume: B")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity1", "onPause: B")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Activity1", "onRestart: A")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity1", "onStop: B")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity1", "onDestroy: B")
    }
}