package com.example.simplewebviewapplication_clency

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class coopbank : AppCompatActivity() {

    private lateinit var WEBcoop:WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coopbank)


        WEBcoop = findViewById(R.id.webabsa)


        val web3 = WEBcoop.settings
        web3.javaScriptEnabled = true
        WEBcoop.loadUrl("https://www.co-opbank.co.ke/")

    }
}