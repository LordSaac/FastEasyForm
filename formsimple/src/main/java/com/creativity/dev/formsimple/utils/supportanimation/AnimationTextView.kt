package com.jgb.lordsaac.igb.supportanimation

import android.content.Context
import android.view.animation.AnimationUtils
import android.widget.EditText
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.widget.TextView
import com.creativity.dev.formsimple.R

/**
 * Created by jgutierrez on 3/19/2018.
 */
class AnimationTextView {

    companion object {

        private val vibrate: Int = R.anim.vibration_animation
       // var originalColorText: Int = 0

        fun animateVibrationET(edt: EditText, context: Context){

            val fadeOutAndroidAnimation = AnimationUtils.loadAnimation(context, vibrate)

            edt.startAnimation(fadeOutAndroidAnimation)
            edt.setTextColor(context.resources.getColor(R.color.colorRed))

            edt.animate()
                    .alpha(1f)
                    .setDuration(500)
                    .setListener(object : AnimatorListenerAdapter() {

                        override fun onAnimationEnd(animation: Animator) {
                            edt.setTextColor(context.resources.getColor(R.color.colorTextGray))
                        }
                    })

        }

        fun animateVibrationPersonalizeTV(edt: TextView, context: Context,duration: Long,colorVibrate: Int, colorFinal: Int){
            val fadeOutAndroidAnimation = AnimationUtils.loadAnimation(context, vibrate)

            edt.startAnimation(fadeOutAndroidAnimation)
            edt.setTextColor(colorVibrate)

            edt.animate()
                    .alpha(1f)
                    .setDuration(duration)
                    .setListener(object : AnimatorListenerAdapter() {
                        override fun onAnimationEnd(animation: Animator) {
                            edt.setTextColor(colorFinal)
                        }
                    })

        }

        fun animateVibrationTV(edt: TextView, context: Context){
            val fadeOutAndroidAnimation = AnimationUtils.loadAnimation(context, vibrate)
            val originalColorText = edt.currentTextColor

            edt.startAnimation(fadeOutAndroidAnimation)
            edt.setTextColor(context.getResources().getColor(R.color.colorRed))

            edt.animate()
                    .alpha(1f)
                    .setDuration(500)
                    .setListener(object : AnimatorListenerAdapter() {
                        override fun onAnimationEnd(animation: Animator) {
                            edt.setTextColor(originalColorText)
                        }
                    })
        }
    }

}