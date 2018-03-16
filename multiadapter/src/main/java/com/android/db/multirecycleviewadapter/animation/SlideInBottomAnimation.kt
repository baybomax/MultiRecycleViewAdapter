package com.android.db.multirecycleviewadapter.animation

import android.animation.Animator
import android.animation.ObjectAnimator
import android.view.View

/**
 * Slide in bottom animation
 *
 * Created by DengBo on 14/03/2018.
 */

class SlideInBottomAnimation: BaseAnimation {

    override fun getAnimators(view: View): Array<Animator> {
        return arrayOf(
                ObjectAnimator.ofFloat(view, "translationY", view.measuredHeight.toFloat(), 0f)
        )
    }

}
