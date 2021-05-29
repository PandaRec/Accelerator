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

        val mondayTitle2 = itemView.findViewById<TextView>(R.id.titleMonday2)
        val tuesdayTitle2 = itemView.findViewById<TextView>(R.id.titleTuesday2)
        val wednesdayTitle2 = itemView.findViewById<TextView>(R.id.titleWednesday2)
        val thursdayTitle2 = itemView.findViewById<TextView>(R.id.titleThursday2)
        val fridayTitle2 = itemView.findViewById<TextView>(R.id.titleFriday2)
        val saturdayTitle2 = itemView.findViewById<TextView>(R.id.titleSaturday2)

        val mondayTitle3 = itemView.findViewById<TextView>(R.id.titleMonday3)
        val tuesdayTitle3 = itemView.findViewById<TextView>(R.id.titleTuesday3)
        val wednesdayTitle3 = itemView.findViewById<TextView>(R.id.titleWednesday3)
        val thursdayTitle3 = itemView.findViewById<TextView>(R.id.titleThursday3)
        val fridayTitle3 = itemView.findViewById<TextView>(R.id.titleFriday3)
        val saturdayTitle3 = itemView.findViewById<TextView>(R.id.titleSaturday3)

        val mondayTitle4 = itemView.findViewById<TextView>(R.id.titleMonday4)
        val tuesdayTitle4 = itemView.findViewById<TextView>(R.id.titleTuesday4)
        val wednesdayTitle4 = itemView.findViewById<TextView>(R.id.titleWednesday4)
        val thursdayTitle4 = itemView.findViewById<TextView>(R.id.titleThursday4)
        val fridayTitle4 = itemView.findViewById<TextView>(R.id.titleFriday4)
        val saturdayTitle4 = itemView.findViewById<TextView>(R.id.titleSaturday4)

        val mondayTitle5 = itemView.findViewById<TextView>(R.id.titleMonday5)
        val tuesdayTitle5 = itemView.findViewById<TextView>(R.id.titleTuesday5)
        val wednesdayTitle5 = itemView.findViewById<TextView>(R.id.titleWednesday5)
        val thursdayTitle5 = itemView.findViewById<TextView>(R.id.titleThursday5)
        val fridayTitle5 = itemView.findViewById<TextView>(R.id.titleFriday5)
        val saturdayTitle5 = itemView.findViewById<TextView>(R.id.titleSaturday5)

        val mondayTitle6 = itemView.findViewById<TextView>(R.id.titleMonday6)
        val tuesdayTitle6 = itemView.findViewById<TextView>(R.id.titleTuesday6)


        mondayTitle1.text = month.week[0].day[0].title
        tuesdayTitle1.text = month.week[0].day[1].title
        wednesdayTitle1.text = month.week[0].day[2].title
        thursdayTitle1.text = month.week[0].day[3].title
        fridayTitle1.text = month.week[0].day[4].title
        saturdayTitle1.text = month.week[0].day[5].title

        mondayTitle2.text = month.week[1].day[0].title
        tuesdayTitle2.text = month.week[1].day[1].title
        wednesdayTitle2.text = month.week[1].day[2].title
        thursdayTitle2.text = month.week[1].day[3].title
        fridayTitle2.text = month.week[1].day[4].title
        saturdayTitle2.text = month.week[1].day[5].title

        mondayTitle3.text = month.week[2].day[0].title
        tuesdayTitle3.text = month.week[2].day[1].title
        wednesdayTitle3.text = month.week[2].day[2].title
        thursdayTitle3.text = month.week[2].day[3].title
        fridayTitle3.text = month.week[2].day[4].title
        saturdayTitle3.text = month.week[2].day[5].title

        mondayTitle4.text = month.week[3].day[0].title
        tuesdayTitle4.text = month.week[3].day[1].title
        wednesdayTitle4.text = month.week[3].day[2].title
        thursdayTitle4.text = month.week[3].day[3].title
        fridayTitle4.text = month.week[3].day[4].title
        saturdayTitle4.text = month.week[3].day[5].title

        mondayTitle5.text = month.week[4].day[0].title
        tuesdayTitle5.text = month.week[4].day[1].title
        wednesdayTitle5.text = month.week[4].day[2].title
        thursdayTitle5.text = month.week[4].day[3].title
        fridayTitle5.text = month.week[4].day[4].title
        saturdayTitle5.text = month.week[4].day[5].title

        mondayTitle6.text = month.week[5].day[0].title
        //tuesdayTitle6.text = month.week[5].day[1].title






        container.addView(itemView)
        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}