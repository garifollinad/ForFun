package com.example.dinaragarifollina.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat.startActivity



class PerevodMob : AppCompatActivity() {
    private var btn1: Button?=null;
    private var tv22: EditText?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perevod_mob)
        btn1=findViewById<View>(R.id.btn1) as Button;
        btn1!!.setOnClickListener {
            val intentMob = Intent(this, SMS::class.java)
            startActivity(intentMob);
        }
    }
}
