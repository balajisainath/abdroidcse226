package com.example.cse226_4_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import com.google.android.material.dialog.InsetDialogOnTouchListener

class camera : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        val camerabtn=findViewById<Button>(R.id.btncamera)

        camerabtn.setOnClickListener{
            val intent_camera= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent_camera)
        }


    }
}