package com.application.sportsbingoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //actionbar
    private lateinit var myModelList: ArrayList<MyModel>
    private lateinit var myAdapter: MyAdapter

    private var btn1 : Button? = null
    private var btn2 : Button? = null
    private var btn3 : Button? = null
    private var exit = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init actionbar
        loadCards()
        //add page change listener
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                //change title of actionbar
                var title = myModelList[position].title
            }
            override fun onPageSelected(position: Int) {
            }
            override fun onPageScrollStateChanged(state: Int) {
            }
        })
        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener{
            val intent = Intent(this, TipsPage::class.java)
            startActivity(intent)}
        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener{
            val intent = Intent(this, ProfitPage::class.java)
            startActivity(intent)}
        btn3 = findViewById(R.id.btn3)
        btn3?.setOnClickListener{
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)}
    }
    private fun loadCards() {
        //init list
        myModelList = ArrayList()

        //add items/data to list
        myModelList.add(MyModel(
            "What Are Your Odds of Winning at Online Bingo?",
            R.string.title1_con,
            R.drawable.bin1))
        myModelList.add(MyModel(
            "WHAT ARE YOUR CHANCES OF WINNING AT ONLINE BINGO?",
            R.string.title2_con,
            R.drawable.bin2))
        myModelList.add(MyModel(
            "WHERE CAN YOU WIN MONEY AT BINGO?",
            R.string.title3_con,
            R.drawable.bin3))
        myModelList.add(MyModel(
            "WHERE CAN I MAKE MONEY FROM ONLINE BINGO?",
            R.string.title4_con,
            R.drawable.bin4))
        myModelList.add(MyModel(
            "IS BINGO HEALTHY FOR THE BRAIN?",
            R.string.title5_con,
            R.drawable.bin5))
        myModelList.add(MyModel(
            "How to Win Money in Bingo Halls",
            R.string.title6_con,
            R.drawable.bin6))
        myModelList.add(MyModel(
            "Is Bingo a Chance Game?",
            R.string.title7_con,
            R.drawable.bin7))
        myModelList.add(MyModel(
            "WHY IS BINGO A LUCKY GAME?",
            R.string.title8_con,
            R.drawable.bin8))

        //setup adapter
        myAdapter = MyAdapter(this, myModelList)

        //set adapter to viewpager
        viewPager.adapter = myAdapter

        // set default padding
        viewPager.setPadding(100,0,100,0)
    }
    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        } else {
            finish()
        }
    }
}

