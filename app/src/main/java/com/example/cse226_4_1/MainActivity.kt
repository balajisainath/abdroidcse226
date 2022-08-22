package com.example.cse226_4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var list= mutableListOf<model>()
    lateinit var listView: ListView
    lateinit var ad:Myadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_listview_main)

        var listView=findViewById<ListView>(R.id.Listview)
        var list= mutableListOf<model>()

        list.add(model("Facebook","fb desc",R.drawable.fbimg))
        list.add(model("Facebook","fb desc",R.drawable.twitterimg))
        list.add(model("Facebook","fb desc",R.drawable.microsoftimg))
        list.add(model("Facebook","fb desc",R.drawable.fbimg))

        ad=Myadapter(this,R.layout.row,list)
        listView.adapter=ad

       listView.adapter=Myadapter(this,R.layout.row,list)
        listView.setOnItemClickListener{parent:AdapterView<*>,view:View,position:Int,id:Long
        ->
            if(position==0){
                Toast.makeText(this@MainActivity,"0",Toast.LENGTH_SHORT).show()
            }
            if(position==1){
                Toast.makeText(this@MainActivity,"1",Toast.LENGTH_SHORT).show()
            }
            if(position==2){
                Toast.makeText(this@MainActivity,"2",Toast.LENGTH_SHORT).show()
            }
            if(position==3){
                Toast.makeText(this@MainActivity,"3",Toast.LENGTH_SHORT).show()
            }
        }
      /* listView.onItemClickListener=
           AdapterView.OnItemClickListener { adapterView, view, i,l ->
               removeItem(i)
               false
           }

    }
    private fun removeItem(i:Int){
        Toast.makeText(this@MainActivity,"removed"+list.get(i),Toast.LENGTH_SHORT).show()
        list.removeAt(i);
        ad.notifyDataSetChanged()*/
    }
}