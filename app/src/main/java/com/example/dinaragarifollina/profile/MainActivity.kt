package com.example.dinaragarifollina.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.view.View
import android.widget.TextView
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

class MainActivity : AppCompatActivity() {
    private var tv5: TextView?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = findViewById<View>(R.id.navigation) as BottomNavigationView

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            var selectedFragment: androidx.fragment.app.Fragment? = null
            when (item.itemId) {
                R.id.action_item1 -> selectedFragment = Cashback.newInstance()
                R.id.action_item2 -> selectedFragment = Scan.newInstance()
                R.id.action_item3 -> selectedFragment = Scan.newInstance()
                R.id.action_item4 -> selectedFragment = Profile.newInstance()
            }
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_layout, selectedFragment!!)
            transaction.commit()
            true

        }
        val transaction = supportFragmentManager.beginTransaction()
        val profileFragent = Profile.newInstance()

        if(intent.getStringExtra(SMS.DIALOG_KEY) == Profile.STATUS_DIALOG){
            val bundle = Bundle()
            bundle.putString(SMS.DIALOG_KEY, Profile.STATUS_DIALOG)
            profileFragent.arguments = bundle
        }

        transaction.replace(R.id.frame_layout, profileFragent)
        transaction.commit()

        //Used to select an item programmatically
        //bottomNavigationView.getMenu().getItem(2).setChecked(true);
    }
}























