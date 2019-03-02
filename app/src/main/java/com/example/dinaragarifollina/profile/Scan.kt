package com.example.dinaragarifollina.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Scan : androidx.fragment.app.Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_scan, container, false)
    }

    companion object {
        fun newInstance(): Scan {
            return Scan()
        }
    }
}
