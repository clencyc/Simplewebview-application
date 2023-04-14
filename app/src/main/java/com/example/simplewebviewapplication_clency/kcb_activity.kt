package com.example.simplewebviewapplication_clency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class kcb_activity : AppCompatActivity() {

    private lateinit var webKCB:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)

        webKCB = findViewById(R.id.webkcb)

        val webSettings = webKCB.settings
        webSettings.javaScriptEnabled = true
        webKCB.loadUrl("https://ke.kcbgroup.com/for-you?utm_source=search&utm_medium=cpc&utm_campaign=2023+KCB+KE+Always+On&utm_content=text_ads&gclid=CjwKCAjwrdmhBhBBEiwA4Hx5g3WA5H727EvO-Wd5aetPNVu09a-_5xe1WgZxwBXkWp1TY1S_OjM2zhoC2lEQAvD_BwE")
    }
}