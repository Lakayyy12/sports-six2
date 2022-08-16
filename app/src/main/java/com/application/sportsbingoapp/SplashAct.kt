package com.application.sportsbingoapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.dakulangsakalam.customwebview.presentation.ui.jump.JumpActivity
import com.dakulangsakalam.customwebview.presentation.ui.jump.JumpType
import kotlinx.coroutines.ExperimentalCoroutinesApi

@OptIn(ExperimentalCoroutinesApi::class)
class SplashAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

            val handler = Handler()
            handler.postDelayed({
//                splashAction(JumpType.JUMP_LINK, 1) { _, _ ->
//
//                }
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, 1500)
    }
}