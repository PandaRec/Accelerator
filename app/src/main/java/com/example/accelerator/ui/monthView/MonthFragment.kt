package com.example.accelerator.ui.monthView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.accelerator.adapters.MonthAdapter
import com.example.accelerator.adapters.ViewPagerAdapter
import com.example.accelerator.databinding.FragmentMonthBinding
import com.example.accelerator.model.Day
import com.example.accelerator.model.Month
import com.example.accelerator.model.Week

class MonthFragment : Fragment() {

    private lateinit var monthViewModel: MonthViewModel
    private var _binding: FragmentMonthBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        monthViewModel =
                ViewModelProvider(this).get(MonthViewModel::class.java)

        _binding = FragmentMonthBinding.inflate(inflater, container, false)

        val root: View = binding.root
        val viewPager = binding.viewPagerMonth
        val adapter  = ViewPagerAdapter(createList(),requireContext())
        viewPager.adapter = adapter
        //val recyclerView = binding.recyclerViewMonth
        //val monthAdapter = MonthAdapter()
        //monthAdapter.list = listOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","5",)
        //recyclerView.adapter = monthAdapter


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun createList():List<Month>{
        val list = mutableListOf<Month>()
        list.add(
            Month(
            listOf(Week(
                listOf(Day("1","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("2","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("3","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("4","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("5","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("6","lesson1","lesson2","lesson3","lesson4","lesson5")
                )
            ),Week(
                listOf(
                    Day("7","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("8","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("9","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("10","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("11","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("12","lesson1","lesson2","lesson3","lesson4","lesson5")
                )
            ),Week(
                listOf(
                    Day("13","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("14","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("15","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("16","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("17","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("18","lesson1","lesson2","lesson3","lesson4","lesson5")
                )
            ),Week(
                listOf(
                    Day("19","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("20","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("21","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("22","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("23","lesson1","lesson2","lesson3","lesson4","lesson5"),
                    Day("24","lesson1","lesson2","lesson3","lesson4","lesson5")
                )
            ),
                Week(
                    listOf(
                        Day("25","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("26","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("27","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("28","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("29","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("30","lesson1","lesson2","lesson3","lesson4","lesson5")
                    )
                ),
                Week(
                    listOf(
                        Day("31","lesson1","lesson2","lesson3","lesson4","lesson5")
                        )
                )
            )
        )


        )

        list.add(
            Month(
                listOf(Week(
                    listOf(Day("1","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("2","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("3","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("4","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("5","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("6","lesson1","lesson2","lesson3","lesson4","lesson5")
                    )
                ),Week(
                    listOf(
                        Day("7","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("8","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("9","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("10","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("11","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("12","lesson1","lesson2","lesson3","lesson4","lesson5")
                    )
                ),Week(
                    listOf(
                        Day("13","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("14","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("15","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("16","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("17","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("18","lesson1","lesson2","lesson3","lesson4","lesson5")
                    )
                ),Week(
                    listOf(
                        Day("19","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("20","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("21","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("22","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("23","lesson1","lesson2","lesson3","lesson4","lesson5"),
                        Day("24","lesson1","lesson2","lesson3","lesson4","lesson5")
                    )
                ),
                    Week(
                        listOf(
                            Day("25","lesson1","lesson2","lesson3","lesson4","lesson5"),
                            Day("26","lesson1","lesson2","lesson3","lesson4","lesson5"),
                            Day("27","lesson1","lesson2","lesson3","lesson4","lesson5"),
                            Day("28","lesson1","lesson2","lesson3","lesson4","lesson5"),
                            Day("29","lesson1","lesson2","lesson3","lesson4","lesson5"),
                            Day("30","lesson1","lesson2","lesson3","lesson4","lesson5")
                        )
                    ),
                    Week(
                        listOf(
                            Day("31","lesson1","lesson2","lesson3","lesson4","lesson5")
                        )
                    )
                )
            )


        )
        //list.add(Day("1","lesson1","lesson2","lesson3","lesson4","lesson5"),)
        //        list.add(Day("2","lesson1","lesson2","lesson3","lesson4","lesson5"),)
        //        list.add(Day("3","lesson1","lesson2","lesson3","lesson4","lesson5"),)
        //        list.add(Day("4","lesson1","lesson2","lesson3","lesson4","lesson5"),)
        //        list.add(Day("5","lesson1","lesson2","lesson3","lesson4","lesson5"),)
        //        list.add(Day("6","lesson1","lesson2","lesson3","lesson4","lesson5"),)

    return list
    }
}