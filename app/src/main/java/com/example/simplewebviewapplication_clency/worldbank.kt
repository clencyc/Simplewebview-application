package com.example.simplewebviewapplication_clency

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class worldbank : AppCompatActivity() {

    private lateinit var WORLDbank:WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worldbank)

        WORLDbank = findViewById(R.id.webWorld)

        val webSetting = WORLDbank.settings
        webSetting.javaScriptEnabled = true
        WORLDbank.loadUrl("https://www.worldbank.org/en/home")

    }
}