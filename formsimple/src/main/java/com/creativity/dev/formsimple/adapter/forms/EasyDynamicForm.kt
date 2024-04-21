package com.creativity.dev.formsimple.adapter.forms

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.ext.scrollToPositionWithAnimation
import com.creativity.dev.formsimple.model.CollectionControlsList
import com.creativity.dev.formsimple.model.ListDynamic
import com.creativity.dev.formsimple.model.ResponseFormsIGB
import com.creativity.dev.formsimple.utils.EFFValidatorRegex
import com.jgb.lordsaac.igb.supportanimation.AnimationTextView


// You can create a subclass that provides the implementation.
class EasyDynamicForm(model: List<ListDynamic>, mContext: Context,recyclerView: RecyclerView,positionRow: ArrayList<CollectionControlsList>) : DynamicListAdapter(model,mContext,recyclerView,positionRow) {

    override fun init(
        listMenu: List<ListDynamic>,
        mContext: Context,
        recyclerView: RecyclerView,
        positionRow: ArrayList<CollectionControlsList>
    ) {
    }

    override fun getDataResponse(str: String?) {
        // This function is currently empty as it serves as a placeholder.
        // Depending on the context or requirements, data retrieval or processing logic
        // related to the received string parameter 'str' can be implemented here.
        // As of now, it does not contain any specific functionality.
    }
    override fun validateAll(): Boolean {

        var response = true

        var scrollMoved = false

        var notMovedAgain = false

        try {
            positionRow.forEach { position ->

                val row = this.list[position.post]
                val str = row.setText.text
                val desc = row.setText.descriptionBottom
                val type = row.type
                val isValidation = row.setValidation.validationOn
                val imgError = row.setImage.warning
                val viewHolder = recyclerView.findViewHolderForAdapterPosition(position.post)
                val strIsValidate = if (row.setValidation.rulePattern.isNotEmpty()) EFFValidatorRegex.isCorrect(row.setValidation.rulePattern,str) else str.isNotEmpty()
                val index = this.list.indexOf(row)

                if(isValidation){

                    when {

                        (type == ListDynamic.TypeRow.ROW_EDIT && (!strIsValidate || str == row.setText.errorMessages)) -> {

                            this.list[index].setVisibility.errorMessages = View.VISIBLE

                            handleErrorMessageEditText(viewHolder, imgError, mContext)

                            scrollMoved = true

                            response = false

                        }
                        ((type == ListDynamic.TypeRow.ROW_DATE_PICKER || type == ListDynamic.TypeRow.ROW_TIME_PICKER) && (desc.isEmpty() || desc == row.setText.errorMessages)) -> {

                            scrollMoved = true

                            handleErrorMessage(viewHolder, imgError, mContext)

                            response = false

                        }
                        ( (type == ListDynamic.TypeRow.ROW_MULTIPLE_CHECK_LIST || type == ListDynamic.TypeRow.ROW_SINGLE_CHECK_LIST))  && row.setList.options.none { it.check } -> {

                            this.list[position.post].setImage.selected = this.list[position.post].setImage.warning

                            scrollMoved = true

                            handleMultipleCheckError(viewHolder, imgError, mContext)

                            response = false

                        }
                        (type == ListDynamic.TypeRow.ROW_CHECK) && !row.checked-> {

                            scrollMoved = true

                            handleMultipleCheckError(viewHolder, imgError, mContext)

                            response = false
                        }
                        (type == ListDynamic.TypeRow.ROW_SWITCH) && !row.setSwitch.active-> {

                            scrollMoved = true

                            handleMultipleCheckError(viewHolder, imgError, mContext)

                            response = false
                        }
                        (type == ListDynamic.TypeRow.ROW_SINGLE_CHECK_LIST) && type == ListDynamic.TypeRow.ROW_MULTIPLE_CHECK_LIST && str.isEmpty() -> {

                            scrollMoved = true

                            handleMultipleCheckError(viewHolder, imgError, mContext)
                            response = false

                        }

                    }

                    if (scrollMoved && !notMovedAgain){

                        notMovedAgain = true

                        recyclerView.scrollToPositionWithAnimation(position.post)

                    }

                }

            }

            if (positionRow.isEmpty()) {

                response = false

            }

        } catch (ex: Exception) {

            response = false

        }

        return response
    }
    @SuppressLint("SuspiciousIndentation")
    override fun validateByTag(tag: String): Boolean {

        try {

        var scrollMove = false
        val row = this.list.firstOrNull { m -> m.tag == tag && m.setValidation.validationOn }
        val position = this.list.indexOf(row)

                if (row != null ) {

                    val str = row.setText.text
                    val desc = row.setText.descriptionBottom
                    val type = row.type
                    val imgError = row.setImage.warning
                    val viewHolder = recyclerView.findViewHolderForAdapterPosition(position)
                    val strIsValidate = if (row.setValidation.rulePattern.isNotEmpty()) EFFValidatorRegex.isCorrect(row.setValidation.rulePattern,str) else str.isEmpty()

                    when {
                        (type == ListDynamic.TypeRow.ROW_EDIT && (!strIsValidate || str == row.setText.errorMessages)) -> {

                            scrollMove = true

                            this.list[position].setVisibility.errorMessages = View.VISIBLE

                            handleErrorMessageEditText(viewHolder, imgError, mContext)

                        }
                        ((type == ListDynamic.TypeRow.ROW_DATE_PICKER || type == ListDynamic.TypeRow.ROW_TIME_PICKER) && (desc.isEmpty() || desc == row.setText.errorMessages)) -> {

                            scrollMove = true
                            handleErrorMessage(viewHolder, imgError, mContext)

                        }
                        ((type == ListDynamic.TypeRow.ROW_MULTIPLE_CHECK_LIST || type == ListDynamic.TypeRow.ROW_SINGLE_CHECK_LIST) && row.setList.options.none { it.check }) -> {

                            scrollMove = true

                            row.setImage.selected = imgError

                            list[position].setImage.selected = this.list[position].setImage.warning

                            handleErrorMessage(viewHolder, imgError, mContext)
                        }
                        (type == ListDynamic.TypeRow.ROW_CHECK)  && !row.checked-> {

                            handleMultipleCheckError(viewHolder, imgError, mContext)

                            scrollMove = true
                        }
                        (type == ListDynamic.TypeRow.ROW_SWITCH) && !row.setSwitch.active-> {

                            handleMultipleCheckError(viewHolder, imgError, mContext)

                            scrollMove = true
                        }
                        (type != ListDynamic.TypeRow.ROW_SINGLE_CHECK_LIST) && type != ListDynamic.TypeRow.ROW_MULTIPLE_CHECK_LIST && type != ListDynamic.TypeRow.ROW_CHECK  && str.isEmpty() -> {

                            scrollMove = true

                            row.setImage.selected = imgError

                            handleErrorMessage(viewHolder, imgError, mContext)
                        }

                    }

                    if (scrollMove){

                        recyclerView.scrollToPositionWithAnimation(position)

                        return false
                    }

                    return true

                }else{

                    return false

                }

        } catch (ex: Exception) {

            return false

        }

    }
    @SuppressLint("SuspiciousIndentation")
    override fun startProgressView(tag: String): Boolean {

        try {

            val row = this.list.firstOrNull { m -> m.tag == tag }

            val position = this.list.indexOf(row)

            if (row != null ) {

                val viewHolder = recyclerView.findViewHolderForAdapterPosition(position)

                this.list[position].setVisibility.progressBarRight = View.VISIBLE

                this.handleProgressViewBt1(viewHolder,View.VISIBLE)

                return true

            }else{

                return false

            }

        } catch (ex: Exception) {

            return false

        }

    }
    override fun finishProgressView(tag: String): Boolean {

        try {

            val row = this.list.firstOrNull { m -> m.tag == tag }
            val position = this.list.indexOf(row)

            if (row != null ) {

                val viewHolder = recyclerView.findViewHolderForAdapterPosition(position)

                this.list[position].setVisibility.progressBarRight = View.GONE

                this.handleProgressViewBt1(viewHolder,View.GONE)

                return true

            }else{

                return false

            }

        } catch (ex: Exception) {

            return false

        }

    }
    override fun getResultByTag(tag: String): ResponseFormsIGB {

        val obj: ResponseFormsIGB = ResponseFormsIGB()

        val listDynamic = this.list.firstOrNull { m -> m.tag == tag}

        if(listDynamic != null){

            obj.tag = listDynamic.tag

            obj.text = listDynamic.setText.text

            obj.position = this.list.indexOf(listDynamic)

            obj.checked = listDynamic.checked

            obj.options = listDynamic.setList.options

            obj.type = listDynamic.type

            obj.title = listDynamic.setText.title

            obj.desc = listDynamic.setText.descriptionBottom

            obj.swtichActive = listDynamic.setSwitch.active

            obj.iconArrow = listDynamic.setImage.selected

            if(obj.type == ListDynamic.TypeRow.ROW_SINGLE_CHECK_LIST || obj.type == ListDynamic.TypeRow.ROW_MULTIPLE_CHECK_LIST){

                if(obj.options.count { select -> select.check } > 0){

                    obj.checked = true

                }

            }

        }

        return obj

    }
    override fun getResultAll():ArrayList<ResponseFormsIGB> {

        val result = ArrayList<ResponseFormsIGB>()

        list.forEachIndexed { index, listDynamic ->

            val obj = ResponseFormsIGB()

            obj.tag = listDynamic.tag

            obj.text = listDynamic.setText.text

            obj.position = index

            obj.checked = listDynamic.checked

            obj.options = listDynamic.setList.options

            obj.type = listDynamic.type

            obj.iconArrow = listDynamic.setImage.selected

            obj.desc = listDynamic.setText.descriptionBottom

            obj.swtichActive = listDynamic.setSwitch.active

            obj.title = listDynamic.setText.title

            result.add(obj)

        }

        return result

    }
    override fun getResults(tag: String): List<ResponseFormsIGB>{

        val objList :ArrayList<ResponseFormsIGB> = ArrayList()

        list.forEachIndexed { index, listDynamic ->

            val obj: ResponseFormsIGB = ResponseFormsIGB()

            obj.tag = listDynamic.tag

            obj.text = listDynamic.setText.text

            obj.position = index

            obj.checked = listDynamic.checked

            obj.options = listDynamic.setList.options

            obj.type = listDynamic.type

            obj.desc = listDynamic.setText.descriptionBottom

            obj.swtichActive = listDynamic.setSwitch.active

            objList.add(obj)

        }

        return objList

    }
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun updateRow(tagOrTitle: String, objRespIGB: ResponseFormsIGB): Boolean{

        val view: View
        val tv: TextView
        val title: TextView
        val bubbleTv: TextView
        val desc: TextView
        val image: ImageView
        val switch: Switch
        val editText: EditText
        var success = false
        val listDynamic = this.list.firstOrNull { m -> m.tag == tagOrTitle}

       try {

           if(listDynamic != null){

                   val index = this.list.indexOf(listDynamic)

                   if (objRespIGB.options.size > 0)
                       list[index].setList.options =  objRespIGB.options

                   if (objRespIGB.text.isNotEmpty())
                       list[index].setText.text = objRespIGB.text

                   list[index].setText.title = objRespIGB.title

                   list[index].setText.bubble = objRespIGB.bubble

                   list[index].setText.text = objRespIGB.text

                   list[index].setText.descriptionBottom = objRespIGB.desc

                   list[index].setSwitch.active = objRespIGB.swtichActive

                   list[index].setVisibility.bubble = if(objRespIGB.bubble.isEmpty()) View.GONE else View.VISIBLE

                   view = recyclerView.findViewHolderForAdapterPosition(index)!!.itemView

                   tv = view.findViewById(R.id.tv_desc_insp)

                   bubbleTv = view.findViewById(R.id.tv_bubble)

                   desc = view.findViewById(R.id.tv_desc)

                   switch = view.findViewById(R.id.swtich_1)

                   title = view.findViewById(R.id.tv_title_insp)

                   image = view.findViewById(R.id.img_selected)

                   editText = view.findViewById(R.id.edt_text)

                   bubbleTv.text = list[index].setText.bubble

                   title.text = list[index].setText.title

                   desc.text =  list[index].setText.descriptionBottom

                   tv.text = list[index].setText.text

                   switch.isChecked =  list[index].setSwitch.active

                   bubbleTv.visibility = list[index].setVisibility.bubble

                   editText.setText(list[index].setText.text)

                   if(listDynamic.type == ListDynamic.TypeRow.ROW_CHECK){

                       val shake = AnimationUtils.loadAnimation(mContext,R.anim.zoom_in)

                       list[index].setImage.selected = eventChecked(objRespIGB.checked,index )

                       list[index].setImage.selected = objRespIGB.iconSelected

                       image.setBackgroundResource(list[index].setImage.selected)

                       image.startAnimation(shake)

                   }

                   // this.recyclerView.scrollToPositionWithAnimation(index)

                   // this.recyclerView.scrollToPosition(objRespIGB.position)

                   // this.recyclerView.adapter?.notifyItemChanged(objRespIGB.position)

                   success = true

           }else{

               success = false

           }


       } catch (ex: Exception){

           success = false

       }

       return success

    }
    override fun eventChecked(isSelected: Boolean , position: Int):Int {

        val position: Int = position

        var imageSelected = 0

        list[position].checked = isSelected

        imageSelected = if(isSelected)
            list[position].setImage.checkedSelected
        else
            list[position].setImage.checkedDiselected

        list[position].setImage.selected = imageSelected

        return imageSelected
    }
    private fun handleErrorMessage( viewHolder: RecyclerView.ViewHolder?, imgError: Int, context: Context) {

        viewHolder?.let {

            val tv: TextView = it.itemView.findViewById(R.id.tv_title_insp)

            val imageError: ImageView = it.itemView.findViewById(R.id.img_selected2)

            imageError.setImageResource(imgError)
            AnimationTextView.animateVibrationTV(tv, context)
        }
    }
    private fun handleErrorMessageEditText( viewHolder: RecyclerView.ViewHolder?, imgError: Int, context: Context) {

        viewHolder?.let {

            val errorMessage: TextView = viewHolder.itemView.findViewById(R.id.tv_message_error)
            val imageError: ImageView = it.itemView.findViewById(R.id.img_selected2)

            errorMessage.text = this.list[it.layoutPosition].setText.errorMessages

            errorMessage.visibility = View.VISIBLE

            imageError.setImageResource(imgError)
            AnimationTextView.animateVibrationTV(errorMessage, context)

        }
    }

    private fun handleProgressViewBt1( viewHolder: RecyclerView.ViewHolder?, isVisible: Int) {

        viewHolder?.let {

            val progressBar: ProgressBar = viewHolder.itemView.findViewById(R.id.pgb_one)
            val iconRight: ImageView = it.itemView.findViewById(R.id.img_selected2)

            if(isVisible == View.VISIBLE){

                progressBar.visibility = isVisible

                iconRight.visibility = View.GONE

            }else{

                progressBar.visibility = isVisible

                iconRight.visibility = View.VISIBLE

            }

        }
    }

    private fun handleMultipleCheckError(viewHolder: RecyclerView.ViewHolder?, imgError: Int, context: Context) {

        viewHolder?.let {
            val tv: TextView = it.itemView.findViewById(R.id.tv_title_insp)
            val imageError: ImageView = it.itemView.findViewById(R.id.img_selected2)
            imageError.setImageResource(imgError)
            AnimationTextView.animateVibrationTV(tv, context)
        }
    }
}

