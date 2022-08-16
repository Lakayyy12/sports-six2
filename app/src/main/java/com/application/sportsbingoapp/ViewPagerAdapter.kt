package com.application.sportsbingoapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_item_view_pager.view.*

class ViewPagerAdapter(
    val context: Context,
    val images: List<Int>,
    val detail: List<Int>,
    val interfaces: AdapterInterface

) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>(){
    inner class ViewPagerHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return ViewPagerHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val curImage = images[position]
        val content: Int = detail[position]

        holder.itemView.ivImage.setImageResource(curImage)
        holder.itemView.content.text = context.resources.getString(content)
        holder.itemView.back.setOnClickListener {
            interfaces.onBackPressed()
        }
    }

    override fun getItemCount(): Int {
        return images.size
    }

    interface AdapterInterface {
        fun onBackPressed()
    }
}