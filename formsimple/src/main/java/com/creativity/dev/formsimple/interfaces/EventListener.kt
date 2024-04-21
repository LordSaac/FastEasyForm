package com.creativity.dev.formsimple.interfaces

 interface EventListDynamic{

     fun eventEdtiText(str: String)
     fun eventChecked(isSelected: Boolean): Int //<-- Return image check
     fun getSelected():Boolean

}