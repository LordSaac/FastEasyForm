package com.creativity.dev.formsimple.adapter.forms

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.adapter.forms.Interfaces.DynamicListAdapterI
import com.creativity.dev.formsimple.adapter.forms.builders.CheckButtonB
import com.creativity.dev.formsimple.adapter.forms.builders.Container
import com.creativity.dev.formsimple.adapter.forms.builders.EditTextB
import com.creativity.dev.formsimple.adapter.forms.builders.ImageViewB
import com.creativity.dev.formsimple.adapter.forms.builders.LinearLayoutB
import com.creativity.dev.formsimple.adapter.forms.builders.SwitchB
import com.creativity.dev.formsimple.adapter.forms.builders.TextViewB
import com.creativity.dev.formsimple.ext.limitAndAppendEllipsis
import com.creativity.dev.formsimple.extensions.eventImageCheckBoxDynamic
import com.creativity.dev.formsimple.extensions.eventWriten
import com.creativity.dev.formsimple.interfaces.DelegateDialogAlert
import com.creativity.dev.formsimple.interfaces.EventList
import com.creativity.dev.formsimple.interfaces.EventListDynamic
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.*
import com.creativity.dev.formsimple.ui.INTERNAL_KEY
import com.creativity.dev.formsimple.ui.LIST_IGB
import com.creativity.dev.formsimple.ui.LIST_IGB_CA
import com.creativity.dev.formsimple.utils.GeneralHelper
import com.example.dreamteach.listselectdinamic.utils.AlertDialogManager
import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale


//https://stackoverflow.com/questions/39346343/java-equivalent-of-c-sharp-delegates-queues-methods-of-various-classes-to-be-ex
//@Autor: José I. Gutiérrez B.
//@Year: 2018

