package com.creativity.dev.formsimple

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TimePicker
import com.creativity.dev.formsimple.model.ColectionCalendar
import com.creativity.dev.formsimple.model.ListObject
import com.creativity.dev.formsimple.utils.GeneralHelper
import com.creativity.dev.formsimple.utils.TimerHelper
import kotlinx.android.synthetic.main.activity_calendar.*
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

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        getBundleData()
        setRangeDate()
        activityCreateToolbar()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.save_search, menu)
        return true
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        val hour = timerHelper.getTrasformHour(simpleTimePicker2.hour,simpleTimePicker2.minute,false)

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
    @SuppressLint("SetTextI18n")
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
                    simpleTimePicker2.minute =  parts_2.get(0).toInt()

                    if(parts_2.get(1).equals("PM"))
                        simpleTimePicker2.hour = timerHelper.transformMinute12to24Hours(parts.get(0).toInt())
                    else
                        simpleTimePicker2.hour = parts.get(0).toInt()

                    simpleTimePicker2.visibility = View.VISIBLE
            }

            if(objCollectionCalendar.background > 0)
                cl_content.setBackgroundResource(objCollectionCalendar.background)
        }
    }

    private fun setRangeDate(){

        //cv_date.maxDate =  GeneralHelper.toCalendar(listDate.last()).timeInMillis


        if(getDateString.length > 0 && isCalendar) {
            val selectedDate: Date = GeneralHelper.parseDate(getDateString,formatDate)
            setTextCalendar(selectedDate)
        }

        simpleTimePicker2.setOnTimeChangedListener(object : TimePicker.OnTimeChangedListener {
            override fun onTimeChanged(p0: TimePicker?, p1: Int, p2: Int) {
                val AM_PM: String
                var minute: String = p2.toString()

                if (p1 < 12) {
                    AM_PM = "AM"
                } else {
                    AM_PM = "PM"
                }

                var m = minute.length
                if(m == 1)
                    minute = "0" + minute

                tv_date_1.setText(p1.toString().toString() + " : " + minute + " " + AM_PM)
            }

        })
    }


    @SuppressLint("SimpleDateFormat")
    private fun setTextCalendar(date: Date){
        val ss = SimpleDateFormat("MMMM dd yyyy")
        val currentdate = ss.format(date)
        val letter: Char = currentdate[0].toUpperCase()
        val remplace = StringBuilder(currentdate)

        remplace.set(0,letter)
        tv_date_1.text = remplace
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

        val mToolbar = toolbar_2

            mToolbar.setTitle(title)
            setSupportActionBar(mToolbar)
            mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp)
            mToolbar.inflateMenu(R.menu.save_search)
            mToolbar.setTitleTextColor(colorTitleToolbar)
            mToolbar.setBackgroundColor(colorBackgroundToolbar)
            mToolbar.setNavigationOnClickListener(View.OnClickListener { finish() })
    }

}
