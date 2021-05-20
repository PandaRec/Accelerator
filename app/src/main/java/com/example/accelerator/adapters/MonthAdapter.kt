package com.example.accelerator.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.accelerator.R

class MonthAdapter: RecyclerView.Adapter<MonthAdapter.MonthViewHolder>() {
    var list = listOf<String>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.month_item,parent,false)
        return MonthViewHolder(view)
    }

    override fun onBindViewHolder(holder: MonthViewHolder, position: Int) {
        val currentItem = list[position]
        holder.insertToUI(currentItem)
    }

    override fun getItemCount() = list.size

    inner class MonthViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        val textView = itemView.findViewById<TextView>(R.id.testTextView)

        fun insertToUI(item:String){
            textView.text = item
        }
    }
}