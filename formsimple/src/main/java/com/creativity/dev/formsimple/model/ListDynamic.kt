package com.creativity.dev.formsimple.model
import android.os.Bundle
import android.text.InputType
import android.view.Gravity
import android.view.View
import com.creativity.dev.formsimple.BuilderForms
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.ui.CalendarActivity
import com.creativity.dev.formsimple.ui.Calendar_H_Activity
import com.creativity.dev.formsimple.model.Utils.Alignment
import com.creativity.dev.formsimple.model.Utils.Animations
import com.creativity.dev.formsimple.model.Utils.Colors
import com.creativity.dev.formsimple.model.Utils.Container
import com.creativity.dev.formsimple.model.Utils.DatePickerJG
import com.creativity.dev.formsimple.model.Utils.EditText
import com.creativity.dev.formsimple.model.Utils.Images
import com.creativity.dev.formsimple.model.Utils.Lists
import com.creativity.dev.formsimple.model.Utils.Margin
import com.creativity.dev.formsimple.model.Utils.Padding
import com.creativity.dev.formsimple.model.Utils.Setting
import com.creativity.dev.formsimple.model.Utils.Size
import com.creativity.dev.formsimple.model.Utils.SwitchJG
import com.creativity.dev.formsimple.model.Utils.Text
import com.creativity.dev.formsimple.model.Utils.TimePickerJG
import com.creativity.dev.formsimple.model.Utils.ValidatorJG
import com.creativity.dev.formsimple.model.Utils.Visibility
import com.creativity.dev.formsimple.types.*
import com.creativity.dev.formsimple.ui.SelectActivity
import com.creativity.dev.formsimple.utils.TimerHelper
import java.io.Serializable
import java.util.ArrayList

class ListDynamic:Serializable{

    var darkModeOn:Boolean = false

    var tag: String = ""

    //<Text>
    var setText: Text = Text()
    //</>

    //<Lists>
    var setList: Lists = Lists()
    //</>

    //<Set Validation for strings>
    var setValidation: ValidatorJG = ValidatorJG()
    //</>

    var setEditText: EditText = EditText()

    //<Make any action into the Unit Object>
    lateinit var action : () -> Unit
    //</>

    //<Booleans>
    var checked: Boolean = false
    var isAvailable: Boolean = true
    var isSingleList: Boolean = true
   // var validation: Boolean = false
    //</>

    //<Types>
    var type: TypeRow = TypeRow.ROW_BASIC
    //</>

    //<Setting config>

    var setting: Setting = Setting()

    //</>

    //<Asset Activity>
    var activity: Class<*> = javaClass
    var bundleActivity: Bundle = Bundle()
    //</>

    //<Animation>
    var setAnimation: Animations = Animations()
    //</>

    //<Color Text>
    var setColor: Colors = Colors()
    //</>


    //<Time Picker Dialog >
    var setTimePicker: TimePickerJG = TimePickerJG()
    //</>

    //<Time Picker Dialog >
    var setDatePicker: DatePickerJG = DatePickerJG()
    //</>

    //<Size Text>
    var setSize: Size = Size()
    //</>

    //<Rules for Global Context>

    var setPadding: Padding = Padding()

    var setMargin: Margin = Margin()

    var setContainer: Container = Container()

    //</>


    //<Alignment Text>
    var setAlignment: Alignment = Alignment()
    //</>

    //<InputVisible Type>

    var setVisibility: Visibility = Visibility()

    //</>

    //<InputVisible Type>

    var setSwitch: SwitchJG = SwitchJG()

    //</>

    //<Gravity Type>
    // var gravityTitle: Int = Gravity.LEFT
    var universalContentGravity: Int = Gravity.CENTER
    //</>

    //<Endable>
    var isEndableImageSelected: Boolean = true
    //</>

    //<Img Content>
    var setImage: Images = Images()
    //</>

