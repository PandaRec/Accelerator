package com.example.accelerator.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import com.example.accelerator.R
import com.example.accelerator.model.Day
import com.example.accelerator.model.Month

class ViewPagerAdapter(private val list: List<Month>, private val theContext: Context) :
    PagerAdapter() {
    override fun getCount() = list.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view === `object`


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val month = list[position]
        val itemView =
            LayoutInflater.from(theContext).inflate(R.layout.month_item, container, false)
        val mondayTitle1 = itemView.findViewById<TextView>(R.id.titleMonday1)
        val tuesdayTitle1 = itemView.findViewById<TextView>(R.id.titleTuesday1)
        val wednesdayTitle1 = itemView.findViewById<TextView>(R.id.titleWednesday1)
        val thursdayTitle1 = itemView.findViewById<TextView>(R.id.titleThursday1)
        val fridayTitle1 = itemView.findViewById<TextView>(R.id.titleFriday1)
        val saturdayTitle1 = itemView.findViewById<TextView>(R.id.titleSaturday1)
        mondayTitle1.text = month.week[0].day[0].title
        tuesdayTitle1.text = month.week[0].day[1].title
        wednesdayTitle1.text = month.week[0].day[2].title
        thursdayTitle1.text = month.week[0].day[3].title
        fridayTitle1.text = month.week[0].day[4].title
        saturdayTitle1.text = month.week[0].day[5].title


        container.addView(itemView)
        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}