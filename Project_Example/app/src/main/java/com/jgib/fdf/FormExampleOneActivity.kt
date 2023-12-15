package com.jgib.fdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.ResponseFormsIGB
import com.creativity.dev.formsimple.option
import com.creativity.dev.formsimple.types.ROW_CHECK
import com.creativity.dev.formsimple.types.ROW_INFO
import com.creativity.dev.formsimple.types.ROW_MULTIPLE_CHECK_LIST
import com.creativity.dev.formsimple.types.ROW_SINGLE_CHECK_LIST
import com.creativity.dev.formsimple.types.ROW_TITLE
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyForm

class FormExampleOneActivity : AppCompatActivity(), FormsListenerIGB {

    private lateinit var rv_main: RecyclerView // Add RecyclerView into xml
    private val context = this
    private lateinit var easyForm: EasyForm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_example_one)

        this.easyForm = EasyForm(this)

        this.rv_main = findViewById(R.id.rv_one)

        this.init()
    }

    private fun init(){

        /* Build here */
        Row(ROW_TITLE){ // <--- Add Title

            setText.title = "Cinema" //<--- add your title name
            setColor.title = ContextCompat.getColor(context, R.color.black) // <--- Add any colors for title
            setSize.title = 24.0f
        }

        // Question 1: Favorite movie genre
        Row(ROW_SINGLE_CHECK_LIST) {
            setText.title = "Favorite movie genre"
            tag = "favoriteGenre"

            checkList {
                option { text = "Action" }
                option { text = "Comedy" }
                option { text = "Drama" }
                option { text = "Science fiction" }
                option { text = "Animation" }
                option { text = "Adventure" }
            }

            validation = true
        }

        // Question 2: Do you prefer watching movies in 3D?
        Row(ROW_CHECK) {
            setText.text = "Do you prefer watching movies in 3D?"
            tag = "3DPreference"
        }

        // Question 3: How often do you visit the cinema?
        Row(ROW_SINGLE_CHECK_LIST) {
            setText.title = "Frequency of cinema visits"
            tag = "cinemaFrequency"

            checkList {
                option { text = "Once a month" }
                option { text = "Multiple times a month" }
                option { text = "Occasionally" }
                option { text = "Rarely" }
                option { text = "Never" }
            }

            validation = true
        }

        // Question 4: What snacks do you prefer during movies?
        Row(ROW_MULTIPLE_CHECK_LIST) {
            setText.title = "Preferred snacks during movies"
            tag = "preferredSnacks"

            checkList {
                option { text = "Popcorn" }
                option { text = "Sodas" }
                option { text = "Nachos" }
                option { text = "Candies" }
                option { text = "Ice cream" }
                option { text = "Other options" }
            }

            validation = true
        }

        // Question 5: What aspects do you value the most when choosing a movie?
        Row(ROW_MULTIPLE_CHECK_LIST) {
            setText.title = "Most valued aspects when choosing a movie"
            tag = "valuedAspects"

            checkList {
                option { text = "Storyline" }
                option { text = "Actors' performance" }
                option { text = "Special effects" }
                option { text = "Direction" }
                option { text = "Soundtrack" }
                option { text = "Other options" }
            }

            validation = true
        }

        easyForm.start(rv_main)

    }

    override fun actionFormResponse(result: ResponseFormsIGB) {

    }

}