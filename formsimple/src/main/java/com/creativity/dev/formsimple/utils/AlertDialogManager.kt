package com.example.dreamteach.listselectdinamic.utils

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.creativity.dev.formsimple.R
import com.creativity.dev.formsimple.interfaces.DelegateDialogAlert

class AlertDialogManager{

    var mContext: Context
    var delegate: DelegateDialogAlert

    constructor(mContext: Context, delegate: DelegateDialogAlert){
        this.mContext = mContext
        this.delegate = delegate
    }

    fun alertComment(str: String,mContext: Context) {

    val factory = LayoutInflater.from(mContext)
    val deleteDialogView = factory.inflate(R.layout.dialog_comment, null)
    val deleteDialog = AlertDialog.Builder(mContext, R.style.DialogTheme).create()
    val text: TextView = deleteDialogView.findViewById(R.id.edt_dialog_cmt)
    deleteDialog.setView(deleteDialogView)
    deleteDialog.setCancelable(false)

    if (!str.isEmpty())
        text.setText(str)

    deleteDialogView.findViewById<Button>(R.id.btn_cancel_cmt).setOnClickListener(View.OnClickListener {
        //your business logic
        deleteDialog.dismiss()
    })
    deleteDialogView.findViewById<Button>(R.id.btn_accept_cmt).setOnClickListener(View.OnClickListener {
        delegate.getDataResponse(text.text.toString())
        deleteDialog.dismiss()
    })

    deleteDialog.show()
   }

    companion object {
        fun simpleAlerts(context: Context, title: String, sms:String){

            val alertDialog = AlertDialog.Builder(context).create()

            alertDialog.setTitle(title)
            alertDialog.setMessage("\n"+sms)
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
            alertDialog.show()
        }
    }
}
