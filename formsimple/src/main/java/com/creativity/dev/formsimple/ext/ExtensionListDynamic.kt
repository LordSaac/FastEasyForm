package com.creativity.dev.formsimple.extensions

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import com.creativity.dev.formsimple.adapter.forms.DynamicListAdapter
import com.creativity.dev.formsimple.interfaces.EventListDynamic
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.adapter.options.SelectAdapter

// Save text into main list.
fun EditText.eventWriten(context: DynamicListAdapter.DynamicListHolder) {

    val textEdit: EditText = this
    var delegate: EventListDynamic

    textEdit.addTextChangedListener(object : TextWatcher {

        override fun onTextChanged(currentDigits: CharSequence, start: Int, before: Int, count: Int) {

            if (context is EventListDynamic) {
                delegate = context
                delegate.eventEdtiText(textEdit.text.toString())
            }
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            // This function is currently empty.
            // Depending on the context or requirements, logic related to handling
            // text changes in an EditText might be implemented here.
            // As of now, it does not contain

        }

        override fun afterTextChanged(edt: Editable) {
            // This function is currently empty.
            // Depending on the context or requirements, logic related to handling
            // text changes in an EditText might be implemented here.
            // As of now, it does not contain
        }

        })

//    textEdit.setOnEditorActionListener(object: TextView.OnEditorActionListener {
//        override fun onEditorAction(v:TextView, actionId:Int, event: KeyEvent?):Boolean {
//            if ((actionId == EditorInfo.IME_ACTION_SEARCH || actionId == EditorInfo.IME_ACTION_DONE || event != null &&
//            event!!.getAction() === KeyEvent.ACTION_DOWN &&
//            event!!.getKeyCode() === KeyEvent.KEYCODE_ENTER)) {
//                if (event == null || !event!!.isShiftPressed()) {
//                        // the user is done typing.
//
//                   return true // consume.
//                     }
//            }
//            return false // pass on to other listeners.
//             } })

}

fun LinearLayout.eventImageCheckBoxDynamic(context: DynamicListAdapter.DynamicListHolder, imageView: ImageView) {

    var delegate: EventListDynamic
    var isSelected = false
    var imageSelected: Int = 0
    val aplicationsContext = imageView.context

    this.setOnClickListener(object : View.OnClickListener {

        override fun onClick(v: View) {

            if (context is EventListDynamic) {

                delegate = context
                isSelected = delegate.getSelected()
                imageView.setImageDrawable(null)
                imageView.setImageResource(0)

                if(isSelected)
                   imageSelected = delegate.eventChecked(false)
                else
                   imageSelected = delegate.eventChecked(true)

                imageView.setBackgroundResource(imageSelected)
                val shake = AnimationUtils.loadAnimation(aplicationsContext, R.anim.zoom_in)
                //imageView.startAnimation(shake)

            }
        }
    })

}


fun LinearLayout.eventImageCheckBoxSelect(context: SelectAdapter.MyViewHolder, imageView: ImageView) {

    var delegate: EventListDynamic
    var isSelected = false
    var imageSelected: Int = 0
    val aplicationsContext = imageView.context

    this.setOnClickListener(object : View.OnClickListener {
        override fun onClick(v: View) {

            if (context is EventListDynamic) {

                delegate = context
                isSelected = delegate.getSelected()
                imageView.setImageDrawable(null)
                imageView.setImageResource(0)

                if(isSelected)
                    imageSelected = delegate.eventChecked(false)
                else
                    imageSelected = delegate.eventChecked(true)

                imageView.setBackgroundResource(imageSelected)
                val shake = AnimationUtils.loadAnimation(aplicationsContext, R.anim.zoom_in)
                // imageView.startAnimation(shake)

            }
        }
    })

}