package com.creativity.dev.formsimple.adapter.forms.builders

import android.content.Context
import android.content.res.ColorStateList
import androidx.core.content.ContextCompat
import com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter
import com.creativity.dev.formsimple.model.ListDynamic

object SwitchB {

    fun build(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>,mContext: Context, position: Int) {

        val generalList = list[position]

        holder.swtichActive.visibility = generalList.setVisibility.switch

        holder.swtichActive.isChecked = generalList.setSwitch.active

        holder.swtichActive.thumbTintList = ColorStateList.valueOf(generalList.setSwitch.color.thumbTintList)

       holder.swtichActive.trackTintList = ColorStateList.valueOf(generalList.setSwitch.color.trackTintList)

    }

}