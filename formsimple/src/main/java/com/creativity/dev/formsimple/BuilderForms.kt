package com.creativity.dev.formsimple

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.model.ListDynamic
import com.creativity.dev.formsimple.model.Select
import com.creativity.dev.formsimple.types.ROW_CHECK
import com.creativity.dev.formsimple.types.ROW_EDIT
import com.creativity.dev.formsimple.types.ROW_TITLE
import com.creativity.dev.formsimple.types.uiMode
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyFastForm
import java.io.Serializable

//Autor: José I. Gutiérrez B.
//Year: 2018

class BuilderForms:Serializable{

    companion object {

        var list: ArrayList<ListDynamic> = ArrayList()

        var options: java.util.ArrayList<Select> = ArrayList()

        var darkModeOn: Boolean = false

    }

}

class ModelForm(context: Context):Serializable{

    var mode : uiMode = uiMode.light

    lateinit var container : RecyclerView

    private var mContext = context
    fun Body(body: () -> Unit) {

        BuilderForms.darkModeOn = if(mode == uiMode.light) false else if(mode == uiMode.dark) true else this.isDarkTheme()

        body()

    }

    private fun isDarkTheme(): Boolean {

        return mContext.resources.configuration.uiMode and
                Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES

    }

}

class ModelSection:Serializable{

    var title : String = ""

    var description : String = ""

    fun Content(content: () -> Unit) {

        Row(ROW_TITLE) {

            setText.title = title

            setText.descriptionBottom = description

        }

        content()

    }

}

inline  fun Section(obj: ModelSection.() -> Unit) {

    val newForm = ModelSection()

    newForm.obj()

}


inline  fun BuildForm(mContext: Context, obj: ModelForm.() -> Unit): EasyFastForm {

    val newForm = ModelForm(context = mContext)

        newForm.obj()

    val easy =  EasyFastForm(mContext)

        easy.start(newForm.container)

  return easy

}


// The primary purpose of using Unit as the return type of a function is to indicate that the function doesn't return any meaningful result or value. Here are some common scenarios where you might use Unit:
inline fun Row(type: Int, obj: ListDynamic.() -> Unit): ListDynamic {

    // Initialize the model object
    val newList = ListDynamic(type)

    // Initialize the obj into the object.
    newList.obj()

    // Set image if the rows is type check.
    if(newList.checked && type == ROW_CHECK)
        newList.setImage.selected = newList.setImage.checkedSelected

    newList.setVisibility.descriptionBottom = if(newList.setText.descriptionBottom.isEmpty()) View.GONE else View.VISIBLE

    newList.setVisibility.title = if(newList.setText.title.isEmpty()) View.GONE else View.VISIBLE

    newList.setVisibility.iconLeft = if(newList.setImage.iconLeft == 0) View.GONE else View.VISIBLE

    newList.setVisibility.bubble = if(newList.setText.bubble.isEmpty()) View.GONE else View.VISIBLE

    BuilderForms.list.add(newList)

    return newList
}

inline fun option(obj: Select.() -> Unit) {

    // Initialize the model object
    val newList = Select()

    // Initialize the obj into the object.
    newList.obj()

    BuilderForms.options.add(newList)

}