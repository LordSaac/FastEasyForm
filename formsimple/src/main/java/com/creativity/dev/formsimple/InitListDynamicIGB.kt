package com.example.dreamteach.listselectdinamic.IGBDynamicList

import android.annotation.SuppressLint
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.creativity.dev.formsimple.FireLinkList
import com.creativity.dev.formsimple.adapter.ListDynamicAdapter
import com.creativity.dev.formsimple.model.CollectionControlsList
import com.creativity.dev.formsimple.model.ListDynamic
import com.example.dreamteach.listselectdinamic.IGBDynamicList.InitListDynamicIGB.Companion.SimpleFormsIGB
import com.example.dreamteach.listselectdinamic.IGBDynamicList.InitListDynamicIGB.Companion.rv

class InitListDynamicIGB{

    companion object {

        @SuppressLint("StaticFieldLeak")
        lateinit var SimpleFormsIGB: ListDynamicAdapter
        lateinit var rv: RecyclerView
         var CCL: ArrayList<CollectionControlsList> = ArrayList()

        //<Java Compile>
        fun  initListDynamic(recyclerView: RecyclerView){

            val mAdapter: ListDynamicAdapter
            val list = FireLinkList.list
            val context = recyclerView.context

            mAdapter = ListDynamicAdapter(list, context)

            recyclerView.setHasFixedSize(true)
            recyclerView.setLayoutManager(LinearLayoutManager(context))
            recyclerView.setLayoutManager(GridLayoutManager(context, 1))

            recyclerView.setAdapter(mAdapter)

            FireLinkList.list = ArrayList()

        }
    }
}


fun RecyclerView.initListDynamic(){

    val mAdapter: ListDynamicAdapter
    val list = FireLinkList.list
    val context = this.context

    mAdapter = ListDynamicAdapter(list, context)

    this.setHasFixedSize(true)
    this.setLayoutManager(LinearLayoutManager(context))
    this.layoutManager = GridLayoutManager(context, 1)

    this.setAdapter(mAdapter)

    FireLinkList.list = ArrayList()

    SimpleFormsIGB = mAdapter
    rv = this

    list.forEachIndexed { index, it ->
        if (it.validation && !it.type.equals(ListDynamic.typeRow.ROW_TITLE)) {
            val obj = CollectionControlsList()

            obj.post = index
            InitListDynamicIGB.CCL.add(obj)
        }
    }


//    val model = ViewModelProviders.of(context).get(DynamicViewModel::class.java)
//
//    model.getData().observe(context, Observer<List<ListDynamic>>{
//    Aprovechalos estan en ofertas este mes.
//    })

}