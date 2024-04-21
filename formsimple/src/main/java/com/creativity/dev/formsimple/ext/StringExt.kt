package com.creativity.dev.formsimple.ext

fun String.limitAndAppendEllipsis(maxLength: Int): String {
    return if (this.length <= maxLength) {
        "$this..."
    } else {
        this.substring(0, maxLength - 3) + "..."
    }
}