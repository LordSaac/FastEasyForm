package com.creativity.dev.formsimpleigb

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.InputType
import android.util.Patterns
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.BuildForm
import com.creativity.dev.formsimple.Row
import com.creativity.dev.formsimple.Section
import com.creativity.dev.formsimple.interfaces.FormsListenerIGB
import com.creativity.dev.formsimple.model.ResponseFormsIGB
import com.creativity.dev.formsimple.option
import com.creativity.dev.formsimple.types.RType
import com.creativity.dev.formsimple.types.uiMode
import com.example.dreamteach.listselectdinamic.IGBDynamicList.EasyFastForm

class MainActivity : AppCompatActivity(), FormsListenerIGB {

    private lateinit var my_contiener: RecyclerView // Add RecyclerView into xml

    private lateinit var easyFastForm: EasyFastForm

    private var mContext: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.my_contiener = findViewById(R.id.rv_main)

        this.init()

    }

    fun Validate(){

        //easyFastForm.tool.validateByTag("correoElectronico")

        easyFastForm.tool.validateAll()

    }

    fun init(){

        this.easyFastForm = BuildForm(mContext = this) {

            mode = uiMode.auto

            container = my_contiener

            Body {

                Section {

                    title = "Survey"

                    description = "Resolve the simple question."

                    Content {

                        Row(RType.MULTIPLE_CHECK_LIST) {
                            tag = "Cinema_Request"
                            setText.title = "Cinema request"
                            setText.descriptionBottom = "Make this request for knowledge  your level satisfaction."
                            setText.titleToolbar = "Atras"
                            setSize.title = 14f
                            setVisibility.activeBtnCheck = false
                            setVisibility.btnFinishSelect = true
                            setColor.backgroundToolbar = Color.BLACK
                           // setColor.btnFinishSelect = R.color.colorRed
                            setColor.titleToolbar = R.color.colorWhite
                            checkList {
                                option {
                                    text = "1- Good"
                                    setImage.customIconResId = R.drawable.good
                                }
                                option {
                                    text = "2- Regular"
                                    setImage.customIconResId = R.drawable.normal
                                }
                                option {
                                    text = "3- Poor quality"
                                    setImage.customIconResId = R.drawable.bad
                                }

                            }
                            setValidation.validationOn = true
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "CALIDAD_PROYECCIONES"
                            setText.title = "Airbnb request"
                            setText.descriptionBottom =
                                "Make this request for knowledge  your level satisfaction."
                            setSize.title = 14f
                            checkList {
                                option { text = "1 - Poor quality" }
                                option { text = "2 - Regular" }
                                option { text = "3 - Acceptable" }
                                option { text = "4 - Good" }
                                option { text = "5 - Excellent quality" }
                            }
                            setValidation.validationOn = true // Habilitar validación
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "CALIDAD_PROYECCIONES"
                            setText.title = "Supermarket request"
                            setText.descriptionBottom = "Hey select any option"
                            setSize.title = 14f
                            setting.rowSingleCheck.activeIconSuccess = false
                            checkList {
                                option { text = "1 - Poor quality" }
                                option { text = "2 - Regular" }
                                option { text = "3 - Acceptable" }
                                option { text = "4 - Good" }
                                option { text = "5 - Excellent quality" }
                            }

                            setValidation.validationOn = true // Habilitar validación

                        }

                        Row(RType.ACTION) {
                            tag = "More"
                            setText.title = "Restaurant questionnaire"
                            setText.descriptionBottom = "Complete this questionnaire for learn more about this library."
                            setSize.title = 14f

                            onClick {

                                val intent = Intent(mContext, QuestionnaireActivity::class.java)
                                startActivity(intent)

                                easyFastForm.tool.finishProgressView(tag)

                            }

                        }

                    }

                }

                Section {

                    title = "Configuration Settings"

                    description = "Config your configuration setting"

                    Content {

                        Row(RType.ACTION) {
                            tag = "FRECUENCIA_VISITA"
                            setText.title = "Sounds & Others"
                            setText.descriptionBottom = "Configuration your sounds & rintongs settings"
                            setText.bubble = "1"
                            setImage.iconLeft = R.drawable.sound_color
                            setText.titleToolbar = "Atras"
                            setSize.title = 14f

                            onClick {

                                val intent = Intent(mContext, SoundConfigActivity::class.java)

                                startActivity(intent)

                            }

                        }

                        Row(RType.ACTION) {

                            tag = "GAME_SETTING"
                            setText.title = "Game Setting"
                            setText.descriptionBottom = "Configuration your games settings"
                            setImage.iconLeft = R.drawable.controler_color
                            setSize.title = 14f

                            onClick {

                                easyFastForm.tool.startProgressView(tag)

                                Handler(Looper.getMainLooper()).postDelayed({
                                    // Your task to be executed after the delay
                                    val intent = Intent(mContext, GameSettingActivity::class.java)
                                    startActivity(intent)

                                    easyFastForm.tool.finishProgressView(tag)

                                }, 3000) // 3000 milliseconds = 3 seconds


                            }

                        }

                        Row(RType.ACTION) {
                            tag = "FRECUENCIA_VISITA"
                            setText.title = "Notifications"
                            setText.descriptionBottom = "Configuration your favorite ringtone settings"
                            setImage.iconLeft = R.drawable.bell_color
                            setSize.title = 14f

                            onClick {

                                val intent = Intent(mContext, NotificationConfigActivity::class.java)
                                startActivity(intent)


                            }
                        }


                    }

                }

                Section {

                    title = "Personal Information"

                    description = "Here you can input your personal information"

                    Content {

                        Row(RType.EDIT_TEXT) {
                            setText.title = "Full Name"
                            setText.text = "José Isaac Gutiérrez Banda"
                            setText.edtHint = "Insert full name"
                            setImage.iconLeft = R.drawable.user_color
                            tag = "fullname"
                            setValidation.validationOn = true
                        }

                        Row(RType.EDIT_TEXT) {

                            tag = "correoElectronico"
                            setText.title = "Email"
                            setText.edtHint = "Insert your email"
                            setText.errorMessages = "Please insert your email"
                            setImage.iconLeft = R.drawable.email_color
                            setEditText.inputTypeEditText = InputType.TYPE_TEXT_VARIATION_EMAIL_SUBJECT
                            setValidation.validationOn = true
                            setValidation.rulePattern = Patterns.EMAIL_ADDRESS.toString()

                        }

                        Row(RType.DATE_PICKER) {
                            tag = "Select Birthday"
                            setText.title = "Birthday"
                            setDatePicker.format = "dd/MM/yyyy"
                            setText.descriptionBottom = "12/01/2024"
                            setValidation.validationOn = true
                            setImage.iconLeft = R.drawable.calendar_color
                            setSize.title = 14f
                        }

                        Row(RType.TIME_PICKER) {
                            tag = "Select Time"
                            setText.title = "Check In"
                            setTimePicker.format = "hh:mm a"
                            setTimePicker.is24HourFormat = false
                            setImage.iconLeft = R.drawable.calendar_timer
                            setSize.title = 14f
                            setValidation.validationOn = true
                            setText.errorMessages = "Please insert check in"
                        }

                        Row(RType.SWITCH) {
                            setText.title = "Terms & Conditions"
                            setText.descriptionBottom = "Are you agree with our terms?"
                            setText.edtHint = "Insert your email"
                            setImage.iconLeft = R.drawable.contract_file
                            setSwitch.active = false
                            setSwitch.color.thumbTintList = ContextCompat.getColor(applicationContext, R.color.colorBambito)
                            //setSwitch.color.trackTintList = ContextCompat.getColor(applicationContext, R.color.colorWhite)

                            tag = "correoElectronico"
                        }

                    }

                }

                Section {


                    Content {

                        Row(RType.ON_CLICK) {

                            setText.title = "Validate Form"
                            setColor.title = Color.RED
                            setAlignment.text = View.TEXT_ALIGNMENT_CENTER

                            onClick {

                                Validate()

                            }
                        }

                    }

                }

                Section {

                    title = "About Project"

                    description = "This library was created with love "

                    Content {

                        Row(RType.INFO) {
                            setText.title = "Developer"
                            setText.text = "JIGB-K"
                        }

                        Row(RType.INFO) {
                            setText.title = "Software Name"
                            setText.text = "Fast & Easy Form Plus"
                        }

                        Row(RType.INFO) {

                            setText.title = "Version"

                            setText.text = "v2.0.1"

                        }

                    }

                }

                Section {

                    title = "Contribution & Website"

                    description = "Thank you for use this library on your project"

                    Content {

                        Row(RType.ON_CLICK) {

                            setText.title = "Project Contribution"

                            setColor.title = ContextCompat.getColor(applicationContext, R.color.colorYellow)

                            setImage.iconLeft = R.drawable.coffee_cup

                            setText.descriptionBottom = "With you collaboration this project could grow more with improvements and new idea."

                            onClick {
                                val url = "https://www.paypal.com/paypalme/LordSaac?locale.x=es_XC" // Aquí debes poner el enlace real del sitio web del cine
                                val intent = Intent(Intent.ACTION_VIEW)
                                intent.data = Uri.parse(url)
                                startActivity(intent)
                            }
                        }

                        Row(RType.ON_CLICK) {

                            setText.title = "Personal WebSite"
                            setText.descriptionBottom = "I’m a Full Stack Developer with experiences in design, develop and maintenance from web and mobiles apps."
                            setImage.iconLeft = R.drawable.blogger
                            setColor.title = ContextCompat.getColor(applicationContext, R.color.colorRed)

                            onClick {
                                val url = "https://blog-jgutierrez.web.app/" // Aquí debes poner el enlace real del sitio web del cine
                                val intent = Intent(Intent.ACTION_VIEW)
                                intent.data = Uri.parse(url)
                                startActivity(intent)
                            }
                        }



                    }

                }

            }

        }

    }

    override fun actionFormResponse(result: ResponseFormsIGB) {

        // Manejar la respuesta del formulario si es necesario
        // Por ejemplo, puedes obtener los resultados aquí
        val frecuenciaVisita = easyFastForm.tool.getResultByTag("FRECUENCIA_VISITA")

        if(frecuenciaVisita.options.count { select -> select.check } > 0){

            easyFastForm.tool.updateRow("FRECUENCIA_VISITA",frecuenciaVisita)

        }
        // Puedes procesar los resultados aquí según tus necesidades
    }

}