    constructor(type: Int){

        when (type) {

             ROW_CHECK -> {

                 this.setText.icon = "check"
                 this.isAvailable = false
                 this.setEditText.isEditable = false
                 this.setSize.title = 14.0f

                 //this.setVisibility.title = View.GONE
                 this.setVisibility.description = View.VISIBLE
                 this.setVisibility.check = View.VISIBLE
                 this.setVisibility.imgContentEnable = View.VISIBLE
                 this.setVisibility.imgContentEnable2 = View.GONE
                 this.type = TypeRow.ROW_CHECK
                 this.setAlignment.description = View.TEXT_ALIGNMENT_TEXT_START

            }

            ROW_SINGLE_CHECK_LIST ->{

                  this.isSingleList = true
                  this.setEditText.isEditable = false
                  this.setVisibility.check = View.VISIBLE
                  this.setVisibility.description = View.VISIBLE
                  this.setImage.selected = this.setImage.arrow
                  this.setAlignment.description = View.TEXT_ALIGNMENT_TEXT_END
                  this.isEndableImageSelected = false
                  this.activity = SelectActivity::class.java
                  this.type = TypeRow.ROW_SINGLE_CHECK_LIST

            }

            ROW_MULTIPLE_CHECK_LIST ->{

                  this.isSingleList = false
                  this.setEditText.isEditable = false
                  this.setVisibility.check = View.VISIBLE
                  this.setVisibility.description = View.VISIBLE
                  this.setImage.selected = this.setImage.arrow
                  this.setAlignment.description = View.TEXT_ALIGNMENT_TEXT_END
                  this.isEndableImageSelected = false
                  this.activity = SelectActivity::class.java
                  this.type = TypeRow.ROW_MULTIPLE_CHECK_LIST
            }

            ROW_CHECK_TITLE -> {

                this.setText.icon = "check"
                this.isAvailable = false
                  this.setEditText.isEditable = false
                this.setVisibility.description = View.VISIBLE
                this.setVisibility.check = View.VISIBLE
                this.type = TypeRow.ROW_CHECK_TITLE
            }

            ROW_TITLE -> {

                this.setVisibility.title = View.VISIBLE
                this.setVisibility.separator = View.GONE
                this.setVisibility.description = View.GONE
                this.setVisibility.icon = View.GONE
                this.setVisibility.imgContentEnable2 = View.GONE
                this.setVisibility.imgContentEnable = View.GONE
                this.setEditText.isEditable = false
                this.universalContentGravity = Gravity.LEFT

                this.setContainer.background = R.color.transparent

                this.setContainer.elevation = 0f

                this.setContainer.padding.left = 0
                this.setContainer.padding.bottom = 0
                this.setContainer.padding.top = 0
                this.setContainer.padding.rigth = 0

                this.setMargin.content.top = 0
                this.setPadding.content.bottom = 0
                this.type = TypeRow.ROW_TITLE

            }

            ROW_EMPTY -> {

                this.setVisibility.title = View.INVISIBLE
                this.setVisibility.separator = View.GONE
                this.setVisibility.description = View.GONE
                this.setVisibility.icon = View.GONE
                this.setVisibility.imgContentEnable2 = View.GONE
                this.setVisibility.imgContentEnable = View.GONE
                this.setEditText.isEditable = false
                this.universalContentGravity = Gravity.LEFT

                this.setContainer.background = R.color.transparent

                this.setContainer.elevation = 0f

                this.setContainer.padding.left = 0
                this.setContainer.padding.bottom = 0
                this.setContainer.padding.top = 0
                this.setContainer.padding.rigth = 0

                this.setMargin.content.top = 0
                this.setPadding.content.bottom = 0
                this.type = TypeRow.ROW_EMPTY

            }

              ROW_CALENDAR_HOUR -> {

                  this.setVisibility.title = View.VISIBLE
                  this.setVisibility.check = View.VISIBLE
                  this.setVisibility.description = View.VISIBLE
                  this.setImage.selected = this.setImage.arrow
                  this.isEndableImageSelected = false
                  this.setEditText.isEditable = false
                  this.activity = CalendarActivity::class.java
                  this.type = TypeRow.ROW_CALENDAR_HOUR

              }

              ROW_CALENDAR -> {

                  this.setVisibility.title = View.VISIBLE
                  this.setVisibility.check = View.VISIBLE
                  this.setVisibility.description = View.VISIBLE
                  this.setImage.selected = this.setImage.arrow
                  this.isEndableImageSelected = false
                  this.setEditText.isEditable = false
                  this.setEditText.isEditable = false
                  this.activity = Calendar_H_Activity::class.java
                  this.type = TypeRow.ROW_CALENDAR_DAY
              }

             ROW_EDIT -> {

                this.type = TypeRow.ROW_EDIT
                this.setVisibility.description = View.GONE
                this.setVisibility.editText = View.VISIBLE
                this.isAvailable = true
                this.setVisibility.description = View.GONE
                this.setVisibility.editText = View.VISIBLE
                this.setVisibility.styleEdit = View.VISIBLE
                this.setVisibility.icon = View.GONE
                this.setVisibility.title = View.GONE
                 this.setVisibility.includeBasic1 = View.GONE
                 this.setVisibility.includeBasic2 = View.VISIBLE

            }

            ROW_DATE_PICKER -> {

                this.type = TypeRow.ROW_DATE_PICKER
                this.setVisibility.title = View.VISIBLE
                this.setVisibility.check = View.VISIBLE
                this.setImage.selected = this.setImage.arrow
                this.setVisibility.imgContentEnable2 = View.GONE
                this.setVisibility.imgContentEnable = View.GONE
                this.isEndableImageSelected = false

            }

            ROW_TIME_PICKER -> {

                this.type = TypeRow.ROW_TIME_PICKER
                this.setVisibility.title = View.VISIBLE
                this.setVisibility.check = View.VISIBLE
                this.setImage.selected = this.setImage.arrow
                this.setVisibility.imgContentEnable2 = View.GONE
                this.setVisibility.imgContentEnable = View.GONE
                this.isEndableImageSelected = false

            }

             ROW_ACTIVITY -> {

                this.setVisibility.title = View.VISIBLE
                this.setVisibility.check = View.VISIBLE
                this.setImage.selected = this.setImage.arrow
                this.isEndableImageSelected = false
                this.type = TypeRow.ROW_ACTIVITY
            }

            ROW_ACTION -> {

                this.setVisibility.title = View.VISIBLE
                this.setVisibility.check = View.VISIBLE
                this.setImage.selected = this.setImage.arrow
                this.isEndableImageSelected = false

                this.type = TypeRow.ROW_ACTION

            }


            ROW_SWITCH -> {

                this.setVisibility.title = View.VISIBLE
                this.setVisibility.check = View.GONE
                this.setImage.selected = this.setImage.arrow
                this.setVisibility.switch =  View.VISIBLE
                this.isEndableImageSelected = false

                this.type = TypeRow.ROW_SWITCH

            }

            ROW_ON_CLICK -> {

                this.type = TypeRow.ROW_ON_CLICK
                this.setContainer.padding.left = 30
            }

            ROW_COMMENT -> {

                this.setVisibility.icon = View.VISIBLE
                this.setVisibility.title = View.VISIBLE
                this.setVisibility.description = View.VISIBLE
                this.setEditText.isEditable = false
                this.type = TypeRow.ROW_COMMENT

            }

            ROW_DIALOG_CO ->{

                  this.setVisibility.icon = View.VISIBLE
                  this.setVisibility.title = View.VISIBLE
                  this.setEditText.isEditable = false
                  this.type = TypeRow.ROW_DIALOG_CO

            }

              ROW_INFO ->{

                  this.setEditText.isEditable = false
                  this.setVisibility.description = View.VISIBLE
                  this.setVisibility.descriptionBottom = View.GONE
                  this.setContainer.padding.left = 30
                  this.type = TypeRow.ROW_INFO

              }


            else -> {
                print("x is neither 1 nor 2")
            }
        }

    }

