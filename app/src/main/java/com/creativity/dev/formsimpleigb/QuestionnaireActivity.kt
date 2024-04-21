package com.creativity.dev.formsimpleigb

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.compose.ui.tooling.preview.UiMode
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.BuildForm
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.Section
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.ListDynamic
import com.creativity.dev.formsimple.model.ResponseFormsIGB
import com.creativity.dev.formsimple.option
import com.creativity.dev.formsimple.types.RType
import com.creativity.dev.formsimple.types.uiMode
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyFastForm

class QuestionnaireActivity : AppCompatActivity(), FormsListenerIGB {

    private lateinit var my_contiener: RecyclerView // Add RecyclerView into xml

    private lateinit var easyFastForm: EasyFastForm

    private var mContext: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionnaire)

        this.my_contiener = findViewById(R.id.rv_qies)

        this.initializeForm()

    }

    fun initializeForm() {
        easyFastForm = BuildForm(mContext = this) {
            mode = uiMode.auto
            container = my_contiener

            Body {
                Section {
                    title = "Restaurant Feedback"
                    description = "Please provide your feedback about the restaurant"

                    Content {
                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "SERVICE_QUALITY"
                            setText.title = "Service Quality"
                            setText.descriptionBottom = "Rate the quality of service provided"
                            setSize.title = 14f
                            setting.rowSingleCheck.activeIconSuccess = false
                            checkList {
                                option { text = "Poor" }
                                option { text = "Fair" }
                                option { text = "Good" }
                                option { text = "Very Good" }
                                option { text = "Excellent" }
                            }
                            setValidation.validationOn = true // Enable validation
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "FOOD_QUALITY"
                            setText.title = "Food Quality"
                            setText.descriptionBottom = "Rate the quality of food served"
                            setSize.title = 14f
                            setting.rowSingleCheck.activeIconSuccess = false
                            checkList {
                                option { text = "Poor" }
                                option { text = "Fair" }
                                option { text = "Good" }
                                option { text = "Very Good" }
                                option { text = "Excellent" }
                            }
                            setValidation.validationOn = true // Enable validation
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "CLEANLINESS"
                            setText.title = "Cleanliness"
                            setText.descriptionBottom = "Rate the cleanliness of the restaurant"
                            setSize.title = 14f
                            setting.rowSingleCheck.activeIconSuccess = false
                            checkList {
                                option { text = "Poor" }
                                option { text = "Fair" }
                                option { text = "Good" }
                                option { text = "Very Good" }
                                option { text = "Excellent" }
                            }
                            setValidation.validationOn = true // Enable validation
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "VALUE_FOR_MONEY"
                            setText.title = "Value for Money"
                            setText.descriptionBottom = "Rate the value for money of the meals"
                            setSize.title = 14f
                            setting.rowSingleCheck.activeIconSuccess = false
                            checkList {
                                option { text = "Poor" }
                                option { text = "Fair" }
                                option { text = "Good" }
                                option { text = "Very Good" }
                                option { text = "Excellent" }
                            }
                            setValidation.validationOn = true // Enable validation
                        }

                        Row(RType.EDIT_TEXT) {
                            tag = "COMMENTS"
                            setText.title = "Additional Comments"
                            setText.edtHint = "Enter your comments here"
                            setEditText.maxLength = 10
                        }

                        Row(RType.SWITCH) {
                            tag = "WILL_RETURN"
                            setText.title = "Will You Return?"
                            setText.descriptionBottom = "Would you consider visiting this restaurant again?"
                            setSwitch.active = false
                        }
                    }
                }
            }
        }
    }



    override fun actionFormResponse(result: ResponseFormsIGB) {
        // Handle form responses here

        if(result.type == ListDynamic.TypeRow.ROW_SINGLE_CHECK_LIST && result.tag == "SERVICE_QUALITY"){

            val foodPreferences = easyFastForm.tool.getResultByTag("SERVICE_QUALITY").options.first { it.check }.text

            // Process the user's responses
            val message = "Food preferences: $foodPreferences"

            showToast(message)

        }

    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}