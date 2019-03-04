package com.example.dinaragarifollina.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.appcompat.widget.Toolbar
import com.example.dinaragarifollina.profile.R.id.*
import kotlinx.android.synthetic.main.activity_sms.*


class SMS : AppCompatActivity() {
    var mActionBarToolbar: Toolbar? = null
    companion object {
        const val DIALOG_KEY = "DIALOG_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms)
        mActionBarToolbar = findViewById(R.id.toolbar_actionbar)
        setSupportActionBar(mActionBarToolbar)
        getSupportActionBar()!!.setTitle("Введите код из СМС")
        tv4.setOnClickListener {
            tv4.setText("jjj")
        }
        var phoneClass = StringsValues()
        tvMob.text = "На "+phoneClass.phone +" отправлен SMS с кодом подтверждения"

        btn1.setOnClickListener {
            val mainIntent = Intent(this, MainActivity::class.java)
            mainIntent.putExtra(DIALOG_KEY, Profile.STATUS_DIALOG)

            startActivity(mainIntent)
            finish()
        }
    }
}
