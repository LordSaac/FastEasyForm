package com.creativity.dev.formsimple.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.RelativeLayout
import com.creativity.dev.formsimple.R
import java.text.SimpleDateFormat
import java.util.*

class GeneralHelper{

    companion object {

        fun countLines(str: String): Int {

                val lines = str.split("\r\n|\r|\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                return lines.size

        }

        fun createToolbar (context: Activity, nameActivity: String,colorTitle: Int,colorBackground: Int){
            val mToolbar = context.findViewById<View>(R.id.toolbar_2) as Toolbar
            mToolbar.setTitle(nameActivity)
            mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp)
            mToolbar.setTitleTextColor(colorTitle)
            mToolbar.setBackgroundColor(colorBackground)
            mToolbar.setNavigationOnClickListener { context.finish() }
        }

        fun createSimpleToolbar (context: Activity, nameActivity: String,colorTitle: Int,colorBackground: Int){
            val mToolbar = context.findViewById<View>(R.id.toolbar_2) as Toolbar
            mToolbar.setTitleTextColor(colorTitle)
            mToolbar.setBackgroundColor(colorBackground)
            mToolbar.setTitle(nameActivity)
        }

        fun keyBundle (): String{
            return "KeyBundle"
        }

        fun toCalendar(date: Date): Calendar {
            val cal = Calendar.getInstance()
            cal.time = date
            return cal
        }

        fun setContentEmpty(mActivity: Activity, isVisible: Boolean){

            val contentEmpty = mActivity.findViewById<ConstraintLayout>(R.id.content_empty)

            if(isVisible)
                contentEmpty.setVisibility(View.VISIBLE)
            else
                contentEmpty.setVisibility(View.GONE)

        }

        @SuppressLint("SimpleDateFormat")
        fun parseDate(srt: String,format: String): Date{
            //dd/MM/yyyy
            var date = Date()
            val completionDate1 = srt
            val df = SimpleDateFormat(format)

            try{
                date = df.parse(completionDate1)
                return date

            }catch (e: Exception){
                return date
            }

        }
    }
}