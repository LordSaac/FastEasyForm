package com.example.dreamteach.listselectdinamic.IGBDynamicList

import android.content.Context
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.BuilderForms
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.adapter.forms.EasyDynamicForm
import com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter
import com.creativity.dev.formsimple.compose.EasyFormWrapper
import com.creativity.dev.formsimple.model.CollectionControlsList
import com.creativity.dev.formsimple.model.ListDynamic

class EasyFastForm(context: Context) {

    private var darkModeOn: Boolean = false

    private var list:ArrayList<ListDynamic> = BuilderForms.list

    private val easyWrapper = EasyFormWrapper(context)

    private var context: Context = context

    private var recyclerView:RecyclerView = easyWrapper.rv()

    private val validationList: ArrayList<CollectionControlsList> = ArrayList()

    var tool: EasyDynamicForm = EasyDynamicForm(list,context,recyclerView,validationList)

    private var backgroundRounded: Int = R.drawable.background_light_rounded

    private var backgroundTop: Int = R.drawable.background_light_top

    private var backgroundBottom: Int = R.drawable.background_light_bottom

    private var backgroundNormal: Int = R.drawable.background_light_normal

    init {

        if(BuilderForms.darkModeOn){

            this.backgroundRounded = R.drawable.background_dark_rounded

            this.backgroundTop = R.drawable.background_dark_top

            this.backgroundBottom = R.drawable.background_dark_bottom

            this.backgroundNormal = R.drawable.background_dark_normal

        }

    }

    fun  start(recyclerView: RecyclerView){

        this.list.forEachIndexed { index, it ->

            if (it.setValidation.validationOn && it.type != ListDynamic.TypeRow.ROW_TITLE) {

                val obj = CollectionControlsList()

                obj.post = index

                this.validationList.add(obj)

            }

            this.list[index] = this.setBackgroundBuild(this.list,index)

        }

        this.tool = EasyDynamicForm(list,context,recyclerView,validationList)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = GridLayoutManager(context, 1)

        recyclerView.adapter = tool

        BuilderForms.list = ArrayList()

    }

    private fun setBackgroundBuild(list:List<ListDynamic>, position: Int): ListDynamic {

        val next = (position + 1) % list.size
        val before = (position - 1) % list.size
        val obj = list[position]

        if((obj.type == ListDynamic.TypeRow.ROW_TITLE) || (obj.type == ListDynamic.TypeRow.ROW_EMPTY)){

            obj.setContainer.background = R.color.transparent

        }else if(position > 0){

            val isBorderTopConteiner = ((list[before].type == ListDynamic.TypeRow.ROW_TITLE) || (list[before].type == ListDynamic.TypeRow.ROW_EMPTY))
            val isBorderBottomConteiner = ((list[next].type == ListDynamic.TypeRow.ROW_TITLE) || (list[next].type == ListDynamic.TypeRow.ROW_EMPTY))

            if(isBorderTopConteiner && isBorderBottomConteiner){

                obj.setContainer.background = this.backgroundRounded

                obj.setContainer.margin.bottom = 25

            }
            else if(isBorderTopConteiner){

                obj.setContainer.background =this.backgroundTop

            }
            else if(isBorderBottomConteiner){

                obj.setContainer.background = this.backgroundBottom

                obj.setContainer.margin.bottom = 25

            }
            else{

                obj.setContainer.background = this.backgroundNormal

                obj.setContainer.radio = 0f

            }


        }else{

            obj.setContainer.background = this.backgroundTop

        }

        return obj
    }
    fun getEasyWrapper(): EasyFormWrapper{

        return easyWrapper
    }

}

fun RecyclerView.start(): DynamicListAdapter {

    val mAdapter: DynamicListAdapter
    val list = BuilderForms.list
    val context = this.context
    val validationList: ArrayList<CollectionControlsList> = ArrayList()

    list.forEachIndexed { index, it ->

        if (it.setValidation.validationOn && it.type != ListDynamic.TypeRow.ROW_TITLE) {

            val obj = CollectionControlsList()

            obj.post = index

            validationList.add(obj)
        }
    }

    mAdapter = EasyDynamicForm(list, context,this,validationList)

    this.setHasFixedSize(true)
    this.layoutManager = LinearLayoutManager(context)
    this.layoutManager = GridLayoutManager(context, 1)

    this.adapter = mAdapter

    BuilderForms.list = ArrayList()

    return mAdapter

}