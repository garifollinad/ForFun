package com.example.dinaragarifollina.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_balance_mobile.*

class BalanceMobile : AppCompatActivity() {
    var mActionBarToolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balance_mobile)
        mActionBarToolbar = findViewById(R.id.toolbar_actionbar)
        setSupportActionBar(mActionBarToolbar)
        getSupportActionBar()!!.setTitle(Html.fromHtml("<font color='#FFFFFF'>" + "Профиль" + "</font>"))
        tvMob.setOnClickListener {
            val intentMob = Intent(this, PerevodMob::class.java)
            startActivity(intentMob)
        }
    }
}
