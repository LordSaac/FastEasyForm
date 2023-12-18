package com.jgib.fdf

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.InputType
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.compose.EasyFormCompose
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.ResponseFormsIGB
import com.creativity.dev.formsimple.option
import com.creativity.dev.formsimple.types.ROW_ACTIVITY
import com.creativity.dev.formsimple.types.ROW_CHECK
import com.creativity.dev.formsimple.types.ROW_EDIT
import com.creativity.dev.formsimple.types.ROW_INFO
import com.creativity.dev.formsimple.types.ROW_MULTIPLE_CHECK_LIST
import com.creativity.dev.formsimple.types.ROW_ON_CLICK
import com.creativity.dev.formsimple.types.ROW_SINGLE_CHECK_LIST
import com.creativity.dev.formsimple.types.ROW_TITLE
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyForm
import com.jgib.fdf.ui.theme.FormExampleAppTheme

const val tagSex:String = "c098975e-f6ce-4e44-bdc7-b11ecdb0d234"
const val tagFoodList:String = "2403020e-82dc-4e31-8008-67263069ec1e"
const val tagEditAge:String = "35c090b2-cf81-43c9-8912-d438e47dc80e"
const val tagCheck:String = "494a468f-286e-492b-897f-e238c37fd8f3"

class MainActivity : ComponentActivity(),FormsListenerIGB {

    private val context = this

    private lateinit var easyForm: EasyForm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.easyForm = EasyForm(this)

        setContent {
            FormExampleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeScreen(context,easyForm)
                }
            }
        }
    }

    override fun actionFormResponse(result: ResponseFormsIGB) {

        if(result.tag == "like007"){

            if(result.checked){

                val builder: AlertDialog.Builder = AlertDialog.Builder(context)
                builder
                    .setMessage("If you like this library, are can collaborate with a like or a coffee ☕️  \uD83D\uDE0C")
                    .setTitle("Thanks bro!")

                val dialog: AlertDialog = builder.create()
                dialog.show()

            }


        }

    }
}

@Composable
fun ComposeScreen(context: Context, customForm: EasyForm) {

    EasyFormCompose(
        customForm = customForm,
        modifier = Modifier.fillMaxWidth(),
        rows = {

            Row(ROW_TITLE){ // <--- Add Title

                setText.title = "Example Forms" //<--- add your title name
                setColor.title = ContextCompat.getColor(context, R.color.black) // <--- Add any colors for title
                setSize.title = 22.0f
            }

            Row(ROW_ACTIVITY){ // <-- Here Call Any activity
                setText.title = "Cinema Request"//<-- title .
                activity = FormExampleOneActivity::class.java // <-- Add your activity
            }

            Row(ROW_ACTIVITY){
                setText.title = "Restaurant Request"//<-- title .
                activity = FormExampleTwoActivity::class.java // <-- Add your activity

            }

            Row(ROW_ACTIVITY){
                setText.title = "Personal Request"//<-- title .
                activity = FormExampleThreeActivity::class.java // <-- Add your activity

            }

            Row(ROW_TITLE){

                setText.title = "Food List"
                setSize.title = 22.0f
                setColor.title = ContextCompat.getColor(context, R.color.black)

            }

            Row(ROW_MULTIPLE_CHECK_LIST){

                setText.title = "Personal menu" // Add title

                checkList {
                    option { text = "Salad" }
                    option { text = "Meat" }
                    option { text = "Fruit" }
                    option { text = "Vagetable" }
                }

               setColor.backgroundToolbar  = ContextCompat.getColor(context, R.color.black) // // Add color in the toolbar (OPTIONAL but RECOMENDABLE)

            }

            Row(ROW_MULTIPLE_CHECK_LIST){
                tag = tagFoodList // <---  tag for identification of the row
                setText.title = "Main menu"   // <---  Your title
                // Personalize your message empty
                setText.emptyMessages = "No encontre nada tio!" // Your message for empty list (OPTIONAL)
                setImage.warning = R.drawable.ic_launcher_background   // Add an image for empty list (OPTIONAL)

                setColor.backgroundToolbar = ContextCompat.getColor(context, R.color.black) // Add color in the toolbar (OPTIONAL but RECOMENDABLE)
            }

            Row(ROW_TITLE){

                setText.title = "Questions"
                setSize.title = 22.0f
                setColor.title = ContextCompat.getColor(context, R.color.black)

            }

            Row(ROW_CHECK){

                setText.text= "Do you like job?" // Add text for the text
                tag = tagCheck //tag for identification of the row
                checked = false // Initialize check in false or true

            }

            Row(ROW_CHECK){

                setText.text= "Are you like this librery?" // Add text fot he text
                checked = false // Initialize check in false or true
                tag = "like007"

            }

            Row(ROW_CHECK){

                setText.text= "Is really easy?" // Add text fot he text
                checked = true  // Initialize check in false or true

            }

            Row(ROW_TITLE){
                setText.title = "Personal Information"
                setSize.title = 22.0f
                setColor.title = ContextCompat.getColor(context, R.color.black)
            }

            Row(ROW_EDIT){

                setText.title = "Email"// title row.
                setText.text= "jose19.26@outlook.com"// short description.
                inputTypeEditText = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS //  To choose type EDITTEXT (https://developer.android.com/reference/android/widget/EditText)

            }

            Row(ROW_EDIT){
                setText.title = "Firts Name" // Add only text, but the text edit type is default
            }

            Row(ROW_EDIT){

                setText.title = "Lastname" // Add only text, but the text edit type is default
                ///  emptyMessages = "Please insert lastname"
                validation = true  // Add it is you want validate this row

            }

            Row(ROW_EDIT){

                setText.title = "Phone"// title row.
                inputTypeEditText = InputType.TYPE_CLASS_PHONE //  To choose type EDITTEXT (https://developer.android.com/reference/android/widget/EditText)
            }

            Row(ROW_EDIT){

                tag =  tagEditAge
                setText.title = "Age"
                maxLength = 2
                inputTypeEditText = InputType.TYPE_CLASS_NUMBER
                //emptyMessages = "00"
                validation = true

            }

            Row(ROW_TITLE){

                setText.title = "Fast & easy form"
                setSize.title = 22.0f
                setAlignment.text = View.TEXT_ALIGNMENT_TEXT_END
                setColor.title = ContextCompat.getColor(context, R.color.black)

            }

            Row(ROW_INFO){
                setText.title = "Create by"// title row.
                setText.text= "José I. Gutièrrez B."
            }

            Row(ROW_INFO){
                setText.title = "Occupation"// title row.
                setText.text= "Software Engineer"
            }


            Row(ROW_INFO){

                setText.title = "Version"// title row.
                validation = true
                setText.text= "v0.3.5"

            }

            Row(ROW_INFO){

                setText.title = "Release date"// title row.
                setText.text= "December 26, 2018"
                validation = true

            }

            Row(ROW_INFO){
                setText.title = "Licence"// title row.
                setText.text= "Copyright 2024 JIGB"
            }

            Row(ROW_ON_CLICK) {
                setText.title = "Personal Web Site"
                setText.text = "Touch Me!"
                setVisibility.description = View.VISIBLE

                onClick {
                    val url = "https://blog-jgutierrez.web.app/"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)
                }
            }

            Row(ROW_ON_CLICK) {

                setText.title = "Collaboration"
                setText.text = " Touch here!"
                setVisibility.description = View.VISIBLE

                onClick {
                    val url = "https://www.paypal.com/paypalme/LordSaac?locale.x=es_XC"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)
                }
            }


        }
    )

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FormExampleAppTheme {
        Greeting("Android")
    }
}