package com.example.evaluation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val resposeList:List<ResultsDTO>):RecyclerView.Adapter<MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val viewGroup=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyHolder(viewGroup)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val responseDTO=resposeList[position]
        holder.setData(responseDTO)
    }

    override fun getItemCount(): Int {
        return resposeList.size
    }
}