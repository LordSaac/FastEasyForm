package com.creativity.dev.formsimple.model

import androidx.compose.ui.graphics.Color
import com.creativity.dev.formsimple.BuilderForms
import com.creativity.dev.formsimple.R
import java.io.Serializable


class Select : Serializable{

    var tag: String   = ""
    var text: String = ""
    var color: Int = R.color.colorBlack
    var check: Boolean = false
    var darkModeOn: Boolean = false
    var setImage: ImageCheck = ImageCheck()

    constructor(tag: String, text: String, check: Boolean) {

        this.tag = tag

        this.text = text

        this.check = check

    }

    constructor(text: String, check: Boolean,icon: Int) {

        this.text = text

        this.check = check

        this.setImage.customIconResId = icon

    }

    constructor(text: String, icon: Int) {

        this.text = text

        this.setImage.customIconResId = icon

    }

    constructor(text: String, check: Boolean) {

        this.text = text

        this.check = check

    }

    constructor(text: String) {

        this.text = text

        this.check = false

        this.tag = ""

    }

    constructor(){

        if(BuilderForms.darkModeOn){

            this.color = R.color.colorWhite

        }

    }
}

class ImageCheck: Serializable{

    var selectedIconResId: Int = R.drawable.check_2

    var didSelectedIconResId: Int = R.drawable.stop

    var customIconResId: Int = 0

    var size:SizeB = SizeB()

}

class SizeB: Serializable{

    var iconHeight: Int = 100

    var iconWidth: Int = 100

}