package com.creativity.dev.formsimple.model



 interface  CollectionsInline{

   // inline fun <T> T.apply(block: T.() -> Unit): T (source)
}

inline fun repeat(times: Int, action: (Int) -> Unit) {}
