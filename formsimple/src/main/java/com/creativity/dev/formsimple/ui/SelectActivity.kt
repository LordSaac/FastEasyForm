package com.creativity.dev.formsimple.ui

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.creativity.dev.formsimple.BuilderForms
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.adapter.options.SelectAdapter
import com.creativity.dev.formsimple.databinding.ActivitySelectBinding
import com.creativity.dev.formsimple.interfaces.EventList
import com.creativity.dev.formsimple.model.ListObject
import com.creativity.dev.formsimple.utils.GeneralHelper
import java.util.ArrayList


const val LIST_IGB: String = "d467baa9-f1e3-4e43-862f-8c44c10fac4b"
const val INTERNAL_KEY: String = "48537394-a346-4a0f-b915-13c1009f427a"

class SelectActivity : AppCompatActivity(), EventList {

    private var title: String = ""

    private var titleToolBar: String = ""

    private var emptyMessages: String = ""

    private var isSingleCheck: Boolean = false

    private lateinit  var listObject : ListObject

    private var mContext = this

    private var mAdapter: SelectAdapter? = null

    private var colorTitleToolbar: Int = Color.WHITE

    private var colorBackgroundToolbar: Int = Color.rgb(101,185,102)

    private lateinit var binding: ActivitySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySelectBinding.inflate(layoutInflater)

        setContentView(binding.root)

        getPutExtraIntent()

        activityCreateToolbar()

        view()

    }

    fun onClickFinish(view: View){

        if(listObject.list.isNotEmpty()){

            ListObject.eventList.eventSetList(mAdapter!!.getListReady())

            finish()

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.save_search, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.checked && listObject.list.isNotEmpty()) {

            ListObject.eventList.eventSetList(mAdapter!!.getListReady())
            finish()

            return true
        }

        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun eventSetList(inputList: List<Any>) {

        this.mAdapter!!.notifyDataSetChanged()

        ListObject.eventList.eventSetList(inputList)

        finish()

    }

    private fun getPutExtraIntent() {

        val extras = intent.getBundleExtra(INTERNAL_KEY)
        var arrayListObj: ArrayList<ListObject>  = ArrayList()

        if (extras != null) {

            arrayListObj = extras.getSerializable(LIST_IGB) as ArrayList<ListObject>
            listObject = arrayListObj.first()

            title = listObject.title
            titleToolBar = listObject.titleToolbar
            isSingleCheck = listObject.isSingle
            colorBackgroundToolbar = listObject.colorToolbar
            colorTitleToolbar = listObject.colorTitleToolbar
            emptyMessages = this.getString(R.string.Empty_messages)

            this.binding.titleSelect.text = title

            this.binding.titleSelect.setTextColor(listObject.titleColor)

            if(listObject.btnTitleColor != -1)
                  this.binding.btnFinishSelect.setTextColor(GeneralHelper.getColor(this,listObject.btnTitleColor))

            this.binding.btnFinishSelect.text = listObject.btnTitle

            this.binding.titleSelect.textSize = listObject.titleSize

            this.binding.btnFinishSelect.visibility =  if(!listObject.isSingle){ if(listObject.activeBtnFinish) View.VISIBLE else View.GONE }else View.GONE

            if(listObject.backgroundContent > 0)
                binding.contentList.setBackgroundResource(listObject.backgroundContent)

            if(listObject.darkMode){

                this.binding.btnFinishSelect.setBackgroundResource(R.drawable.background_dark_rounded)

                if(listObject.backgroundContent == 0)
                   binding.contentList.setBackgroundResource(R.color.colorBlack)

            }

        }
    }

    private fun view(){

        if(listObject.list.isNotEmpty()){

            mAdapter = SelectAdapter(listObject.list, mContext.assets, mContext,isSingleCheck,listObject.darkMode)

            binding.rvSelected.setHasFixedSize(true)
            binding.rvSelected.layoutManager = LinearLayoutManager(mContext)
            binding.rvSelected.layoutManager = GridLayoutManager(mContext, 1)

            binding.rvSelected.adapter = mAdapter

        }else {

            GeneralHelper.setContentEmpty(binding, true)

            binding.rvSelected.visibility = View.GONE

            if(listObject.emptyMessage.isNotEmpty())
                binding.include.tvEmpty.text = listObject.emptyMessage

            if(listObject.imageEmpty > 0)
               binding.include.imgEmpty.setImageResource(listObject.imageEmpty)

        }


    }

    override fun evenSetSimpleString(str: String) {

    }

    // Title: createToolbar
    // Description: generar un menu personalizado con botones a la derecha para el toolbar.
    // Programmer: JGutierrez
    private fun activityCreateToolbar() {

        val mToolbar = binding.toolbar2

        if(!isSingleCheck && this.listObject.activeBtnCheck){

            // mToolbar.title = title
            mToolbar.title = titleToolBar
            setSupportActionBar(mToolbar)

            mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp)
            mToolbar.setNavigationOnClickListener(View.OnClickListener { finish() })
            mToolbar.inflateMenu(R.menu.save_search)
            mToolbar.setTitleTextColor(colorTitleToolbar)
            mToolbar.setBackgroundColor(colorBackgroundToolbar)



        }else{

            GeneralHelper.createToolbar(this,mToolbar,titleToolBar,colorTitleToolbar,colorBackgroundToolbar)

        }


    }


}
