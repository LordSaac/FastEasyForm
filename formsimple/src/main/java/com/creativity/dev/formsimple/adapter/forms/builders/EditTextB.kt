package com.creativity.dev.formsimple.adapter.forms.builders

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.text.InputFilter
import android.view.inputmethod.EditorInfo
import androidx.core.content.ContextCompat
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter
import com.creativity.dev.formsimple.model.ListDynamic


object EditTextB {
    fun build(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int,mContext: Context) {
        val generalList = list[position]
        val next = (position + 1) % list.size
        val isNextEditable = (list[next].type == ListDynamic.TypeRow.ROW_EDIT)

        holder.editText.visibility = generalList.setVisibility.editText
        holder.styleEditText.visibility = generalList.setVisibility.styleEdit

        holder.editText.textSize = generalList.setSize.editText
        holder.editText.setText(generalList.setText.text)
        holder.editText.inputType = generalList.setEditText.inputTypeEditText
        holder.editText.isEnabled = generalList.setEditText.isEditable


        if (!isNextEditable) {
            holder.editText.imeOptions = EditorInfo.IME_ACTION_DONE
        }

        holder.editText.filters = arrayOf<InputFilter>(InputFilter.LengthFilter(generalList.setEditText.maxLength))

        holder.editText.setTextColor(generalList.setColor.edit)

        holder.styleEditText.hint = generalList.setText.title

        holder.styleEditText.setHintTextAppearance(generalList.setColor.editStyle)

        holder.styleEditText.defaultHintTextColor = ColorStateList.valueOf(ContextCompat.getColor(mContext,generalList.setColor.defaultHintTextColor))

      // holder.constraintMainLayout.background = ContextCompat.getDrawable(mContext, generalList.setColor.backgroundContentMain)

    }
}
