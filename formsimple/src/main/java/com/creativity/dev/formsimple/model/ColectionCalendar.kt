package com.creativity.dev.formsimple.model

import java.io.Serializable
import java.util.*


class ColectionCalendar:Serializable{

    var title: String = ""
    var text: String = ""
    var format: String = ""
    var colorToolbar: Int = 0
    var colorTitleToolbar: Int = 0
    var background: Int = 0
    var styleContentHour: Int = 0
    var listDate: List<Date> = ArrayList()

}