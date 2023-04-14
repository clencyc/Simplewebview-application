package com.example.simplewebviewapplication_clency

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class equity_activity : AppCompatActivity() {

    private lateinit var webEQUITY:WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equity)

        webEQUITY = findViewById(R.id.webequity)

        val webSetting = webEQUITY.settings
        webSetting.javaScriptEnabled = true
        webEQUITY.loadUrl("https://equitygroupholdings.com/ke/")


    }
}