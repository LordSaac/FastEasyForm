package com.creativity.dev.formsimple.model

import androidx.compose.ui.graphics.Color
import com.creativity.dev.formsimple.BuilderForms
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.interfaces.EventList
import java.io.Serializable


class ListObject(darkMode: Boolean) : Serializable{

     var title: String = ""
     var titleToolbar = ""
     var emptyMessage: String = ""
     var darkMode: Boolean = darkMode

     var isSingle: Boolean = false

     var titleSize: Float = 20.0f

     var btnTitle: String = "Finish"

     var colorToolbar: Int = 0

     var colorTitleToolbar: Int = 0

     var backgroundContent: Int = 0

     var imageEmpty: Int = 0

     var activeBtnFinish: Boolean = true

     var activeBtnCheck: Boolean = true

     var btnTitleColor: Int =  android.graphics.Color.BLACK

     var titleColor: Int = android.graphics.Color.BLACK

     var list: ArrayList<Select> = ArrayList()

     init {

          if(this.darkMode){

                this.btnTitleColor = R.color.colorWhite

                this.titleColor = android.graphics.Color.WHITE

               this.backgroundContent = R.color.colorBlack

          }

     }

    companion object {

        lateinit var eventList  : EventList

    }

}