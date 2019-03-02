package com.example.dinaragarifollina.profile

import android.os.Bundle

import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat.startActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Cashback : androidx.fragment.app.Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_cashback, container, false)
    }
    jii
    companion object {
        fun newInstance(): Cashback {
            return Cashback()
        }
    }
}












