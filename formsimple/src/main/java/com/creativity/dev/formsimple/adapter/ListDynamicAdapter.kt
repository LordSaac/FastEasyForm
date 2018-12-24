package com.creativity.dev.formsimple.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.widget.*
import com.example.dreamteach.listselectdinamic.utils.AlertDialogManager
import android.widget.LinearLayout
import android.app.ActivityOptions
import android.graphics.Color
import android.support.design.widget.TextInputLayout
import android.view.*
import android.widget.TextView
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.interfaces.DelegateDialogAlert
import com.creativity.dev.formsimple.ui.INTERNAL_KEY
import com.creativity.dev.formsimple.ui.LIST_IGB

import com.creativity.dev.formsimple.extensions.eventImageCheckBoxDynamic
import com.creativity.dev.formsimple.extensions.eventWriten
import com.creativity.dev.formsimple.interfaces.EventList
import com.creativity.dev.formsimple.interfaces.EventListDynamic

import kotlin.collections.ArrayList
import android.text.InputFilter
import android.util.Log
import android.view.animation.AnimationUtils
import com.creativity.dev.formsimple.LIST_IGB_CA
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.*
import com.creativity.dev.formsimple.utils.GeneralHelper
import com.example.dreamteach.listselectdinamic.IGBDynamicList.InitListDynamicIGB.Companion.CCL
import com.example.dreamteach.listselectdinamic.IGBDynamicList.InitListDynamicIGB.Companion.rv
import com.jgb.lordsaac.igb.supportanimation.AnimationTextView
import com.jgb.lordsaac.igb.supportanimation.AnimationView
import java.lang.Exception


//https://stackoverflow.com/questions/39346343/java-equivalent-of-c-sharp-delegates-queues-methods-of-various-classes-to-be-ex
//@Autor: Isaac G Banada
//@Year: 2018

class ListDynamicAdapter (): RecyclerView.Adapter<ListDynamicAdapter.MyViewHolder>(), DelegateDialogAlert {

    private lateinit var mContext: Context
    private var testOut: Boolean = false
    private lateinit var list: List<ListDynamic>

    constructor(listMenu: List<ListDynamic>, mContext: Context) : this() {
        this.list = listMenu
        this.mContext = mContext
    }

    fun validationForms():Boolean{
        var test = true
        testOut = true

        try {
            if(CCL.size > 0){

                CCL.forEach {
                    val str = this.list.get(it.post).text
                    val type = this.list.get(it.post).type

                    if(type.equals(ListDynamic.typeRow.ROW_EDIT) && str.length == 0  || type.equals(ListDynamic.typeRow.ROW_EDIT) && str.equals(this.list.get(it.post).emptyMessages)){

                        val startView = rv.findViewHolderForAdapterPosition(it.post)!!.itemView
                        val tv: TextInputLayout = startView.findViewById(R.id.style)
                        val et: EditText = startView.findViewById(R.id.edt_text)

                        et.setText(this.list.get(it.post).emptyMessages)
                        AnimationTextView.animateVibrationET(et,mContext)

                         //AnimationView.animationLeftToRigth(tv,mContext)
                        //tv.setColor edt_text
                        test = false

                    }else if (str.length == 0) {

                        val startView = rv.findViewHolderForAdapterPosition(it.post)!!.itemView
                        val tv: TextView = startView.findViewById(R.id.tv_title_insp)
                        AnimationTextView.animateVibrationTV(tv,mContext)
                        test = false
                    }

                }
            }else{
                test = false
            }


        }catch (ex: Exception){
            Log.e(mContext.getString(R.string.Error_tag),mContext.getString(R.string.Error_001))
        }

        return test
    }

    fun Result(tag: String): ResponseFormsIGB{

        val obj = ResponseFormsIGB()

        list.forEachIndexed { index, listDynamic ->

            if(!listDynamic.type.equals(ListDynamic.typeRow.ROW_TITLE) && listDynamic.tag.equals(tag)){

                obj.tag = listDynamic.tag
                obj.text = listDynamic.text
                obj.position = index
                obj.checked = listDynamic.checked
                obj.options = listDynamic.options
                obj.type = listDynamic.type

                return@forEachIndexed
            }

        }

        return obj
    }

