package com.creativity.dev.formsimple.adapter.forms.builders

import android.graphics.Typeface
import android.view.Gravity
import androidx.compose.ui.graphics.Color
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter
import com.creativity.dev.formsimple.model.ListDynamic


class TextViewB {

    companion object{

        fun build(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int) {

            val generalList = list[position]

            holder.errorMessage.visibility = generalList.setVisibility.errorMessages

        }

        fun buildDescriptions(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int) {

            val generalList = list[position]

            val list = generalList.setList.options.filter { o -> o.check }

            holder.description.text = if(list.isNotEmpty()) list.first().text else generalList.setText.text

            holder.descriptionBottom.text = generalList.setText.descriptionBottom

            holder.description.textSize = generalList.setSize.description

            holder.descriptionBottom.textSize = generalList.setSize.descriptionBottom

            holder.description.textAlignment = generalList.setAlignment.description

            holder.description.setTextColor(generalList.setColor.description)

            holder.descriptionBottom.setTextColor(generalList.setColor.descriptionBottom)

            holder.description.visibility = generalList.setVisibility.description

            holder.descriptionBottom.visibility = generalList.setVisibility.descriptionBottom

          //   holder.description.visibility =  if(!generalList.setting.rowSingleCheck.activeIconSuccess) View.VISIBLE else View.GONE

        }

        fun buildTitle(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int) {

            val generalList = list[position]

            holder.title.text = generalList.setText.title

            holder.title.textSize = generalList.setSize.title

            holder.title.setTextColor(generalList.setColor.title)

            holder.title.visibility = generalList.setVisibility.title

            holder.title.textAlignment = generalList.setAlignment.text

            holder.title.visibility = generalList.setVisibility.title

            //holder.title.setBackgroundResource(R.color.colorBlack)

        }

        fun buildLetters(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int) {

            val generalList = list[position]

            holder.letter.setBackgroundResource(R.drawable.circular_view)

            holder.letter.textSize = generalList.setSize.letter

            holder.letter.setTextColor(generalList.setColor.letter)
        }

        fun buildIcon(holder: DynamicListAdapter.DynamicListHolder, list: List<ListDynamic>, position: Int) {

            val generalList = list[position]

            holder.icon.setTextColor(generalList.setColor.icon)

            holder.icon.isEnabled = generalList.isAvailable

            holder.icon.textSize = generalList.setSize.icon

            holder.icon.setTypeface(holder.icon.typeface, Typeface.NORMAL)

            holder.icon.visibility =   generalList.setVisibility.icon

            holder.tvBubble.text = generalList.setText.bubble

            holder.tvBubble.textSize = generalList.setSize.bubble

            // if(generalList.setText.bubble.isEmpty())

            holder.contentBobble.visibility = generalList.setVisibility.bubble

        }

    }
}