package com.creativity.dev.formsimple.ui

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.databinding.ActivityCalendarBinding
import com.creativity.dev.formsimple.model.ColectionCalendar
import com.creativity.dev.formsimple.model.ListObject
import com.creativity.dev.formsimple.utils.GeneralHelper
import com.creativity.dev.formsimple.utils.TimerHelper
import java.text.SimpleDateFormat
import java.util.*

const val LIST_IGB_CA: String = "afbfb302-ef79-4683-ab4e-45774bd653c1"
class CalendarActivity : AppCompatActivity() {

    val context = this
    var getDateString: String = ""
    var isCalendar: Boolean = false
    var formatDate: String = TimerHelper.longDate
    private var colorTitleToolbar: Int = Color.WHITE
    private var colorBackgroundToolbar: Int = Color.rgb(101,185,102)
    lateinit var objCollectionCalendar: ColectionCalendar
    val timerHelper = TimerHelper()
    private lateinit var binding: ActivityCalendarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalendarBinding.inflate(layoutInflater)

        setContentView(binding.root)

        getBundleData()
        setRangeDate()
        activityCreateToolbar()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.save_search, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        val hour = timerHelper.getTrasformHour(binding.simpleTimePicker2.hour,binding.simpleTimePicker2.minute,false)

        if (id == R.id.checked) {

            ListObject.eventList.evenSetSimpleString(hour)

            finish()

            return true
        }

        return super.onOptionsItemSelected(item)
    }


    // title: getPutExtra
    // description: recoge los datos enviados desde la actividad que hace llamada.
    // Programmer: jGutierrez.
    @SuppressLint("SetTextI18n", "SuspiciousIndentation")
    @RequiresApi(Build.VERSION_CODES.M)
    private fun getBundleData() {
        val extras = intent.getBundleExtra(GeneralHelper.keyBundle())

        if (extras != null) {

            val array = extras.getSerializable(LIST_IGB_CA) as ArrayList<ColectionCalendar>

            objCollectionCalendar = array.get(0)

            title = objCollectionCalendar.title
            getDateString = objCollectionCalendar.text
            colorBackgroundToolbar = objCollectionCalendar.colorToolbar
            colorTitleToolbar = objCollectionCalendar.colorTitleToolbar

            val parts = getDateString.split(":")

                if(parts.size > 1) {
                    val parts_2 = parts.get(1).split(" ")
                    binding.simpleTimePicker2.minute =  parts_2.get(0).toInt()

                    if(parts_2.get(1).equals("PM"))
                        binding.simpleTimePicker2.hour = timerHelper.transformMinute12to24Hours(parts.get(0).toInt())
                    else
                        binding.simpleTimePicker2.hour = parts.get(0).toInt()

                    binding.simpleTimePicker2.visibility = View.VISIBLE
            }

            if(objCollectionCalendar.background > 0)
                binding.clContent.setBackgroundResource(objCollectionCalendar.background)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setRangeDate(){

        //cv_date.maxDate =  GeneralHelper.toCalendar(listDate.last()).timeInMillis


        if(getDateString.length > 0 && isCalendar) {
            val selectedDate: Date = GeneralHelper.parseDate(getDateString,formatDate)
            setTextCalendar(selectedDate)
        }

        binding.simpleTimePicker2.setOnTimeChangedListener { p0, p1, p2 ->

            val AM_PM: String

            var minute: String = p2.toString()

            if (p1 < 12) {
                AM_PM = "AM"
            } else {
                AM_PM = "PM"
            }

            val m = minute.length

            if (m == 1)
                minute = "0" + minute

            binding.tvDate1?.text = p1.toString().toString() + " : " + minute + " " + AM_PM
        }
    }


    @SuppressLint("SimpleDateFormat")
    private fun setTextCalendar(date: Date){
        val ss = SimpleDateFormat("MMMM dd yyyy")
        val currentdate = ss.format(date)
        val letter: Char = currentdate[0].toUpperCase()
        val remplace = StringBuilder(currentdate)

        remplace.set(0,letter)
        binding.tvDate1!!.text = remplace
    }

    @SuppressLint("SimpleDateFormat")
    private fun setStringDate(date: Date){
        val ss = SimpleDateFormat("yyyy-MM-dd")
        val currentdate = ss.format(date)

    }

    // title: createToolbar
    // description: generar un menu personalizado con botones a la derecha para el toolbar.
    // programmer: jGutierrez
    private fun activityCreateToolbar() {

        val mToolbar = binding.toolbar2

            mToolbar.title = title
            setSupportActionBar(mToolbar)
            mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp)
            mToolbar.inflateMenu(R.menu.save_search)
            mToolbar.setTitleTextColor(colorTitleToolbar)
            mToolbar.setBackgroundColor(colorBackgroundToolbar)
            mToolbar.setNavigationOnClickListener(View.OnClickListener { finish() })
    }

}
