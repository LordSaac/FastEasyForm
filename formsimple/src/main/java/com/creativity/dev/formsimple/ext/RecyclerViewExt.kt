package com.creativity.dev.formsimple.ext

import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView

// Define a function to scroll with animation
fun RecyclerView.scrollToPositionWithAnimation(targetPosition: Int) {
    val smoothScroller = object : LinearSmoothScroller(context) {
        override fun getVerticalSnapPreference(): Int {
            return SNAP_TO_START // Change this to SNAP_TO_END or SNAP_TO_START as needed
        }
    }
    smoothScroller.targetPosition = targetPosition
    layoutManager?.startSmoothScroll(smoothScroller)
}