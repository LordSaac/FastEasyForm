package com.creativity.dev.formsimple.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.adapter.SelectAdapter
import com.creativity.dev.formsimple.interfaces.EventList
import com.creativity.dev.formsimple.model.ListDynamic
import com.creativity.dev.formsimple.model.ListObject
import com.creativity.dev.formsimple.utils.GeneralHelper
import com.creativity.dev.formsimple.viewmodels.DynamicViewModel
import kotlinx.android.synthetic.main.activity_calendar__h_.*
import kotlinx.android.synthetic.main.activity_select.*
import kotlinx.android.synthetic.main.empty_view.*
import java.util.ArrayList


const val LIST_IGB: String = "d467baa9-f1e3-4e43-862f-8c44c10fac4b"
const val INTERNAL_KEY: String = "48537394-a346-4a0f-b915-13c1009f427a"

class SelectActivity : AppCompatActivity(), EventList {

    private var title: String = "Text"
    private var emptyMessages: String = ""

    private var isSingleCheck: Boolean = false

    private lateinit  var listObject : ListObject

    private var mContext = this
    private var mAdapter: SelectAdapter? = null

    private var colorTitleToolbar: Int = Color.WHITE
    private var colorBackgroundToolbar: Int = Color.rgb(101,185,102)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        getPutExtraIntent()
        activityCreateToolbar()
        view()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.save_search, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.checked && !listObject.list.isEmpty()) {

            ListObject.eventList.eventSetList(mAdapter!!.getListReady())
            finish()

            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun eventSetList(inputList: List<Any>) {
        ListObject.eventList.eventSetList(mAdapter!!.getListReady())
        finish()
    }

    private fun getPutExtraIntent() {

        val extras = intent.getBundleExtra(INTERNAL_KEY)
        var arrayListObj: ArrayList<ListObject>  = ArrayList()

        if (extras != null) {

            arrayListObj = extras.getSerializable(LIST_IGB) as ArrayList<ListObject>
            listObject = arrayListObj.get(0)

            title = listObject.title
            isSingleCheck = listObject.isSingle
            colorBackgroundToolbar = listObject.colorToolbar
            colorTitleToolbar = listObject.colorTitleToolbar
            emptyMessages = this.getString(R.string.Empty_messages)

            if(listObject.backgroundContent > 0)
                content_list.setBackgroundResource(listObject.backgroundContent)
        }
    }

    private fun view(){

        if(!listObject.list.isEmpty()){
            mAdapter = SelectAdapter(listObject.list, mContext.assets, mContext,isSingleCheck)

            rv_selected.setHasFixedSize(true)
            rv_selected.setLayoutManager(LinearLayoutManager(mContext))
            rv_selected.setLayoutManager(GridLayoutManager(mContext, 1))

            rv_selected.setAdapter(mAdapter)

        }else {

            GeneralHelper.setContentEmpty(this, true)
            rv_selected.setVisibility(View.GONE)

            if(listObject.emptyMessage.isNotEmpty())
                tv_empty.setText(listObject.emptyMessage)
            if(listObject.imageEmpty > 0)
                img_empty.setImageResource(listObject.imageEmpty)
        }


    }

    override fun evenSetSimpleString(str: String) {

    }

    // title: createToolbar
    // description: generar un menu personalizado con botones a la derecha para el toolbar.
    // programmer: jGutierrez
    private fun activityCreateToolbar() {

        val mToolbar = toolbar_2

        if(!isSingleCheck){

            mToolbar.setTitle(title)
            setSupportActionBar(mToolbar)
            mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp)
            mToolbar.inflateMenu(R.menu.save_search)
            mToolbar.setTitleTextColor(colorTitleToolbar)
            mToolbar.setBackgroundColor(colorBackgroundToolbar)
            mToolbar.setNavigationOnClickListener(View.OnClickListener { finish() })

        }else{
            GeneralHelper.createToolbar(this,title,colorTitleToolbar,colorBackgroundToolbar)
        }


    }


}
