package com.creativity.dev.formsimple.adapter.forms.builders

import android.view.View
import com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter
import com.creativity.dev.formsimple.model.ListDynamic

class CheckButtonB {

    companion object{

        fun build(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int) {

            val generalList = list[position]

            holder.check.isChecked = generalList.checked

            holder.check.visibility = View.GONE

        }

    }

}