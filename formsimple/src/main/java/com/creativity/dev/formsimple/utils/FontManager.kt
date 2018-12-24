package com.creativity.dev.formsimple.utils

/**
 * Created by jgutierrez on 3/22/2018.
 */
class FontManager{

    companion object {

        private val ruteFont: String = "fonts/"
        private val typeFont :String = ".ttf"

        private val fontAwesome: String = "fontawesome-webfont"
        private val fontAwesomeRegular: String = "fa-regular-400"
        private val fontAwesomeSolid: String = "fa-solid-900"
        private val fontAwesomeBrands: String = "fa-brands-400"

        val fontList: String = "\uF46D"
        val fontDownload:String = "\uF381"
        val fontEndDay :String= "\uF0C7"
        val fontLogOut :String= "\uF2F5"
        val fontInventory :String= "\uF466"
        val fontSettings :String= "\uF085"
        val fontSupport :String= "\uF0ad"
        val fontChevronRight: String = "\uF054"
        val fontChange: String = "\uF362"
        val fontWarning: String = "\uF071"
        val fontBack: String = "\uF359"
        val fontInstal: String = "\uF0ad"
        val fontListConstans: String = "\uF46d"
        val fontChain: String = "\uF0c1"
        val fontNotch: String = "\uF1ce"
        val fontPlus: String = "\uF055"
        val fontBriefCase: String = "\uF0b1"
        val fontCamera: String = "\uF030"
        val fontsend: String = "\uF1d8"
        val fontExclametion: String = "\uF06a"
        val fontCheckReady: String = "\uF058"
        val fontMine: String = "\uF056"
        val fontFolder: String =  "\uF07c"
        val fontDownloadRow = "\uF019"
        val fontEdit = "\uF044"
        val fontErase = "\uF2ed"
        val fontDelete = "\uF057"
        val fontLocation = "\uF3c5"
        val fontIdCard = "\uF2c2"
        val fontBasicCheck = "\uF00c"

        fun getRuteFASolid():String{
            return ruteFont + fontAwesomeSolid + typeFont
        }
    }
}