    fun UpdateRow(tagOrTitle: String,objRespIGB: ResponseFormsIGB){

        var view: View
        var tv: TextView
        var image: ImageView
        var editText: EditText

        list.forEachIndexed { index, listDynamic ->

            if(!listDynamic.type.equals(ListDynamic.typeRow.ROW_TITLE) && listDynamic.tag.equals(tagOrTitle)){


                list.get(index).imageSelected = eventChecked(objRespIGB.checked,index )

                if (objRespIGB.options.size > 0)
                    list.get(index).options =  objRespIGB.options

                if (objRespIGB.text.length > 0)
                    list.get(index).text = objRespIGB.text

                try {

                    view = rv.findViewHolderForAdapterPosition(index)!!.itemView
                    tv = view.findViewById(R.id.tv_desc_insp)
                    image = view.findViewById(R.id.img_selected)
                    editText = view.findViewById(R.id.edt_text)

                    tv.setText(list.get(index).text)
                    editText.setText(list.get(index).text)

                    if(listDynamic.type.equals(ListDynamic.typeRow.ROW_CHECK)){
                        val shake = AnimationUtils.loadAnimation(mContext, R.anim.zoom_in)

                        image.setBackgroundResource(list.get(index).imageSelected)
                        image.startAnimation(shake)

                    }

                }catch (ex: Exception){

                }

                return@forEachIndexed
            }

        }

    }

