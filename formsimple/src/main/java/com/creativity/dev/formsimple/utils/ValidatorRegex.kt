package com.creativity.dev.formsimple.utils

import android.util.Patterns
class EFFValidatorRegex {
    companion object {

        fun isCorrect(rule: String, str: String): Boolean{

            val pattern = Regex(rule)

            return  pattern.matches(str)

        }

    }

}