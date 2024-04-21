package com.creativity.dev.formsimple.adapter.forms.builders

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat
import com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter
import com.creativity.dev.formsimple.model.ListDynamic


object Container {

    fun build(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int, mContext: Context) {

            val obj = list[position]

            val layoutParams = holder.cardViewContent.layoutParams as ViewGroup.MarginLayoutParams

                 holder.cardViewContent.elevation = obj.setContainer.elevation

                 holder.contentBasic1.setPadding(obj.setContainer.padding.left,obj.setContainer.padding.top,obj.setContainer.padding.rigth,obj.setContainer.padding.bottom)

                 holder.cardViewContent.background = ContextCompat.getDrawable(mContext,obj.setContainer.background)

                 holder.cardViewContent.radius = obj.setContainer.radio

                layoutParams.setMargins(obj.setContainer.margin.left, obj.setContainer.margin.top, obj.setContainer.margin.rigth, obj.setContainer.margin.bottom)

                 holder.constraintMainLayout.background = ContextCompat.getDrawable(mContext,obj.setContainer.mainBackground)


                 holder.progressBarRight.visibility = obj.setVisibility.progressBarRight

                 holder.progressBarRight.indeterminateDrawable.setColorFilter(obj.setColor.progressView, PorterDuff.Mode.MULTIPLY)


    }

}