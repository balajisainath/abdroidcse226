package com.example.cse226_4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class customgridviewmain : AppCompatActivity() {
    lateinit var gridView: GridView
   private var playerimages= intArrayOf(R.drawable.fbimg,R.drawable.microsoftimg,R.drawable.twitterimg,R.drawable.fbimg,R.drawable.microsoftimg,R.drawable.fbimg,R.drawable.microsoftimg,R.drawable.twitterimg,R.drawable.fbimg,R.drawable.microsoftimg)
    private var playerNames= arrayOf("facebook","instagram","twitter","microsoft","google","apple","amazon","netflix","onepiece","boruto")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customgridviewmain)
        title = "KotlinApp"
        gridView = findViewById(R.id.gridView)
        val mainAdapter = MainAdapter(this@customgridviewmain, playerNames, playerimages)
        gridView.adapter = mainAdapter
        gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(applicationContext, "You CLicked " + playerNames[+position],
                Toast.LENGTH_SHORT).show()
        }

    }
}