package com.creativity.dev.formsimple.model.Utils

import android.text.InputType

class EditText {

    var isEditable: Boolean = true
    var inputTypeEditText: Int = InputType.TYPE_CLASS_TEXT //<-- This is general, but you can add any Type Text For your Edit Text
    //<InputType Edit Text Max Length control>
    var maxLength: Int = 99
    //</>

}