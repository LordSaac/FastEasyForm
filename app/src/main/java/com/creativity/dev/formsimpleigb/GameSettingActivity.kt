package com.creativity.dev.formsimpleigb

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

class GameSettingActivity : AppCompatActivity(), FormsListenerIGB {

    private lateinit var my_contiener: RecyclerView // Add RecyclerView into xml

    private lateinit var easyFastForm: EasyFastForm

    private var mContext: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_setting)

        this.my_contiener = findViewById(R.id.rv_game_mode)

        this.initializeGameSettingsForm()

    }

    fun initializeGameSettingsForm() {
        easyFastForm = BuildForm(mContext = this) {

            mode = uiMode.auto

            container = my_contiener

            Body {

                Section {

                    title = "Game Settings"

                    description = "Configure your game preferences"

                    Content {

                        Row(RType.SWITCH) {
                            tag = "BackgroundMusic"
                            setText.title = "Background Music"
                            setText.descriptionBottom = "Enable background music"
                            setImage.iconLeft = R.drawable.sound_color
                            setSize.title = 16f
                            setSwitch.active = true

                        }

                        Row(RType.SWITCH) {
                            tag = "SoundEffects"
                            setText.title = "Sound Effects"
                            setText.descriptionBottom = "Enable sound effects"
                            setImage.iconLeft = R.drawable.bell_color
                            setSize.title = 16f
                            setSwitch.active = false
                        }

                        Row(RType.SWITCH) {
                            tag = "Vibration"
                            setText.title = "Vibration"
                            setText.descriptionBottom = "Enable vibration feedback"
                            setImage.iconLeft = R.drawable.vibration_icon
                            setSize.title = 16f
                            setSwitch.active = false
                        }

                        Row(RType.SWITCH) {
                            tag = "HDGraphics"
                            setText.title = "HD Graphics"
                            setText.descriptionBottom = "Enable high definition graphics"
                            setImage.iconLeft = R.drawable.hd_graphics_icon
                            setSize.title = 16f
                            setSwitch.active = false
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "ControlScheme"
                            setText.title = "Control Scheme"
                            setText.descriptionBottom = "Select your preferred scheme"
                            setSize.title = 16f
                            checkList {
                                option {
                                    text = "Touch Controls"
                                    check = true
                                }
                                option { text = "Gyroscopic Controls" }
                                option { text = "Gamepad Controls" }
                            }
                            setValidation.validationOn = true
                            setting.rowSingleCheck.activeIconSuccess = false
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "DifficultyLevel"
                            setText.title = "Difficulty Level"
                            setText.descriptionBottom = "Select the game difficulty level"
                            setSize.title = 16f
                            checkList {
                                option {
                                    text = "Easy"
                                    check = true
                                }
                                option { text = "Normal" }
                                option { text = "Hard" }
                                option { text = "Extreme" }
                            }
                            setValidation.validationOn = true
                            setting.rowSingleCheck.activeIconSuccess = false
                        }

                    }
                }
            }
        }
    }

    override fun actionFormResponse(result: ResponseFormsIGB) {

        if(result.type == ListDynamic.TypeRow.ROW_SWITCH){

            // Process the user's responses
            val message = "Switch to: ${result.swtichActive}"

            showToast(message)

        }

    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}