    private  fun eventChecked(isSelected: Boolean , position: Int):Int {
        val position: Int = position
        var imageSelected = 0

        list.get(position).checked = isSelected

        if(isSelected)
            imageSelected = list.get(position).imageCheckedSelected
        else
            imageSelected = list.get(position).imageCheckedDiselected

        list.get(position).imageSelected = imageSelected

        return imageSelected
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_check_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

             val generalList = list[position]
             val height = (mContext as Activity).windowManager.defaultDisplay.height
           //  val exist = CCL.filter { it.post == position }.size

             val iconText: String = generalList.iconText

             val iconAveilable = generalList.isAvailable

             val visibilityCheck: Int = generalList.visibilityCheck
             val visibilityIcon:  Int = generalList.visibilityIcon
             val visibiliteTitle: Int = generalList.visibilityTitle
             val visibilitySeparator:   Int = generalList.visibilitySeparator
             val visibilityDescription: Int = generalList.visibilityDescription

             val gravitytitle: Int = generalList.gravityTitle

             val iconSize: Float = generalList.iconSize

             val contentPaddingBottom = generalList.contentPaddingBottom
             val contentPaddingLeft = generalList.contentPaddingLeft
             val contentPaddingRigth = generalList.contentPaddingRigth
             val contentPaddingTop = generalList.contentPaddingTop

             val contentMarginTop: Int = generalList.contentMarginTop

             val universalContentGravity: Int = generalList.universalContentGravity

             val alignmentText: Int = generalList.alignmentText

        var sizeHeigthLny: Int = (height * generalList.sizeHeigthRow).toInt()
        var sizeTopMargin: Int = (height * generalList.sizeMargintTop).toInt()


        holder.description.setText(generalList.text)
        holder.check.isChecked = generalList.checked

        holder.editText.visibility = View.GONE
        holder.styleEditText.visibility = View.GONE
        holder.letter.setBackgroundResource(R.drawable.circular_view)

        //<Set Size>
        holder.letter.textSize = generalList.letterSize
        holder.description.textSize = generalList.descriptionSize
        holder.description.textAlignment = generalList.alignmentDescription
        holder.editText.textSize = generalList.editSize
        //</>

        //<Set Color>
        holder.icon.setTextColor(generalList.iconColor)
        holder.description.setTextColor(generalList.descriptionColor)

        holder.seperatorContent.setBackgroundColor(generalList.seperatorColor)
        holder.letter.setTextColor(generalList.letterColor)

             holder.check.visibility =  generalList.visibilityCheck
             holder.description.visibility = generalList.visibilityDescription

             holder.title.setText(generalList.title)
             holder.title.textSize = generalList.titleSize
             holder.title.setTextColor(generalList.titleColor)
             holder.title.visibility = visibiliteTitle
             holder.title.textAlignment = alignmentText

             holder.icon.isEnabled = iconAveilable
             holder.icon.textSize = iconSize
             holder.icon.setTypeface(holder.icon.getTypeface(), Typeface.NORMAL)
             holder.icon.visibility =  visibilityIcon

             holder.icon.visibility = visibilityIcon
             holder.seperatorContent.visibility = visibilitySeparator

             holder.UnvContent.gravity = universalContentGravity

            holder.editText.setFilters(arrayOf<InputFilter>(InputFilter.LengthFilter(generalList.maxLength))) // the position is the key
            holder.editText.setText(generalList.text)
            holder.styleEditText.hint = generalList.title
            holder.editText.inputType = generalList.inputTypeEditText
            holder.editText.isEnabled = generalList.isAvailable
            holder.editText.setTextColor(generalList.editColor)

             holder.styleEditText.setHintTextAppearance(generalList.editStyleColor)
             holder.styleEditText.hint = generalList.title

             holder.description.visibility = generalList.visibilityDescription
             holder.editText.visibility = generalList.visibilityEditText
             holder.styleEditText.visibility = generalList.visibilityStyleEdit
             holder.icon.visibility = generalList.visibilityIcon
             holder.title.visibility = generalList.visibilityTitle
             holder.contentImg.visibility = generalList.VisibilitContentCheck

             holder.contentImg.isEnabled = generalList.isEndableImageSelected
             holder.img2.visibility = generalList.imageContentEnable2
             holder.img.visibility = generalList.imageContentEnable
           //holder.img.visibility = generalList.imageContentEnable
             holder.content.setPadding(contentPaddingLeft,contentPaddingTop,contentPaddingRigth,contentPaddingBottom)
           //holder.content.layoutParams.height = sizeHeigthLny

             holder.img.setImageResource(generalList.imageSelected)
             holder.img2.setImageResource(generalList.imageSelected)

//        if (position % 2 == 0)
//            holder.UnvContent.layoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT // 0 for hide

        /*
            if(generalList.validation && exist == 0 && !generalList.type.equals(ListDynamic.typeRow.ROW_TITLE)){

                 val obj = CollectionControlsList()
                 obj.post = position

                 CCL.add(obj)
             }
        */

/*
                if(generalList.type.equals(ListDynamic.typeRow.ROW_TITLE)){

                 val lp = LinearLayout.LayoutParams(holder.UnvContent.layoutParams.width, holder.UnvContent.layoutParams.height)
                 lp.setMargins(0, contentMarginTop,0, 0)

                 holder.UnvContent.layoutParams = lp
             }
*/

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getDataResponse(str: String) {

    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener, EventListDynamic, EventList {

        var title: TextView
        var letter: TextView
        var icon: TextView
        var editText: EditText
        var description: TextView
        var check: CheckBox
        var contentLetter: RelativeLayout
        var content: LinearLayout
        var UnvContent: LinearLayout
        var contentImg: LinearLayout
        var seperatorContent: LinearLayout
        var styleEditText: TextInputLayout
        var img: ImageView
        var img2: ImageView

        init {

            title = view.findViewById(R.id.tv_title_insp)
            icon = view.findViewById(R.id.tv_icon_insp)
            description = view.findViewById(R.id.tv_desc_insp)
            check = view.findViewById(R.id.ck_selected_insp)
            letter = view.findViewById(R.id.tv_letters_inps)
            content = view.findViewById(R.id.lyt_content_obj)
            contentLetter = view.findViewById(R.id.rl_letter_content)
            UnvContent = view.findViewById(R.id.ly_unv_content)
            contentImg = view.findViewById(R.id.conten_img_selected)
            seperatorContent = view.findViewById(R.id.ly_separator)
            editText = view.findViewById(R.id.edt_text)
            styleEditText = view.findViewById(R.id.style)
            img = view.findViewById(R.id.img_selected);
            img2 = view.findViewById(R.id.img_selected2);

            content.setOnClickListener(this)
            img2.setOnClickListener(this)

            editText.eventWriten(this)
            contentImg.eventImageCheckBoxDynamic(this,img)

        }

        override fun onClick(v: View) {
            val pos = adapterPosition
            val generalList = list[pos]

            if(generalList.type.equals(ListDynamic.typeRow.ROW_ACTIVITY)){
                val intent = Intent(mContext, generalList.activity)
                val activityExists = intent.resolveActivityInfo(mContext.packageManager, 0) != null

                if (activityExists) run {
                    if(generalList.animationIntentEnter != 0 && generalList.animationIntentExit != 0){
                        generalList.bundleActivity = ActivityOptions.makeCustomAnimation(mContext, generalList.animationIntentEnter, generalList.animationIntentExit).toBundle()
                        mContext.startActivity(intent, generalList.bundleActivity)
                    }else{
                        mContext.startActivity(intent,generalList.bundleActivity)
                    }

                }else{
                    AlertDialogManager.simpleAlerts(mContext,"Alert","This activity not exist.")
                }
            } else if(generalList.type.equals(ListDynamic.typeRow.ROW_MULTIPLE_CHECK_LIST) || generalList.type.equals(ListDynamic.typeRow.ROW_SINGLE_CHECK_LIST)){

                val intent = Intent(mContext, generalList.activity)
                val bundle = generalList.bundleActivity
                val list = generalList.options
                val title: String = generalList.title
                val isSingle: Boolean = generalList.isSingleList
                val colorToolbar: Int = generalList.colorBackgroundToolbar
                val colorTitleToolbar: Int = generalList.colorTitleToolbar
                val background: Int = generalList.backgroundContent
                val arrayObj:  ArrayList<ListObject> = ArrayList()
                val obj = ListObject()
                val emptyMessage = generalList.emptyMessages
                val imageEmpty = generalList.imageEmpty

                val activityExists = intent.resolveActivityInfo(mContext.packageManager, 0) != null

                if (activityExists) run {

                        obj.title = title
                        obj.list = list
                        obj.isSingle = isSingle
                        obj.colorTitleToolbar = colorTitleToolbar
                        obj.colorToolbar = colorToolbar
                        obj.backgroundContent = background
                        obj.emptyMessage = emptyMessage
                        obj.imageEmpty = imageEmpty

                        ListObject.eventList = this

                        arrayObj.add(obj)

                        bundle.putSerializable(LIST_IGB,arrayObj)

                        intent.putExtra(INTERNAL_KEY,bundle)
                        mContext.startActivity(intent)

                }else{
                    AlertDialogManager.simpleAlerts(mContext,"Alert","ups ocurred a problem :(")
                }
            }else if(generalList.type.equals(ListDynamic.typeRow.ROW_CALENDAR_HOUR) || generalList.type.equals(ListDynamic.typeRow.ROW_CALENDAR_DAY)){

                val intent = Intent(mContext, generalList.activity)
                val bundle = generalList.bundleActivity
                val title: String = generalList.title
                val colorToolbar: Int = generalList.colorBackgroundToolbar
                val colorTitleToolbar: Int = generalList.colorTitleToolbar
                val style: Int = generalList.styleContentHour
                val text: String = generalList.text
                val obj = ColectionCalendar()
                val arrayCollection: ArrayList<ColectionCalendar> = ArrayList()
                val dateList = generalList.arrayDates
                val background = generalList.backgroundContent
                val activityExists = intent.resolveActivityInfo(mContext.packageManager, 0) != null

                if (activityExists) run {

                    obj.title = title
                    obj.styleContentHour = style
                    obj.text = text
                    obj.colorTitleToolbar = colorTitleToolbar
                    obj.colorToolbar = colorToolbar
                    obj.listDate = dateList
                    obj.background = background

                    arrayCollection.add(obj)
                    ListObject.eventList = this

                    bundle.putSerializable(LIST_IGB_CA,arrayCollection)

                    intent.putExtra(GeneralHelper.keyBundle(),bundle)
                    mContext.startActivity(intent)

                }else{
                    AlertDialogManager.simpleAlerts(mContext,"Alert","ups ocurred a problem :(")
                }
            }

        }

        //@Interfaces for listiner edit text user
        override fun eventEdtiText(str: String) {

            val position: Int = adapterPosition

            list.get(position).text = str

          //   response(position) // <-- Response in the mein activity
        }

        //@Interfaces for listiner edit text user
        override fun eventChecked(isSelected: Boolean):Int {
            val position: Int = adapterPosition
            var imageSelected = 0

            list.get(position).checked = isSelected

            if(isSelected)
               imageSelected = list.get(position).imageCheckedSelected
            else
                imageSelected = list.get(position).imageCheckedDiselected

            list.get(position).imageSelected = imageSelected

            response(position) // <-- Response in the mein activity

            return imageSelected
        }

        //@Interfaces Here listener get, the now check
        override fun getSelected(): Boolean {
            val position: Int = adapterPosition
            if(position >= 0)
                return list.get(position).checked
            else
                return false
        }


        override fun evenSetSimpleString(str: String) {
            val position: Int = adapterPosition
            val view = rv.findViewHolderForAdapterPosition(position)!!.itemView

            if(str.isNotEmpty()){
                val tv: TextView = view.findViewById(R.id.tv_desc_insp)
                val tittle: TextView = view.findViewById(R.id.tv_title_insp)

                tv.setText(str)
                list.get(position).text = str
                tittle.setTextColor(list.get(position).titleColor)
                response(position) // <-- Response in the mein activity
            }

        }

        override fun eventSetList(inputList: List<Any>) {
            val position: Int = adapterPosition
            val view = rv.findViewHolderForAdapterPosition(position)!!.itemView
            list.get(position).options = inputList as ArrayList<Select>

            if(list.get(position).isSingleList && inputList.size > 0){

                val tv: TextView = view.findViewById(R.id.tv_desc_insp)
                val tittle: TextView = view.findViewById(R.id.tv_title_insp)
                val newList: ArrayList<Select> = inputList.filter { it.check == true } as  ArrayList<Select>
                var text:String = ""

                if(newList.size > 0){
                    text = newList.get(0).text
                    tv.setText(text)
                    tittle.setTextColor(list.get(position).titleColor)
                    list.get(position).text = text
                }else{
                    tv.setText(text)
                    list.get(position).text = text
                }
            }

            response(position) // <-- Response in the mein activity
        }

        private fun response(pos:Int){

            if(mContext is FormsListenerIGB){
                val delegateMain: FormsListenerIGB = mContext as FormsListenerIGB
                val isaac = ResponseFormsIGB() //<--a little reference for here

                isaac.tag = list.get(pos).tag
                isaac.position = pos
                isaac.options = list.get(pos).options
                isaac.text = list.get(pos).text
                isaac.checked = list.get(pos).checked

                delegateMain.FormsListenerResponse(isaac)

            }
        }


    }

}
