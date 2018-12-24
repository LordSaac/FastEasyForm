package com.creativity.dev.formsimple.model

import com.creativity.dev.formsimple.FireLinkList
import com.creativity.dev.formsimple.types.ROW_CHECK
import java.io.Serializable


class ResponseFormsIGB:Serializable{

    //<Identifier>
    var tag: String = ""
    var position: Int = 0
    //</>

    //<Content>
    var text: String = ""
    var checked: Boolean = false
    var options: ArrayList<Select> = ArrayList()
    lateinit  var type: ListDynamic.typeRow
    //</>
}

inline fun SetRow(obj: ResponseFormsIGB.() -> Unit): ResponseFormsIGB {
    val newList = ResponseFormsIGB()
    newList.obj()
    return newList
}