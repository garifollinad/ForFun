package com.example.dinaragarifollina.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.Html
import android.text.TextWatcher
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_perevod_mob.*

class PerevodQiwi : AppCompatActivity() {
    var mActionBarToolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perevod_qiwi)
        mActionBarToolbar = findViewById(R.id.toolbar_actionbar)
        setSupportActionBar(mActionBarToolbar)
        getSupportActionBar()!!.setTitle(Html.fromHtml("<font color='#FFFFFF'>" + "            Вывод баланса" + "</font>"))
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true);
        btn1.setOnClickListener {
            val intentMob = Intent(this, SMS::class.java)
            startActivity(intentMob);
        }
        tv22.addTextChangedListener(watcher)
        tv33.addTextChangedListener(watcher)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private val watcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            if (tv22.text.toString().length == 0 || tv33.getText().toString().length == 0 ) {
                btn1.isEnabled = false
            } else {
                btn1.isEnabled = true
            }
        }
        override fun afterTextChanged(s: Editable) {
        }
    }
}
