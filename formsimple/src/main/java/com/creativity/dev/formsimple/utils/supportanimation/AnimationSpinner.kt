package com.jgb.lordsaac.igb.supportanimation

import android.content.Context
import android.view.animation.AnimationUtils
import android.widget.Spinner
import com.creativity.dev.formsimple.R


/**
 * Created by jgutierrez on 3/19/2018.
 */


class AnimationSpinner{

    companion object {
        private val vibrate: Int = R.anim.vibration_animation;

        //<-- Todo Terminate set color Red -->
        fun animateVibration(obj: Spinner, context: Context){
            val fadeOutAndroidAnimation = AnimationUtils.loadAnimation(context, vibrate)
            obj.startAnimation(fadeOutAndroidAnimation)

//            obj.animate()
//                    .alpha(1f)
//                    .setDuration(500)
//                    .setListener(object : AnimatorListenerAdapter() {
//                        override fun onAnimationEnd(animation: Animator) {
//                            //obj.text1.setTextColor(context.getResources().getColor(R.color.colorTextGray))
//                        }
//                    })
        }
    }
}