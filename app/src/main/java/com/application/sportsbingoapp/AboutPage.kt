package com.application.sportsbingoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutPage : AppCompatActivity() {

    private var btn02 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        btn02 = findViewById(R.id.btn02)
        btn02?.setOnClickListener {
            onBackPressed()
        }
    }
}