    enum class TypeRow {
        ROW_BASIC,
        ROW_TITLE,
        ROW_DESCRIPTION,
        ROW_ACTIVITY,
        ROW_ACTION,
        ROW_CHECK,
        ROW_COMMENT,
        ROW_DIALOG_CO,
        ONLY_CHECK,
        CHECK_AND_CUESTION,
        ROW_EDIT,
        ROW_CHECK_TITLE,
        ROW_SINGLE_CHECK_LIST,
        ROW_MULTIPLE_CHECK_LIST,
        ROW_INFO,
        ROW_CALENDAR_HOUR,
        ROW_CALENDAR_DAY,
        ROW_DATE_PICKER,
        ROW_TIME_PICKER,
        ROW_ON_CLICK,
        ROW_SWITCH,
        ROW_EMPTY
    }

    fun checkList(obj: () -> Unit) {

        obj()

        this.setList.options = if(this.setList.options.isEmpty())  BuilderForms.options else this.setList.options

        BuilderForms.options = ArrayList()

        this.darkModeOn = BuilderForms.darkModeOn

        this.setList.options.forEachIndexed { _, option ->

            if(option.check){

                setText.text = option.text

                return@forEachIndexed
            }

        }

    }

    fun onClick(obj: () -> Unit) {

        this.action = obj

    }

}