package com.application.sportsbingoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipsPage : AppCompatActivity() {

    private var btn01 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_page)

        btn01 = findViewById(R.id.btn01)
        btn01?.setOnClickListener{
            onBackPressed()
        }
    }
}