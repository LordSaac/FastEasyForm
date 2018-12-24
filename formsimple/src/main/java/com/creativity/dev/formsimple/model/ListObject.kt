package com.creativity.dev.formsimple.model

import com.creativity.dev.formsimple.interfaces.EventList
import java.io.Serializable


class ListObject: Serializable{

     var title: String = ""
    var emptyMessage: String = ""

     var isSingle: Boolean = false

     var colorToolbar: Int = 0
     var colorTitleToolbar: Int = 0
     var backgroundContent: Int = 0
     var imageEmpty: Int = 0

     var list: ArrayList<Select> = ArrayList()

    companion object {
           lateinit var eventList  : EventList
    }

}