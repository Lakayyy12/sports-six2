package com.application.sportsbingoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profit_page.*

class ProfitPage : AppCompatActivity(), ViewPagerAdapter.AdapterInterface  {

    private val intefaces by lazy { this }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profit_page)

        val detail = listOf(R.string.tip5, R.string.tip6, R.string.tip7, R.string.tip8, R.string.tip9, R.string.tip10)
        val images = listOf(R.drawable.bin1, R.drawable.bin2, R.drawable.bin3, R.drawable.bin4, R.drawable.bin5, R.drawable.bin6,)
        val adapter = ViewPagerAdapter(this, images, detail, intefaces)
        viewPager2.adapter = adapter
    }
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}