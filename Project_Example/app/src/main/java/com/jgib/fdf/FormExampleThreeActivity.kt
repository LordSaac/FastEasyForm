package com.jgib.fdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.option
import com.creativity.dev.formsimple.types.ROW_CALENDAR
import com.creativity.dev.formsimple.types.ROW_CHECK
import com.creativity.dev.formsimple.types.ROW_EDIT
import com.creativity.dev.formsimple.types.ROW_SINGLE_CHECK_LIST
import com.creativity.dev.formsimple.types.ROW_TITLE
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyForm
import com.jgib.fdf.R

class FormExampleThreeActivity : AppCompatActivity() {

    private lateinit var rv_main: RecyclerView // Add RecyclerView into xml
    private val context = this
    private lateinit var easyForm: EasyForm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_example_three)

        this.easyForm = EasyForm(this)

        this.rv_main = findViewById(R.id.rv_three)

        this.init()

    }

    private fun init() {
        easyForm.apply {

            Row(ROW_TITLE){ // <--- Add Title

                setText.title = "Personal Data" //<--- add your title name
                setSize.title = 24.0f
                setColor.title = ContextCompat.getColor(context, R.color.black) // <--- Add any colors for title
            }

            Row(ROW_EDIT) {
                setText.title = "Full Name"
                tag = "fullName"
            }

            Row(ROW_CALENDAR) {
                setText.title = "Date of Birth"
                tag = "dateOfBirth"
                validation = true
            }

            Row(ROW_EDIT) {
                setText.title = "Phone Number"
                tag = "phoneNumber"
                inputTypeEditText = InputType.TYPE_CLASS_PHONE
            }

            Row(ROW_EDIT) {
                setText.title = "Email Address"
                tag = "emailAddress"
                inputTypeEditText = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            }

            Row(ROW_EDIT) {
                setText.title = "Address"
                tag = "address"
            }

            Row(ROW_SINGLE_CHECK_LIST) {
                setText.title = "Marital Status"
                tag = "maritalStatus"

                checkList {
                    option { text = "Single" }
                    option { text = "Married" }
                    option { text = "Divorced" }
                    option { text = "Widowed" }
                    option { text = "Other" }
                }

                validation = true
            }

            Row(ROW_CHECK) {
                setText.text = "Do you have children?"
                tag = "hasChildren"
            }

            start(rv_main)
        }
    }

}