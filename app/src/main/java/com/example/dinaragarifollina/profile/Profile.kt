package com.example.dinaragarifollina.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.fragment.app.Fragment
import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import android.content.DialogInterface

class Profile : androidx.fragment.app.Fragment() {
    var myStr = 0
    val LOG_TAG = "myLogs"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.activity_profile, container, false)

        //INITIALIZE VIEWS
        var tv5 = rootView.findViewById(R.id.tv5) as TextView
        val myStr = arguments?.getString(SMS.DIALOG_KEY)
               if(myStr== STATUS_DIALOG){
                   var alert:AlertDialog.Builder=AlertDialog.Builder(getActivity())
                   alert.setMessage("Перевод произведен успешно" +"\n"+
                           "Деньги начислятся в течение 5 минут")
                   alert.setNeutralButton("OK",object : DialogInterface.OnClickListener{
                       override fun onClick(dialog: DialogInterface?, which: Int) {
                           Toast.makeText(getContext(), "Good", Toast.LENGTH_SHORT).show()
                       }
                   })
                   alert.show()
               }

        tv5!!.setOnClickListener{
            val intentMob = Intent(activity!!.baseContext, BalanceMobile::class.java)
            startActivity(intentMob) }

        return rootView
    }

    companion object {

        const val STATUS_DIALOG = "1"

        fun newInstance(): Profile{
            return Profile()
        }
    }
}

