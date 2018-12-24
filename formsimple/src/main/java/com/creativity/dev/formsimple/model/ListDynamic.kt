package com.creativity.dev.formsimple.model

import android.graphics.Color
import android.graphics.Color.GREEN
import android.os.Bundle
import android.support.annotation.NonNull
import android.text.InputType
import android.view.Gravity
import android.view.View
import com.creativity.dev.formsimple.CalendarActivity
import com.creativity.dev.formsimple.Calendar_H_Activity
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.types.*
import com.creativity.dev.formsimple.ui.SelectActivity
import java.io.Serializable
import java.util.*

class ListDynamic:Serializable{

    //<Text>
    var title: String = ""
    var tag: String = ""
    var text: String = ""
    var edtHint: String = ""
    var comment: String = ""
    var iconText: String = ""
    var emptyMessages: String = "Please Insert Text"
    //</>

    //<Lists>
    var options: ArrayList<Select> = ArrayList()
    var arrayDates: List<Date> = ArrayList()
    //</>

    //<Booleans>
    var checked: Boolean = false
    var activeLetter: Boolean = false
    var isAvailable: Boolean = true
    var isSingleList: Boolean = true
    var validation: Boolean = false
    //</>

    //<Types>
    var type: typeRow = typeRow.ROW_BASIC
    //</>

    //<Asset Activity>
    var activity: Class<*> = javaClass
    var bundleActivity: Bundle = Bundle()
    //</>

    //<Animation>
    var animationIntentEnter: Int = 0
    var animationIntentExit: Int = 0
    //</>

    //<Color Text>
    var titleColor:Int = Color.BLACK
    var descriptionColor: Int = Color.GRAY
    var iconColor: Int = Color.LTGRAY
    var seperatorColor: Int = Color.rgb(244,244,244)
    var circleColor: Int = Color.GREEN
    var letterColor: Int = Color.WHITE
    var editColor: Int = Color.GRAY
    var editStyleColor: Int = Color.YELLOW
    var colorTitleToolbar: Int = Color.WHITE
    var colorBackgroundToolbar: Int = Color.rgb(101,185,102)
    var styleContentHour: Int =  R.style.picker_clock // Standar
    var backgroundContent: Int = 0
    var imageEmpty: Int = R.drawable.empty_box
    //</>

    //<Size Text>
    var titleSize: Float = 16.0f
    var descriptionSize: Float = 14.0f
    var letterSize: Float = 18.0f
    var editSize: Float = 14.0f
    var iconSize: Float = 14.0f
    //</>

    //<Rules for Global Context>
    var contentPaddingTop: Int = 12
    var contentPaddingBottom: Int = 12
    var contentPaddingLeft: Int = 12
    var contentPaddingRigth: Int = 12
    var contentMarginTop: Int = 1
    //</>

    //<Size Row>
    var sizeHeigthRow: Float = 0.055f //<-- Original size
    var sizeMargintTop: Float = 0.0f //<-- Original size
    //</>

    //<InputType Edit Text Max Length control>
    var maxLength: Int = 99
    //</>

    //<Alignment Text>
    var alignmentText: Int = View.TEXT_ALIGNMENT_TEXT_START
    var alignmentDescription: Int = View.TEXT_ALIGNMENT_TEXT_END
    //</>

    //<InputType Edit Text>
    var inputTypeEditText: Int = InputType.TYPE_CLASS_TEXT //<-- This is general, but you can add any Type Text For your Edit Text
    //</>

    //<InputVisible Type>
    var visibilityDescription: Int = View.GONE
    var visibilityTitle: Int = View.VISIBLE
    var visibilityIcon: Int = View.GONE
    var visibilityCheck: Int = View.GONE
    var visibilityEditText: Int = View.GONE
    var visibilitySeparator: Int = View.VISIBLE
    var visibilityStyleEdit: Int = View.GONE
    var VisibilitContentCheck: Int = View.GONE
    var imageContentEnable: Int = View.GONE
    var imageContentEnable2: Int = View.VISIBLE
    //</>

    //<Gravity Type>
    var gravityTitle: Int = Gravity.LEFT
    var universalContentGravity: Int = Gravity.CENTER
    //</>

    //<Endable>
    var isEndableImageSelected: Boolean = true
    //</>

    //<Img Content>
    var imageSelected: Int = R.drawable.negative
    //</>

    //<Img Checked>
    var imageCheckedSelected: Int = R.drawable.success
    var imageCheckedDiselected: Int = R.drawable.negative
    //</>

