package com.creativity.dev.formsimple.adapter.forms.Interfaces

import com.creativity.dev.formsimple.model.ResponseFormsIGB

interface DynamicListAdapterI {

  fun validateAll():Boolean
  fun validateByTag(tag: String):Boolean
  fun getResultByTag(tag: String): ResponseFormsIGB
  fun getResults(tag: String): List<ResponseFormsIGB>
  fun updateRow(tagOrTitle: String,objRespIGB: ResponseFormsIGB): Boolean
  fun eventChecked(isSelected: Boolean , position: Int):Int
  fun getResultAll():ArrayList<ResponseFormsIGB>
  fun startProgressView(tag: String): Boolean
  fun finishProgressView(tag: String): Boolean

}