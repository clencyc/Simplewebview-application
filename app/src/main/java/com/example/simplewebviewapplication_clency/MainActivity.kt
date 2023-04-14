package com.example.simplewebviewapplication_clency

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnKCB:Button
    private lateinit var btnEQUITY: Button
    private lateinit var btnABSA: Button
    private lateinit var btnCOP: Button
    private lateinit var btnWORLD: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnKCB = findViewById(R.id.BTNKCB)
        btnEQUITY = findViewById(R.id.btnequity)
        btnABSA = findViewById(R.id.btnabsa)
        btnCOP = findViewById(R.id.btncop)
        btnWORLD = findViewById(R.id.btnworld)



        btnKCB.setOnClickListener {
            //code to navigate to another activity

            //Toast.makeText(this, "Run this app", Toast.LENGTH_SHORT).show()
            val gotoweb = Intent(this, kcb_activity::class.java)
           startActivity(gotoweb)
        }

        btnEQUITY.setOnClickListener {
            val goweb = Intent(this, equity_activity::class.java)
            startActivity(goweb)
        }

        btnCOP.setOnClickListener {
            val webgo = Intent(this, coopbank::class.java)
            startActivity(webgo)
        }

        btnABSA.setOnClickListener {
            val webabsa = Intent(this, absa::class.java)
            startActivity(webabsa)
        }

        btnWORLD.setOnClickListener {
            val webworld = Intent(this, worldbank::class.java)
            startActivity(webworld)
        }



    }
}