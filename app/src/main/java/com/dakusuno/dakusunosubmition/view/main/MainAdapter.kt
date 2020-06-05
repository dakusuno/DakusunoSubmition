package com.dakusuno.dakusunosubmition.view.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dakusuno.dakusunosubmition.R
import com.dakusuno.dakusunosubmition.model.Fruit

class MainAdapter(val listFruit: List<Fruit>) : RecyclerView.Adapter<MainAdapter.GridViewHolder >(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main,parent,false)
        return GridViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listFruit.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listFruit[position].img)
            .into(holder.imgMain)
        holder.nameMain.text = listFruit[position].name
        holder.itemView.setOnClickListener{
            val bundle = bundleOf("name" to listFruit[position].name,"img" to listFruit[position].img,"look" to listFruit[position].look, "store" to listFruit[position].store
            )
            it.findNavController().navigate(R.id.action_mainFragment_to_detailFragment,bundle)
        }
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgMain: ImageView = itemView.findViewById(R.id.item_main_img)
        var nameMain: TextView = itemView.findViewById(R.id.item_main_name)
    }


}
