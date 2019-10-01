package com.example.thinkprototype

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_picture.*
import kotlinx.android.synthetic.main.prediction_activity.*

class Prediction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prediction_activity)

        againButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}