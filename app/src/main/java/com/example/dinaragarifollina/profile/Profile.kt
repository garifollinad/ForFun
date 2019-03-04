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
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.widget.ActionBarContainer
import androidx.appcompat.widget.Toolbar
import com.example.dinaragarifollina.profile.R.drawable.ok
import com.example.dinaragarifollina.profile.R.id.*
import kotlinx.android.synthetic.main.activity_profile.*


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

        var tv5 = rootView.findViewById(R.id.tv5) as Button
        var tv6 = rootView.findViewById(R.id.tv6) as Button
        val myStr = arguments?.getString(SMS.DIALOG_KEY)
               if(myStr== STATUS_DIALOG){
                   var alert:AlertDialog.Builder=AlertDialog.Builder(getActivity())
                   val imageView = rootView.findViewById(R.id.alert) as? ImageView
                   imageView!!.setImageResource(R.drawable.ok)
                   if (imageView.getParent() != null)
                       (imageView.getParent() as ViewGroup).removeView(imageView) // <- fix
                   alert.setView(imageView)
                   alert.setPositiveButton("Ok", null)
                   alert.setTitle("      Перевод произведен успешно")
                   alert.setMessage("Деньги начислятся в течение 5 минут" +"\n")
                   alert.show()
               }

        tv5.setOnClickListener(){
            val intentMob = Intent(activity!!.baseContext, BalanceMobile::class.java)
            startActivity(intentMob) }

        tv6.setOnClickListener(){
            getActivity()!!.finish(); }
        return rootView
    }

    companion object {

        const val STATUS_DIALOG = "1"

        fun newInstance(): Profile{
            return Profile()
        }
    }
}

