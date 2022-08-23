package com.example.cse226_4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivityRecyclerview : AppCompatActivity() {
    lateinit var arrayList: ArrayList<Linearpojorecyclerview>
    lateinit var recyclerview: RecyclerView
    lateinit var adapterRecycler: AdapterRecycler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recyclerview)
        linearListData()
        recyclerview=findViewById(R.id.recyclerViewLinear)
        recyclerview.setHasFixedSize(true)
        val linearLayoutManager=LinearLayoutManager(this)
        linearLayoutManager.orientation=RecyclerView.VERTICAL
        recyclerview.layoutManager=linearLayoutManager
        adapterRecycler= AdapterRecycler(this,arrayList)
        recyclerview.adapter=adapterRecycler
    }
    private fun linearListData(){
        arrayList=ArrayList<Linearpojorecyclerview>()
        arrayList.add(Linearpojorecyclerview("Android 11","11"))
        arrayList.add(Linearpojorecyclerview("Android 10","10.8"))
        arrayList.add(Linearpojorecyclerview("pie","9.8"))
        arrayList.add(Linearpojorecyclerview("oreo","8.8"))
        arrayList.add(Linearpojorecyclerview("pie","7.8"))
        arrayList.add(Linearpojorecyclerview("marshmello","6.8"))
        arrayList.add(Linearpojorecyclerview("kitkat","5.8"))
        arrayList.add(Linearpojorecyclerview("jelly","4.8"))
        arrayList.add(Linearpojorecyclerview("ice cream sandwich","3.8"))
        arrayList.add(Linearpojorecyclerview("honeycomb","2.3"))
        arrayList.add(Linearpojorecyclerview("gingerbread","2.8"))
        arrayList.add(Linearpojorecyclerview("froyo","1.6"))



    }
}