package com.creativity.dev.formsimple.adapter.forms.builders

import android.app.Activity
import android.view.WindowMetrics
import androidx.core.content.ContextCompat
import com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter
import com.creativity.dev.formsimple.model.ListDynamic


class LinearLayoutB {

    companion object{

        fun build(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int) {

            val generalList = list[position]

            val contentPaddingLeft = generalList.setPadding.content.left

            val contentPaddingRigth = generalList.setPadding.content.rigth

            val contentPaddingTop = generalList.setPadding.content.top

            val contentMarginTop: Int = generalList.setMargin.content.top

            val contentPaddingBottom = generalList.setPadding.content.bottom

            // val height = (holder.content.context as Activity).windowManager.defaultDisplay.height + 80

             // val sizeHeigthLny: Int = (height * generalList.setSize.row.heigth).toInt()

            holder.UnvContent.gravity = generalList.universalContentGravity

            holder.contentImg.visibility = generalList.setVisibility.check

            holder.contentImg.isEnabled = generalList.isEndableImageSelected

            holder.content.setPadding(contentPaddingLeft,contentPaddingTop,contentPaddingRigth,contentPaddingBottom)

            holder.includeBasic1.visibility = generalList.setVisibility.includeBasic1

            holder.includeBasic2.visibility = generalList.setVisibility.includeBasic2

            // holder.content.layoutParams.height = generalList.setSize.layout.hight

        }


        fun buildSeparator(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int) {

            val generalList = list[position]

            holder.seperatorContent.setBackgroundColor(generalList.setColor.seperator)

            holder.seperatorContent.visibility = generalList.setVisibility.separator

        }

    }
}