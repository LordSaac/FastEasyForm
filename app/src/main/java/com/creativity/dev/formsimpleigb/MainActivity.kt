package com.creativity.dev.formsimpleigb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.text.InputType
import android.view.View
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.Select
import com.example.dreamteach.listselectdinamic.IGBDynamicList.InitListDynamicIGB.Companion.SimpleFormsIGB
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.model.ResponseFormsIGB
import com.creativity.dev.formsimple.model.SetRow
import com.creativity.dev.formsimple.types.*
import com.example.dreamteach.listselectdinamic.IGBDynamicList.initListDynamic
import com.example.dreamteach.listselectdinamic.utils.AlertDialogManager
import kotlinx.android.synthetic.main.activity_main.*


const val tagSex:String = "tagSex"
const val tagFoodList:String = "tagFoodList"
const val tagEditAge:String = "editAge"
const val tagCheck:String = "check1993"

class MainActivity : AppCompatActivity(), FormsListenerIGB {

    private var myList: ArrayList<Select> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..10) {
            val obj = Select()

            obj.check = false
            obj.tag = "index" + i
            obj.text = "System control for automatic fireball"

            myList.add(obj)
        }

        init()
    }


    private fun init(){

        Row(ROW_TITLE){ // <--- Add Title

            title = "Select Activity" //<--- add your title name
            titleColor = ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark) // <--- Add any colors for title

        }

        Row(ROW_ACTIVITY){ // <-- Here Call Any activity
            title = "Test Activity #1"//<-- title .
            activity = ExampleActivity::class.java // <-- Add your activity
        }

        Row(ROW_ACTIVITY){
            title = "Test Activity #1"// title row.
            activity = ExampleActivity::class.java // <-- Add your activity

        }

        Row(ROW_TITLE){

            title = "Food List"
            titleColor = ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark)

        }

        Row(ROW_MULTIPLE_CHECK_LIST){

            title = "Menu" // Add title

            for (i in 1..10) {
                options.add(Select(i.toString() + ") System control for automatic fireball")) // Simple list
            }

            colorBackgroundToolbar = ContextCompat.getColor(applicationContext, R.color.colorPrimary) // // Add color in the toolbar (OPTIONAL but RECOMENDABLE)

        }

        Row(ROW_MULTIPLE_CHECK_LIST){
            tag = tagFoodList // <---  tag for identification of the row
            title = "Salad"   // <---  Your title
            // Personalize your message empty
            emptyMessages = "No encontre nada tio!" // Your message for empty list (OPTIONAL)
            imageEmpty = R.drawable.empty_example   // Add an image for empty list (OPTIONAL)

            colorBackgroundToolbar = ContextCompat.getColor(applicationContext, R.color.colorPrimary) // Add color in the toolbar (OPTIONAL but RECOMENDABLE)
        }

        Row(ROW_TITLE){

            title = "Questions"
            titleColor = ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark)

        }

        Row(ROW_CHECK){

            text= "Do you like job?" // Add text for the text
            tag = tagCheck //tag for identification of the row
            checked = false // Initialize check in false or true

        }

        Row(ROW_CHECK){

            text= "Do you like this librery?" // Add text fot he text
            checked = false // Initialize check in false or true

        }

        Row(ROW_CHECK){

            text= "Is really easy?" // Add text fot he text
            checked = true  // Initialize check in false or true

        }

        Row(ROW_TITLE){
            title = "Information User"
            titleColor = ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark)
        }

        Row(ROW_EDIT){

            title = "Correo Electronico"// title row.
            text= "jose19.26@hotmail.com"// short description.
            inputTypeEditText = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS //  To choose type EDITTEXT (https://developer.android.com/reference/android/widget/EditText)

        }

        Row(ROW_EDIT){
            title = "Firts Name" // Add only text, but the text edit type is default
        }

        Row(ROW_EDIT){

            title = "Lastname" // Add only text, but the text edit type is default
          ///  emptyMessages = "Please insert lastname"
            validation = true  // Add it is you want validate this row

        }

        Row(ROW_EDIT){

            title = "Phone"// title row.
            inputTypeEditText = InputType.TYPE_CLASS_PHONE //  To choose type EDITTEXT (https://developer.android.com/reference/android/widget/EditText)
        }

        Row(ROW_EDIT){

            tag =  tagEditAge
            title = "Age"
            maxLength = 2
            inputTypeEditText = InputType.TYPE_CLASS_NUMBER
            //emptyMessages = "00"
            validation = true

        }

        Row(ROW_SINGLE_CHECK_LIST){

            tag = tagSex
            title = "Sex"

            options.add(Select("Male",R.drawable.nin))
            options.add(Select("Female",R.drawable.nin))

            validation = true
            colorBackgroundToolbar = ContextCompat.getColor(applicationContext,R.color.colorPrimary)

        }

        Row(ROW_SINGLE_CHECK_LIST){

            title = "Options"

            options.add(Select("Option #1",false,R.drawable.nin))
            options.add(Select("Option #2",true,R.drawable.nin))

            text = "Option #2"

            backgroundContent = R.drawable.jdjs
            validation = true
            colorBackgroundToolbar = ContextCompat.getColor(applicationContext, R.color.colorPrimary)

        }

        Row(ROW_CALENDAR_HOUR){

            title = "Hour Begin"
            tag = "joder1"
            validation = true
            colorBackgroundToolbar = ContextCompat.getColor(applicationContext, R.color.colorPrimary)

        }

        Row(ROW_CALENDAR){

            title = "Select Date"
            tag = "joder2"
            validation = true
            colorBackgroundToolbar = ContextCompat.getColor(applicationContext, R.color.colorPrimary)
            backgroundContent = R.drawable.jdt

        }

        Row(ROW_CALENDAR_HOUR){

            title = "Hour End"
            validation = true
            colorBackgroundToolbar = ContextCompat.getColor(applicationContext,  R.color.colorPrimary)
            backgroundContent = R.drawable.jdjs

        }

        Row(ROW_TITLE){

            title = "Information App"
            alignmentText = View.TEXT_ALIGNMENT_TEXT_END
            titleColor = ContextCompat.getColor(applicationContext, R.color.colorPrimaryDark)

        }

        Row(ROW_INFO){

            title = "Version"// title row.
            validation = true
            text= "1.0.2"

        }

        Row(ROW_INFO){

            title = "Date"// title row.
            validation = true
            text= "Released December 26, 2018"

        }

        Row(ROW_INFO){
            title = "Licence"// title row.
            text= "Copyright 2018 Isaac G. Banda"
        }

        rv_main.initListDynamic() //Here initialize your recycler view
    }

    fun clickEvent(view: View){
        val validate = SimpleFormsIGB.validationForms()  // Validate rows, here validate only one rows where added attribute VALIDATION
        var str: String

        if(validate){ // validate rows
            str =  SimpleFormsIGB.Result(tagEditAge).text // Getting text , using tags identifications
           AlertDialogManager.simpleAlerts(this,"Alert",str)
       }
    }

    override fun FormsListenerResponse(obj: ResponseFormsIGB) {

        if(obj.tag.equals(tagSex) && obj.text.length > 0 ){

            AlertDialogManager.simpleAlerts(this,"Alert","Hello")
            SimpleFormsIGB.UpdateRow(tagCheck, SetRow {checked = true})
        }

    }

}
