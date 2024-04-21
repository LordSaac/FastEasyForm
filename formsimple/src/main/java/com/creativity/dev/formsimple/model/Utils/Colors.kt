package com.creativity.dev.formsimple.model.Utils

import android.graphics.Color
import com.creativity.dev.formsimple.BuilderForms
import com.creativity.dev.formsimple.R

class Colors {

    var title:Int = Color.BLACK
    var description: Int = Color.GRAY
    var errorMessages: Int = Color.RED
    var descriptionBottom: Int = Color.GRAY
    var icon: Int = Color.LTGRAY
    var seperator: Int = Color.WHITE
    var circle: Int = Color.GREEN
    var letter: Int = Color.WHITE
    var edit: Int = Color.GRAY
    var defaultHintTextColor: Int = R.color.colorBlack
    var editStyle: Int = R.style.MyHintTextAppearance_Light
    var titleToolbar: Int = Color.WHITE
    var btnFinishSelect: Int = Color.BLACK
    var backgroundToolbar: Int = Color.rgb(101,185,102)
    var styleContentHour: Int =  R.style.picker_clock
    var backgroundContent: Int = 0
    var progressView: Int = Color.LTGRAY
    var imageEmpty: Int = R.drawable.empty_box
    var backgroundContentMain: Int = 0
    init {

        if(BuilderForms.darkModeOn){

            title = Color.WHITE

            edit = Color.GRAY

            btnFinishSelect = Color.WHITE

            backgroundContentMain = Color.BLACK

            defaultHintTextColor = R.color.colorWhite

            editStyle = R.style.MyHintTextAppearance_Dark

        }

    }

}