    constructor(type: Int){

          when (type) {

             ROW_CHECK -> {

                this.iconText = "check"
                this.isAvailable = false
                this.titleSize = 14.0f

                 this.visibilityTitle = View.GONE
                 this.visibilityDescription = View.VISIBLE
                 this.VisibilitContentCheck = View.VISIBLE
                 this.imageContentEnable = View.VISIBLE
                 this.imageContentEnable2 = View.GONE
                 this.type = typeRow.ROW_CHECK
                 this.alignmentDescription = View.TEXT_ALIGNMENT_TEXT_START
            }


              ROW_SINGLE_CHECK_LIST ->{

                  this.isSingleList = true
                  this.VisibilitContentCheck = View.VISIBLE
                  this.visibilityDescription = View.VISIBLE
                  //this.imageContentEnable = View.VISIBLE
                  //this.imageContentEnable2 = View.GONE
                  this.imageSelected = R.drawable.right_arrow
                  this.alignmentDescription = View.TEXT_ALIGNMENT_TEXT_END
                  this.isEndableImageSelected = false
                  this.activity = SelectActivity::class.java
                  this.type = typeRow.ROW_SINGLE_CHECK_LIST

              }

              ROW_MULTIPLE_CHECK_LIST ->{

                  this.isSingleList = false
                  this.VisibilitContentCheck = View.VISIBLE
                  this.visibilityDescription = View.VISIBLE
                  this.imageSelected = R.drawable.right_arrow
                  this.alignmentDescription = View.TEXT_ALIGNMENT_TEXT_END
                  this.isEndableImageSelected = false
                  this.activity = SelectActivity::class.java
                  this.type = typeRow.ROW_MULTIPLE_CHECK_LIST
              }

              ROW_CHECK_TITLE -> {

                this.iconText = "check"
                this.isAvailable = false
                this.visibilityDescription = View.VISIBLE
                this.visibilityCheck = View.VISIBLE
                this.type = typeRow.ROW_CHECK_TITLE
            }

            ROW_TITLE -> {

                this.visibilityTitle = View.VISIBLE
                this.visibilitySeparator = View.GONE
                this.visibilityDescription = View.GONE
                this.titleColor = GREEN

                this.universalContentGravity = Gravity.LEFT

               this.contentMarginTop = 15
               this.contentPaddingLeft = 10
               this.contentPaddingRigth = 10
               this.contentPaddingTop = 10

               this.type = typeRow.ROW_TITLE

            }

              ROW_CALENDAR_HOUR -> {

                  this.visibilityTitle = View.VISIBLE
                  this.VisibilitContentCheck = View.VISIBLE
                  this.visibilityDescription = View.VISIBLE
                  this.imageSelected = R.drawable.right_arrow
                  this.isEndableImageSelected = false
                  this.activity = CalendarActivity::class.java
                  this.type = typeRow.ROW_CALENDAR_HOUR

              }

              ROW_CALENDAR -> {

                  this.visibilityTitle = View.VISIBLE
                  this.VisibilitContentCheck = View.VISIBLE
                  this.visibilityDescription = View.VISIBLE
                  this.imageSelected = R.drawable.right_arrow
                  this.isEndableImageSelected = false
                  this.activity = Calendar_H_Activity::class.java
                  this.type = typeRow.ROW_CALENDAR_DAY
              }

             ROW_EDIT -> {

                this.type = typeRow.ROW_EDIT
                this.visibilityDescription = View.GONE
                this.visibilityEditText = View.VISIBLE
                this.isAvailable = true
                this.visibilityDescription = View.GONE
                this.visibilityEditText = View.VISIBLE
                this.visibilityStyleEdit = View.VISIBLE
                this.visibilityIcon = View.GONE
                this.visibilityTitle = View.GONE

            }

             ROW_ACTIVITY -> {

                this.visibilityTitle = View.VISIBLE
                this.VisibilitContentCheck = View.VISIBLE
                this.imageSelected = R.drawable.right_arrow
                this.isEndableImageSelected = false
                this.type = typeRow.ROW_ACTIVITY
            }

              ROW_COMMENT -> {

                this.visibilityIcon = View.VISIBLE
                this.visibilityTitle = View.VISIBLE
                this.visibilityDescription = View.VISIBLE

                this.type = typeRow.ROW_COMMENT

            }

              ROW_DIALOG_CO ->{

                this.visibilityIcon = View.VISIBLE
                this.visibilityTitle = View.VISIBLE

                this.type = typeRow.ROW_DIALOG_CO
            }

              ROW_INFO ->{

                  this.visibilityDescription = View.VISIBLE
                  this.type = typeRow.ROW_INFO
              }


            else -> {
                print("x is neither 1 nor 2")
            }
        }

    }

    enum class typeRow {
        ROW_BASIC,
        ROW_TITLE,
        ROW_DESCRIPTION,
        ROW_ACTIVITY,
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
        ROW_CALENDAR_DAY
    }
}