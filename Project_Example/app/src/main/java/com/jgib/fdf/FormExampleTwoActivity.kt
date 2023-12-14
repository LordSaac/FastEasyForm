package com.jgib.fdf

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.ResponseFormsIGB
import com.creativity.dev.formsimple.option
import com.creativity.dev.formsimple.types.ROW_CHECK
import com.creativity.dev.formsimple.types.ROW_MULTIPLE_CHECK_LIST
import com.creativity.dev.formsimple.types.ROW_SINGLE_CHECK_LIST
import com.creativity.dev.formsimple.types.ROW_TITLE
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyForm

class FormExampleTwoActivity : AppCompatActivity(), FormsListenerIGB {

    private lateinit var rv_main: RecyclerView // Add RecyclerView into xml
    private val context = this
    private lateinit var easyForm: EasyForm

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_example_two)

        this.easyForm = EasyForm(this)

        this.rv_main = findViewById(R.id.rv_two)

        this.init()

    }

    private fun init() {
        easyForm.apply {

            Row(ROW_TITLE){ // <--- Add Title

                setText.title = "Restaurant" //<--- add your title name
                setSize.title = 24.0f
                setColor.title = ContextCompat.getColor(context, R.color.black) // <--- Add any colors for title
            }

            // Question 1: Favorite cuisine type
            Row(ROW_SINGLE_CHECK_LIST) {
                setText.title = "Favorite cuisine type"
                setText.tag = "favoriteCuisine"

                checkList {
                    option { text = "Italian" }
                    option { text = "Mexican" }
                    option { text = "Asian" }
                    option { text = "American" }
                    option { text = "Mediterranean" }
                    option { text = "Other options" }
                }

                validation = true
            }

            // Question 2: Do you prefer vegetarian/vegan options?
            Row(ROW_CHECK) {
                setText.text = "Do you prefer vegetarian/vegan options?"
                setText.tag = "vegetarianPreference"
            }

            // Question 3: How often do you dine out?
            Row(ROW_SINGLE_CHECK_LIST) {
                setText.title = "Frequency of dining out"
                setText.tag = "diningFrequency"

                checkList {
                    option { text = "Once a week" }
                    option { text = "Multiple times a week" }
                    option { text = "Occasionally" }
                    option { text = "Rarely" }
                    option { text = "Never" }
                }

                validation = true
            }

            // Question 4: Preferred dining atmosphere
            Row(ROW_SINGLE_CHECK_LIST) {
                setText.title = "Preferred dining atmosphere"
                setText.tag = "diningAtmosphere"

                checkList {
                    option { text = "Casual" }
                    option { text = "Fine dining" }
                    option { text = "Outdoor seating" }
                    option { text = "Family-friendly" }
                    option { text = "Other options" }
                }

                validation = true
            }

            // Question 5: What factors matter most when choosing a restaurant?
            Row(ROW_MULTIPLE_CHECK_LIST) {
                setText.title = "Factors when choosing a restaurant"
                setText.tag = "restaurantFactors"

                checkList {
                    option { text = "Food quality" }
                    option { text = "Service" }
                    option { text = "Ambiance" }
                    option { text = "Location" }
                    option { text = "Price" }
                    option { text = "Other options" }
                }

                validation = true
            }

            start(rv_main)
        }
    }

    override fun actionFormResponse(result: ResponseFormsIGB) {

    }

}