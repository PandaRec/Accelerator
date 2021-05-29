package com.example.accelerator.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
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
        //val textView = itemView.findViewById<TextView>(R.id.dayOfMonth)
        //val view = itemView.findViewById<View>(R.id.mainMonthViewItem)
        val factor  = itemView.context.resources.displayMetrics.density
        //val textView = itemView.findViewById<TextView>(R.id.dayMonthTitle)
//        val id1 = itemView.findViewById<ConstraintLayout>(R.id.id1)
//        val id2 = itemView.findViewById<ConstraintLayout>(R.id.id2)
//        val id3 = itemView.findViewById<ConstraintLayout>(R.id.id3)
//        val id4 = itemView.findViewById<ConstraintLayout>(R.id.id4)


        fun insertToUI(item:String){
            Log.d("MYTAG","insertUi")
            //textView.text = item
//            val textViewTitle = id1.findViewById<TextView>(R.id.dayMonthTitle)
//            val textViewSubTitle = id1.findViewById<TextView>(R.id.dayMonthSubTitle)



//            textViewTitle.text = "title $item"
//            textViewSubTitle.text = "subTitle $item"


            // textView.text = item
            //Log.d("TAG",(view.layoutParams.width / factor).toString() )
            //float factor = holder.itemView.getContext().getResources().getDisplayMetrics().density;
            //params.width = (int)(item.getWidth() * factor);
        }
    }
}