package com.example.cse226_4_1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecycler(context: Context,arrayList: ArrayList<Linearpojorecyclerview>):RecyclerView.Adapter<AdapterRecycler.MyHolder>() {
var context:Context
 var arrayList:ArrayList<Linearpojorecyclerview>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view:View=LayoutInflater.from(context).inflate(R.layout.customrecyclelist,parent,false)
        return MyHolder(view)

    }

    override fun onBindViewHolder(holder: AdapterRecycler.MyHolder, position: Int) {
        holder.versionName.text=arrayList[position].versionName
        holder.version.text=arrayList[position].version
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
    class MyHolder(view: View):RecyclerView.ViewHolder(view){
        var versionName:TextView
        var version:TextView
    init {
        versionName=view.findViewById(R.id.version_name)
        version=view.findViewById(R.id.version)
    }
    }
    init {
        this.context=context
        this.arrayList=arrayList
    }
}