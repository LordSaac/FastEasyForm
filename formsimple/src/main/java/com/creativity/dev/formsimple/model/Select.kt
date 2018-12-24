package com.creativity.dev.formsimple.model

import java.io.Serializable


class Select : Serializable{

    var tag: String   = ""
    var text: String = ""
    var check: Boolean = false
    var iconResource: Int = 0

    constructor(tag: String, text: String, check: Boolean) {
        this.tag = tag
        this.text = text
        this.check = check
    }

    constructor(text: String, iconResource: Int) {
        this.text = text
        this.iconResource = iconResource
    }

    constructor(text: String, check: Boolean,iconResource: Int) {
        this.text = text
        this.check = check
        this.iconResource = iconResource

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

    constructor()
}