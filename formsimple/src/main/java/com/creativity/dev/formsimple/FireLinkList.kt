package com.creativity.dev.formsimple

import com.creativity.dev.formsimple.model.ListDynamic
import com.creativity.dev.formsimple.model.Select
import com.creativity.dev.formsimple.types.ROW_CHECK
import com.creativity.dev.formsimple.types.ROW_EDIT
import java.io.Serializable

//For my soon
class FireLinkList:Serializable{

    companion object {
        var list: ArrayList<ListDynamic> = ArrayList()
    }
}

inline fun Row(type: Int, obj: ListDynamic.() -> Unit): ListDynamic {
    val newList = ListDynamic(type)

    newList.obj()

    if(newList.checked && type == ROW_CHECK)
        newList.imageSelected = newList.imageCheckedSelected
    else if(type == ROW_EDIT && newList.maxLength != 99 ){

        var errorM = ""
        for (i in 1..newList.maxLength)
           errorM = errorM + "#"

        newList.emptyMessages = errorM
    }

    FireLinkList.list.add(newList)

    return newList
}