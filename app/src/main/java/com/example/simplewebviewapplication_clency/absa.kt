package com.example.simplewebviewapplication_clency

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class absa : AppCompatActivity() {
    private lateinit var ABSAweb:WebView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absa)

        ABSAweb = findViewById(R.id.webabsa)


        val web2 = ABSAweb.settings
        web2.javaScriptEnabled = true
        ABSAweb.loadUrl("https://www.absabank.co.ke/")


    }
}