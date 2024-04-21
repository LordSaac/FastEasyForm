package com.creativity.dev.formsimple.model.Utils

import androidx.compose.ui.graphics.Color
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.utils.TimerHelper
class SwitchJG {

    var active: Boolean = false

    var color: ColorSwitch = ColorSwitch()

}

class ColorSwitch{

    var thumbTintList: Int = R.color.colorRed
    var trackTintList: Int = R.color.colorBlack

}