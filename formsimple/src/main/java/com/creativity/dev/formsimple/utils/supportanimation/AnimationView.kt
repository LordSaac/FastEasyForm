package com.jgb.lordsaac.igb.supportanimation

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Context
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.RadioButton
import com.creativity.dev.formsimple.R


/**
 * Created by jgutierrez on 3/23/2018.
 */

class AnimationView{

    companion object {

        private val vibrate: Int = R.anim.vibration_animation;

        fun animationCheck(v: View, mContext:Context){
            val myAnim = AnimationUtils.loadAnimation(mContext, R.anim.anim_checked)
            v.animation = myAnim
            v.startAnimation(myAnim)
        }

        fun animationOut(v: View, mContext:Context){
            val myAnim = AnimationUtils.loadAnimation(mContext, R.anim.anim_out)
            v.animation = myAnim
            v.startAnimation(myAnim)
        }

        fun animationScaleUp(v: View, mContext:Context){
            val myAnim = AnimationUtils.loadAnimation(mContext, R.anim.scale_up)
            v.animation = myAnim
            v.startAnimation(myAnim)
        }

        fun animationScaleDown(v: View, mContext:Context){
            val myAnim = AnimationUtils.loadAnimation(mContext, R.anim.scale_down)
            v.animation = myAnim
            v.startAnimation(myAnim)
        }

        fun animationLeftToRigth(v: View, mContext:Context){
            val myAnim = AnimationUtils.loadAnimation(mContext, R.anim.animation_left_to_rigth)
            v.animation = myAnim
            v.startAnimation(myAnim)
        }

        fun animationViewOut(v: View, mContext:Context,isGone: Boolean){
            val fadeOutAndroidAnimation = AnimationUtils.loadAnimation(mContext,R.anim.anim_out)

            v.startAnimation(fadeOutAndroidAnimation)

            v.animate()
                    .alpha(1f)
                    .setDuration(500)
                    .setListener(object : AnimatorListenerAdapter() {
                        override fun onAnimationEnd(animation: Animator) {

                        }
                    })
        }

        fun animateVibrationRadioButton(edt: RadioButton, context: Context){
            val fadeOutAndroidAnimation = AnimationUtils.loadAnimation(context, vibrate)

            edt.startAnimation(fadeOutAndroidAnimation)
            edt.setTextColor(context.getResources().getColor(R.color.colorRed))

            edt.animate()
                    .alpha(1f)
                    .setDuration(500)
                    .setListener(object : AnimatorListenerAdapter() {
                        override fun onAnimationEnd(animation: Animator) {
                            edt.setTextColor(context.getResources().getColor(R.color.colorBlack))
                        }
                    })

        }



    }
}