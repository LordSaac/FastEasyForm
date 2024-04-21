package com.creativity.dev.formsimple.model.Utils

import android.graphics.drawable.Drawable
import com.creativity.dev.formsimple.BuilderForms
import com.creativity.dev.formsimple.R

class Container {

    var background: Int = R.drawable.background_light_normal

    var mainBackground: Int = R.color.transparent

    var padding : Content = Content()

    var margin : Content = Content()

    var elevation: Float = 15f

    var radio: Float = 10f
    init {

        // Pedding

        padding.bottom = 0

        padding.left = 20

        padding.rigth = 0

        padding.top = 0

        // Margin

        margin.bottom = 0

        margin.left = 25

        margin.rigth = 25

        margin.top = 0

        if(BuilderForms.darkModeOn){

            mainBackground = R.color.colorBlack

        }

    }

}

