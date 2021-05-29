package com.example.accelerator.model

data class Day (
    val title:String?=null,
    val lesson1:String?=null,
    val lesson2:String?=null,
    val lesson3:String?=null,
    val lesson4:String?=null,
    val lesson5:String?=null
)

data class Month(
    val week: List<Week>
)

data class Week(
    val day:List<Day>
)