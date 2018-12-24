package com.creativity.dev.formsimple.utils

import android.annotation.SuppressLint
import kotlinx.android.synthetic.main.activity_calendar.*
import java.text.SimpleDateFormat
import java.util.*


class TimerHelper{

    private var strRespons: String = ""
    private var srtFormat: String = ""


    companion object {
        var longDate: String = "MMMM dd yyyy"
    }
    @SuppressLint("SimpleDateFormat")
    fun getFormateHour(): String{

        val date = Date()
        val ee = SimpleDateFormat("HH:mm:ss")
        val formatDate: String = ee.format(date)

        return formatDate
    }

    fun transformMinute24to12Hours(hour: Int): Int{
        val result = hour - 12

        if(result == 0)
                return 12
        else
            return result
    }

    fun transformMinute12to24Hours(hour: Int): Int{
        val result = hour + 12

        if(result == 24)
            return 12
        else
            return result
    }

    @SuppressLint("SimpleDateFormat")
    fun setTextCalendar(date: Date, format: String): String{
        //MMMM dd yyyy
        val ss = SimpleDateFormat(format)
        val currentdate = ss.format(date)
        val letter: Char = currentdate[0].toUpperCase()
        val remplace = StringBuilder(currentdate)

        remplace.set(0,letter)

        return remplace.toString()
    }

    fun getTrasformHour(hour: Int, minute: Int,isMilitary:Boolean): String{

        var AM_PM: String = ""

        var h: String = hour.toString()
        var min: String = minute.toString()

        if (hour < 12 && !isMilitary)
            AM_PM = "AM"
        else if(!isMilitary)
            AM_PM = "PM"


        if(!isMilitary && hour > 12)
            h = transformMinute24to12Hours(hour).toString()

        if(min.length == 1)
            min = "0" + min

        if(h.length == 1)
            h = "0" + h

        return  h + ":" + min + " " + AM_PM
    }
}