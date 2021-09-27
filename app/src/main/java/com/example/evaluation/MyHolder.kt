package com.example.evaluation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_layout.view.*

class MyHolder(private  val itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun setData(responseDTO: ResultsDTO)
    {
        itemView.apply {
            Glide.with(image).load(responseDTO.artworkUrl100)
            trackName.text=responseDTO.trackName
            artyist.text=responseDTO.artistName
            play.setOnClickListener {View.OnClickListener {

            }}
        }
    }
}