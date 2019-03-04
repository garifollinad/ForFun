package com.example.dinaragarifollina.profile

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat.startActivity
import android.graphics.BitmapFactory
import kotlinx.android.synthetic.main.activity_scan.*
import java.io.ByteArrayOutputStream


class Scan : androidx.fragment.app.Fragment() {
    private val CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 1888
    var btn1: Button?=null
    var btn2: Button?=null
    var imageView: ImageView?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.activity_scan,
                container, false)

        btn1 = rootView.findViewById(R.id.btn1)
        btn2 = rootView.findViewById(R.id.btn2)
        imageView = rootView.findViewById(R.id.imageView)

        btn2!!.setOnClickListener({
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE)
        })
        btn1!!.setOnClickListener(){
            val intentMob = Intent(activity!!.baseContext, InputCheck::class.java)
            startActivity(intentMob) }
        return rootView
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {

                val bmp = data!!.extras!!.get("data") as Bitmap
                val stream = ByteArrayOutputStream()

                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream)
                val byteArray = stream.toByteArray()

                // convert byte array to Bitmap

                val bitmap = BitmapFactory.decodeByteArray(byteArray, 0,
                        byteArray.size)

                imageView!!.setImageBitmap(bitmap)

            }
        }
    }

    companion object {
        fun newInstance(): Scan {
            return Scan()
        }
    }
}
