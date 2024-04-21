package com.creativity.dev.formsimple.model.Utils

class Size {

    var title: Float = 16.0f
    var description: Float = 14.0f
    var descriptionBottom: Float = 13.0f
    var letter: Float = 18.0f
    var bubble: Float = 9.0f
    var editText: Float = 14.0f
    var icon: Float = 14.0f
    var row: RowS = RowS()
    var layout: Layouts = Layouts()
    var iconLeft: IconLeft = IconLeft()
}

class RowS{

    var heigth: Float = 0.055f //<-- Original size
    var margintTop: Float = 0.0f //<-- Original size

}

class Layouts{

    var hight = 120

}

class IconLeft{

    var hight = 50

    var width = 50

}