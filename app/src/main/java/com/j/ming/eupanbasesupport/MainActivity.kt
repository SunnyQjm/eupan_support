package com.j.ming.eupanbasesupport

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        btnEasyRefreshTest.setOnClickListener {
            startActivity(Intent(this, EasyRefreshTest::class.java))
        }
    }
}
