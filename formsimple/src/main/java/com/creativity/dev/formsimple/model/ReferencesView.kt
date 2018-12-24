package com.creativity.dev.formsimple.model

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.creativity.dev.formsimple.R

class ReferencesView {

    companion object {

        fun linearLayoutParams(context: Context): LinearLayout.LayoutParams {

            val inflater = LayoutInflater.from(context)
            val contentView = inflater.inflate(R.layout.row_check_list, null, false)
            val content: LinearLayout = contentView.findViewById(R.id.ly_unv_content)
            val lp: LinearLayout.LayoutParams = LinearLayout.LayoutParams(content.width, content.height)
            lp.setMargins(0, 15, 0, 0)
            return lp
        }

    }

}