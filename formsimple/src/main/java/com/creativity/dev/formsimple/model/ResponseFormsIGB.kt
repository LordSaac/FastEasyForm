package com.creativity.dev.formsimple.model

import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.types.ROW_CHECK
import java.io.Serializable
import java.util.Date


class ResponseFormsIGB:Serializable{

    //<Identifier>
    var tag: String = ""
    var position: Int = 0
    var date: Date = Date()
    //</>

    //<Content>
    var text: String = ""
    var desc: String = ""
    var title: String = ""
    var bubble: String = ""
    var checked: Boolean = false
    var swtichActive: Boolean = false
    var iconArrow: Int = R.drawable.right_arrow
    var iconSelected: Int = R.drawable.success
    var options: ArrayList<Select> = ArrayList()
    lateinit var type: ListDynamic.TypeRow
    //</>
}

inline fun SetRow(obj: ResponseFormsIGB.() -> Unit): ResponseFormsIGB {

    val newList = ResponseFormsIGB()

    newList.obj()

    return newList
}