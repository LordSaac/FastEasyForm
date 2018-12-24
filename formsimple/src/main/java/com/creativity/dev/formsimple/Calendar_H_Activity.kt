package com.creativity.dev.formsimple

import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CalendarView
import com.creativity.dev.formsimple.model.ColectionCalendar
import com.creativity.dev.formsimple.model.ListObject
import com.creativity.dev.formsimple.utils.GeneralHelper
import com.creativity.dev.formsimple.utils.TimerHelper
import kotlinx.android.synthetic.main.activity_calendar__h_.*
import kotlinx.android.synthetic.main.content_toolbar.*
import java.text.SimpleDateFormat
import java.util.*

class Calendar_H_Activity : AppCompatActivity() {

    val context = this
    var getDateString: String = ""
    var getZoneId: String = ""
    var title: String = ""
    var formatDate: String = TimerHelper.longDate
    var listCalendarDay: List<Date> = ArrayList()
    lateinit var objCollectionCalendar: ColectionCalendar
    private var colorTitleToolbar: Int = Color.WHITE
    private var colorBackgroundToolbar: Int = Color.rgb(101,185,102)
    private val timerHelper = TimerHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar__h_)

        getBundleData()
        activityCreateToolbar()
        setRangeDate(listCalendarDay)

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.save_search, menu)

        return true
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.checked) {

            ListObject.eventList.evenSetSimpleString(tv_date_1.text.toString())
            finish()

            return true
        }

        return super.onOptionsItemSelected(item)
    }

    // title: getPutExtra
    // description: recoge los datos enviados desde la actividad que hace llamada.
    // Programmer: jGutierrez.

    private fun getBundleData() {

        val extras = intent.getBundleExtra(GeneralHelper.keyBundle())

        if (extras != null) {

            val array = extras.getSerializable(LIST_IGB_CA) as ArrayList<ColectionCalendar>

            objCollectionCalendar = array.get(0)

            title = objCollectionCalendar.title
            colorBackgroundToolbar = objCollectionCalendar.colorToolbar
            colorTitleToolbar = objCollectionCalendar.colorTitleToolbar
            listCalendarDay = objCollectionCalendar.listDate
            getDateString = objCollectionCalendar.text

            if(getDateString.length > 0){
                val selectedDate: Date = GeneralHelper.parseDate(getDateString,formatDate)
                cv_date.setDate(selectedDate.time)
            }

              if(objCollectionCalendar.background > 0)
                  content_d.setBackgroundResource(objCollectionCalendar.background)

        }
    }

    private fun setRangeDate(listDate:List<Date>){

        if(listDate.size > 1){

            cv_date.maxDate =  GeneralHelper.toCalendar(listDate.last()).timeInMillis
            cv_date.minDate = GeneralHelper.toCalendar(listDate.first()).timeInMillis

            if(getDateString.length > 0) {
                val selectedDate: Date = GeneralHelper.parseDate(getDateString,formatDate)
                cv_date.setDate(selectedDate.time)
                tv_date_1.text = timerHelper.setTextCalendar(selectedDate,formatDate)
            }
        }

        cv_date.setOnDateChangeListener(object : CalendarView.OnDateChangeListener {
            override fun onSelectedDayChange(view: CalendarView, year: Int, month: Int, dayOfMonth: Int) {
                val calendar = GregorianCalendar(year, month, dayOfMonth)
                val date = Date(view.date)
                tv_date_1.text = timerHelper.setTextCalendar(date,formatDate)
            }
        })
    }

    private fun setStringDate(date: Date){
        val ss = SimpleDateFormat("yyyy-MM-dd")
        val currentdate = ss.format(date)

    }

    // title: createToolbar
    // description: generar un menu personalizado con botones a la derecha para el toolbar.
    // programmer: jGutierrez
    private fun activityCreateToolbar() {

        val mToolbar = toolbar

        mToolbar.setTitle(title)
        setSupportActionBar(mToolbar)
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp)
        mToolbar.inflateMenu(R.menu.save_search)
        mToolbar.setTitleTextColor(colorTitleToolbar)
        mToolbar.setBackgroundColor(colorBackgroundToolbar)
        mToolbar.setNavigationOnClickListener(View.OnClickListener { finish() })
    }
}
