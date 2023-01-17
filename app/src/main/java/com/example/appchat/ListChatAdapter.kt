package com.example.appchat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class ListChatAdapter (private val ListChat :ArrayList<DataChat>) :
    RecyclerView.Adapter<ListChatAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = ListChat[position]
        holder.imgAvtar.setImageResource(currentItem.imgAvtar)
        holder.username.text= currentItem.UserName
        holder.tvContentChat.text= currentItem.tv_ContentChat
        holder.tvtime.text= currentItem.tv_time
    }

    override fun getItemCount(): Int {
        return ListChat.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgAvtar : ShapeableImageView = itemView.findViewById(R.id.img_avatar)
        val username : TextView = itemView.findViewById(R.id.tvUserName)
        val tvContentChat : TextView = itemView.findViewById(R.id.tv_content_chat)
        val tvtime : TextView = itemView.findViewById(R.id.tv_time)
    }

}