abstract class DynamicListAdapter (model: List<ListDynamic>, mContext: Context,recyclerView: RecyclerView,positionRow: ArrayList<CollectionControlsList>): RecyclerView.Adapter<DynamicListAdapter.DynamicListHolder>(), DelegateDialogAlert,
    DynamicListAdapterI {

     val mContext: Context = mContext

     var list: List<ListDynamic> = model

     val recyclerView: RecyclerView = recyclerView

     val positionRow: ArrayList<CollectionControlsList> = positionRow

     abstract fun init(listMenu: List<ListDynamic>, mContext: Context,recyclerView: RecyclerView,positionRow: ArrayList<CollectionControlsList>)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DynamicListHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_check_list, parent, false)

        return DynamicListHolder(itemView)
    }

    override fun onBindViewHolder(holder: DynamicListHolder, position: Int) {

        TextViewB.build(holder,list,position)

        TextViewB.buildDescriptions(holder,list,position)

        TextViewB.buildIcon(holder,list,position)

        TextViewB.buildTitle(holder,list,position)

        TextViewB.buildLetters(holder,list,position)

        EditTextB.build(holder,list,position,mContext)

        CheckButtonB.build(holder,list,position)

        LinearLayoutB.build(holder,list,position)

        LinearLayoutB.buildSeparator(holder,list,position)

        ImageViewB.build(holder,list,position)

        SwitchB.build(holder,list,mContext,position)

        Container.build(holder,list,position,mContext)

    }

    override fun getItemCount(): Int {

        return list.size

    }

    inner class DynamicListHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener, EventListDynamic, EventList {

        var title: TextView
        var letter: TextView
        var errorMessage: TextView
        var icon: TextView
        var tvBubble: TextView
        var descriptionBottom: TextView
        var editText: EditText
        var description: TextView
        var check: CheckBox
        var contentLetter: RelativeLayout
        var content: LinearLayout
        var UnvContent: LinearLayout
        var cardViewContent: CardView
        var contentImg: LinearLayout
        var contentBobble: LinearLayout
        var contentBasic1: LinearLayout
        var includeBasic1: LinearLayout
        var includeBasic2: LinearLayout
        var seperatorContent: LinearLayout
        var universalContent: LinearLayout
        var constraintMainLayout: ConstraintLayout
        var styleEditText: TextInputLayout
        var img: ImageView
        var img2: ImageView
        var iconLeft: ImageView
        var progressBarRight: ProgressBar
        var swtichActive: Switch

        init {

            title = view.findViewById(R.id.tv_title_insp)
            descriptionBottom = view.findViewById(R.id.tv_desc)
            tvBubble = view.findViewById(R.id.tv_bubble)
            icon = view.findViewById(R.id.tv_icon_insp)
            description = view.findViewById(R.id.tv_desc_insp)
            check = view.findViewById(R.id.ck_selected_insp)
            letter = view.findViewById(R.id.tv_letters_inps)
            content = view.findViewById(R.id.lyt_content_obj)
            contentLetter = view.findViewById(R.id.rl_letter_content)
            UnvContent = view.findViewById(R.id.ly_unv_content)
            contentBasic1 = view.findViewById(R.id.lny_basic_1)
            includeBasic1 = view.findViewById(R.id.inc_basic_1)
            includeBasic2 = view.findViewById(R.id.inc_basic_2)
            universalContent = view.findViewById(R.id.ly_universal_content)
            contentBobble = view.findViewById(R.id.ly_bubble)
            cardViewContent = view.findViewById(R.id.card_content)
            constraintMainLayout = view.findViewById(R.id.cons_main)
            contentImg = view.findViewById(R.id.conten_img_selected)
            seperatorContent = view.findViewById(R.id.ly_separator)
            editText = view.findViewById(R.id.edt_text)
            styleEditText = view.findViewById(R.id.style2)
            img = view.findViewById(R.id.img_selected);
            img2 = view.findViewById(R.id.img_selected2);
            iconLeft = view.findViewById(R.id.img_icon_left);
            errorMessage = view.findViewById(R.id.tv_message_error);
            swtichActive = view.findViewById(R.id.swtich_1)
            progressBarRight = view.findViewById(R.id.pgb_one)

            content.setOnClickListener(this)

            img2.setOnClickListener(this)

            swtichActive.setOnClickListener(this)

            editText.eventWriten(this)

            contentImg.eventImageCheckBoxDynamic(this,img)

        }

        @SuppressLint("QueryPermissionsNeeded")
        override fun onClick(v: View) {
            val pos = layoutPosition
            val generalList = list[pos]

            val intent = Intent(mContext, generalList.activity)
            val activityExists = intent.resolveActivityInfo(mContext.packageManager, 0) != null

            when (generalList.type) {

                ListDynamic.TypeRow.ROW_ACTIVITY -> {
                    if (activityExists) {
                        val options = generalList.setAnimation
                        val bundle = if (options.intentEnter != 0 && options.intentExit != 0) {
                            ActivityOptions.makeCustomAnimation(mContext, options.intentEnter, options.intentExit).toBundle()
                        } else {
                            null
                        }
                        mContext.startActivity(intent, bundle)
                    } else {
                        AlertDialogManager.simpleAlerts(mContext, "Alert", "This activity does not exist.")
                    }
                }
                ListDynamic.TypeRow.ROW_MULTIPLE_CHECK_LIST,
                ListDynamic.TypeRow.ROW_SINGLE_CHECK_LIST -> {
                    if (activityExists) {

                        ListObject.eventList = this

                        val list = generalList.setList.options
                        val title = generalList.setText.title
                        val titleTootbars = generalList.setText.titleToolbar
                        val isSingle = generalList.isSingleList
                        val colorToolbar = generalList.setColor.backgroundToolbar
                        val colorTitleToolbar = generalList.setColor.titleToolbar
                        val background = generalList.setColor.backgroundContent

                        val arrayObj = ArrayList<ListObject>().apply {
                            add(ListObject(generalList.darkModeOn).apply {
                                this.title = title
                                this.titleToolbar = titleTootbars
                                this.list = list
                                this.isSingle = isSingle
                                this.colorTitleToolbar = colorTitleToolbar
                                this.colorToolbar = colorToolbar
                                this.backgroundContent = background
                                this.emptyMessage = generalList.setText.errorMessages
                                this.imageEmpty = generalList.setColor.imageEmpty
                                this.btnTitle = generalList.setText.btnFinishSelect
                                this.btnTitleColor = generalList.setColor.btnFinishSelect
                                this.activeBtnCheck = generalList.setVisibility.activeBtnCheck
                                this.activeBtnFinish = generalList.setVisibility.btnFinishSelect
                                this.darkMode = generalList.darkModeOn
                            })
                        }
                        val bundle = Bundle().apply {
                            putSerializable(LIST_IGB, arrayObj)
                        }
                        intent.putExtra(INTERNAL_KEY, bundle)
                        mContext.startActivity(intent)
                    } else {
                        AlertDialogManager.simpleAlerts(mContext, "Alert", "Ups, an error occurred.")
                    }
                }
                ListDynamic.TypeRow.ROW_DATE_PICKER ->  this.showDatePicker(pos)
                ListDynamic.TypeRow.ROW_TIME_PICKER ->  this.showTimePicker(pos)
                ListDynamic.TypeRow.ROW_CALENDAR_HOUR,
                ListDynamic.TypeRow.ROW_CALENDAR_DAY -> {
                    if (activityExists) {

                        ListObject.eventList = this

                        val title = generalList.setText.title
                        val colorToolbar = generalList.setColor.backgroundToolbar
                        val colorTitleToolbar = generalList.setColor.titleToolbar
                        val style = generalList.setColor.styleContentHour
                        val text = generalList.setText.text
                        val dateList = generalList.setList.arrayDates
                        val background = generalList.setColor.backgroundContent

                        val obj = ColectionCalendar().apply {
                            this.title = title
                            this.styleContentHour = style
                            this.text = text
                            this.colorTitleToolbar = colorTitleToolbar
                            this.colorToolbar = colorToolbar
                            this.listDate = dateList
                            this.background = background
                            this.format = generalList.setDatePicker.format
                        }
                        val arrayCollection = ArrayList<ColectionCalendar>().apply {
                            add(obj)
                        }
                        val bundle = Bundle().apply {
                            putSerializable(LIST_IGB_CA, arrayCollection)
                        }
                        intent.putExtra(GeneralHelper.keyBundle(), bundle)
                        mContext.startActivity(intent)
                    } else {
                        AlertDialogManager.simpleAlerts(mContext, "Alert", "Ups, an error occurred.")
                    }
                }
                ListDynamic.TypeRow.ROW_ON_CLICK, ListDynamic.TypeRow.ROW_ACTION ->{

                    generalList.action()

                }
                ListDynamic.TypeRow.ROW_SWITCH -> {

                    list[pos].setSwitch.active = !list[pos].setSwitch.active

                    this.response(pos)

                }
                else -> {

                    // Default options isn't use in this moment.

                }
            }
        }

        //@Interfaces for listiner edit text user
        override fun eventEdtiText(str: String) {

            val position: Int = bindingAdapterPosition

            val viewHolder = recyclerView.findViewHolderForAdapterPosition(position)

            list[position].setText.text = str

            if (viewHolder != null) {
                viewHolder.itemView.findViewById<TextView?>(R.id.tv_message_error).visibility = View.GONE
            }

          //   response(position) // <-- Response in the mein activity Aqui
        }

        //@Interfaces for listiner edit text user
        override fun eventChecked(isSelected: Boolean):Int {

            return this.actionSelect(layoutPosition, isSelected = isSelected)

        }

        //@Interfaces Here listener get, the now check
        override fun getSelected(): Boolean {

            val position: Int = layoutPosition
            var result = false

             if(position >= 0)
               result = list[position].checked

            return result
        }

        override fun evenSetSimpleString(str: String) {

            val position: Int = layoutPosition

            val view = recyclerView.findViewHolderForAdapterPosition(position)!!.itemView

            if(str.isNotEmpty()){

                val tv: TextView = view.findViewById(R.id.tv_desc_insp)

                val tittle: TextView = view.findViewById(R.id.tv_title_insp)

                val imageError: ImageView = view.findViewById(R.id.img_selected2)

                list[position].setImage.selected = list[position].setImage.arrow

                imageError.setImageResource(list[position].setImage.selected)

                tv.text = str

                list[position].setText.text = str

                tittle.setTextColor(list[position].setColor.title)

                response(position) // <-- Response in the mein activity

            }

        }

        override fun eventSetList(inputList: List<Any>) {

            val position: Int = bindingAdapterPosition
            val viewHolder = recyclerView.findViewHolderForAdapterPosition(position)
            val listDynamicItem = list.getOrNull(position)
            val limitString = 25

            if (viewHolder != null && listDynamicItem != null) {

                val imgIconRight: ImageView = viewHolder.itemView.findViewById(R.id.img_selected2)
                val descRigth: TextView = viewHolder.itemView.findViewById(R.id.tv_desc_insp)
                val title: TextView = viewHolder.itemView.findViewById(R.id.tv_title_insp)

                val selectedList = inputList.filterIsInstance<Select>()

                listDynamicItem.setList.options = ArrayList(selectedList)

                list[position].setList.options = ArrayList(selectedList)

                descRigth.visibility = if(!listDynamicItem.setting.rowSingleCheck.activeIconSuccess) View.VISIBLE else View.GONE

                list[position].setVisibility.description = descRigth.visibility

                if (listDynamicItem.isSingleList) {

                    val firstSelectedItem = listDynamicItem.setList.options.firstOrNull { it.check }

                    val desc = firstSelectedItem?.text ?: ""

                    listDynamicItem.setImage.selected = listDynamicItem.setImage.arrow

                    imgIconRight.setImageResource(listDynamicItem.setImage.selected)

                    descRigth.text = desc

                    listDynamicItem.setText.text = desc

                    list[position].setText.text = desc

                    title.setTextColor(listDynamicItem.setColor.title)

                }

                else if (!listDynamicItem.isSingleList && listDynamicItem.setList.options.isNotEmpty()) {

                    val text = listDynamicItem.setList.options.first().text.limitAndAppendEllipsis(limitString)

                    descRigth.text = text

                    listDynamicItem.setText.text = text

                    list[position].setText.text = text

                    title.setTextColor(listDynamicItem.setColor.title)

                }

                val isCheckList = listDynamicItem.type == ListDynamic.TypeRow.ROW_SINGLE_CHECK_LIST || listDynamicItem.type == ListDynamic.TypeRow.ROW_MULTIPLE_CHECK_LIST

                if (isCheckList) {

                    listDynamicItem.checked = listDynamicItem.setList.options.any { it.check }

                    if(listDynamicItem.setting.rowSingleCheck.activeIconSuccess){

                        listDynamicItem.setImage.selected = if (listDynamicItem.checked) listDynamicItem.setImage.success else listDynamicItem.setImage.arrow

                    }
                    else{

                        val text = listDynamicItem.setList.options.first().text.limitAndAppendEllipsis(limitString)

                        listDynamicItem.setText.text = text

                        list[position].setText.text = text

                    }

                     imgIconRight.setImageResource(listDynamicItem.setImage.selected)

                     /// recyclerView.adapter?.notifyItemChanged(position)

                }

                // Response in the main activity
                response(position)

            }
        }

        private fun actionSelect(pos: Int, isSelected: Boolean):Int{

            val position: Int = pos

            var imageSelected = 0

            list[position].checked = isSelected

            imageSelected = if(isSelected)
                list[position].setImage.checkedSelected
            else
                list[position].setImage.checkedDiselected

            list[position].setImage.selected = imageSelected

            response(position) // <-- Response in the mein activity

            return imageSelected

        }

        private fun response(pos: Int) {
            if (mContext is FormsListenerIGB) {
                val isaac = ResponseFormsIGB().apply {

                    tag = list[pos].tag
                    position = pos
                    options = list[pos].setList.options
                    text = list[pos].setText.text
                    desc = list[pos].setText.descriptionBottom
                    title = list[pos].setText.title
                    checked = list[pos].checked
                    iconArrow = list[pos].setImage.arrow
                    type = list[pos].type
                    swtichActive = list[pos].setSwitch.active

                    if (type == ListDynamic.TypeRow.ROW_SINGLE_CHECK_LIST || type == ListDynamic.TypeRow.ROW_MULTIPLE_CHECK_LIST) {
                        checked = options.any { it.check }
                    }
                }
                (mContext as FormsListenerIGB).actionFormResponse(isaac)
            }
        }

        @SuppressLint("SetTextI18n")
        private fun showDatePicker(setPosition: Int) {

            val generalList = list[setPosition]

            val calendar = Calendar.getInstance()

            val viewHolder = recyclerView.findViewHolderForAdapterPosition(setPosition)

            val format = generalList.setDatePicker.format.ifEmpty { "dd/MM/yyyy" }

            val tv: TextView = viewHolder!!.itemView.findViewById(R.id.tv_desc)

            val img: ImageView = viewHolder!!.itemView.findViewById(R.id.img_icon_left)

            // Create a SimpleDateFormat to format the date as "dd/MM/yyyy"
            val dateFormat = SimpleDateFormat(format, Locale.getDefault())

            val currentDate = Calendar.getInstance().time

            val dateString = generalList.setText.descriptionBottom.ifEmpty { dateFormat.format(currentDate) }

            val date = dateFormat.parse(dateString)

            calendar.time = date!!

            // Create a DatePickerDialog
            val datePickerDialog = DatePickerDialog(
                mContext, {DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                    // Create a new Calendar instance to hold the selected date
                    val selectedDate = Calendar.getInstance()
                    // Set the selected date using the values received from the DatePicker dialog
                    selectedDate.set(year, monthOfYear, dayOfMonth)

                    // Format the selected date into a string
                    val formattedDate = dateFormat.format(selectedDate.time)
                    // Update the TextView to display the selected date with the "Selected Date: " prefix

                    tv.text = formattedDate

                    tv.visibility = View.VISIBLE

                    img.visibility = View.VISIBLE

                     list[setPosition].setText.descriptionBottom = formattedDate

                     list[setPosition].setVisibility.descriptionBottom = View.VISIBLE

                     // recyclerView.adapter?.notifyItemChanged(setPosition)

                     response(setPosition)

                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )
            // Show the DatePicker dialog
            datePickerDialog.show()
        }

        @SuppressLint("SetTextI18n")
        private fun showTimePicker(setPosition: Int) {

            val generalList = list[setPosition]

            val calendar = Calendar.getInstance()

            val viewHolder = recyclerView.findViewHolderForAdapterPosition(setPosition)

            val format = generalList.setTimePicker.format.ifEmpty { "HH:mm" }

            val tv: TextView = viewHolder!!.itemView.findViewById(R.id.tv_desc)

            val img: ImageView = viewHolder!!.itemView.findViewById(R.id.img_icon_left)

            // Create a SimpleDateFormat to format the time as "HH:mm"
            val timeFormat = SimpleDateFormat(format, Locale.getDefault())

            val currentTime = Calendar.getInstance().time

            val timeString = generalList.setText.descriptionBottom.ifEmpty { timeFormat.format(currentTime) }

            val time = timeFormat.parse(timeString)

            calendar.time = time!!

            // Create a TimePickerDialog
            val timePickerDialog = TimePickerDialog(
                mContext, OnTimeSetListener { timePicker, hourOfDay: Int, minute: Int ->
                    // Create a new Calendar instance to hold the selected time
                    val selectedTime = Calendar.getInstance()
                    // Set the selected time using the values received from the TimePicker dialog
                    selectedTime.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    selectedTime.set(Calendar.MINUTE, minute)

                    // Format the selected time into a string
                    val formattedTime = timeFormat.format(selectedTime.time)
                    // Update the TextView to display the selected time with the "Selected Time: " prefix

                    tv.text = formattedTime

                    tv.visibility = View.VISIBLE

                    img.visibility = View.VISIBLE

                    list[setPosition].setText.descriptionBottom = formattedTime

                    list[setPosition].setVisibility.descriptionBottom = View.VISIBLE

                    // recyclerView.adapter?.notifyItemChanged(setPosition)

                    response(setPosition)

                },
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                generalList.setTimePicker.is24HourFormat // Set to true if you want 24-hour format
            )
            // Show the TimePicker dialog
            timePickerDialog.show()
        }

    }

}
