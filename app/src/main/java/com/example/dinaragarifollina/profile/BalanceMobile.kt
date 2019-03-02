package com.example.dinaragarifollina.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class BalanceMobile : AppCompatActivity() {
    private var tvMob: TextView?=null;
    private var tvQiwi: TextView?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balance_mobile)
        tvMob = findViewById<View>(R.id.tvMob) as TextView
        tvMob!!.setOnClickListener {
            val intentMob = Intent(this, PerevodMob::class.java)
            startActivity(intentMob)

        }
    }
}
