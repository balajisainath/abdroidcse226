package com.example.cse226_4_1

import android.content.Context
import android.graphics.ColorSpace
import android.net.wifi.aware.AwareResources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.RemoteViews
import android.widget.TextView

class Myadapter(var mCtx:Context, var resources: Int, var items: List<model>):ArrayAdapter<model>(mCtx,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       val layoutInflater:LayoutInflater= LayoutInflater.from(mCtx)
        val view:View=layoutInflater.inflate(resources,null)
        val imageView:ImageView=view.findViewById(R.id.image)
        val titleTextView:TextView=view.findViewById(R.id.textview1)
        val descriptiveView:TextView=view.findViewById(R.id.textview2)

        val mitem:model=items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mitem.img))
        titleTextView.text=mitem.title
        descriptiveView.text=mitem.description

    return view
    }
}