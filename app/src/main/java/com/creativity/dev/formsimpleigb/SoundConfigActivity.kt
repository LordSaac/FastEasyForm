package com.creativity.dev.formsimpleigb

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

class SoundConfigActivity : AppCompatActivity(), FormsListenerIGB {

    private lateinit var my_contiener: RecyclerView // Add RecyclerView into xml

    private lateinit var easyFastForm: EasyFastForm

    private var mContext: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sound_config)

        this.my_contiener = findViewById(R.id.rv_sounds)

        this.initializeSoundSettingsForm()

    }

    fun initializeSoundSettingsForm() {
        easyFastForm = BuildForm(mContext = this) {

            mode = uiMode.auto

            container = my_contiener

            Body {

                Section {

                    title = "Sound Settings"

                    description = "Configure your sound preferences"

                    Content {

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "Ringtone"
                            setText.title = "Ringtone"
                            setText.descriptionBottom = "Select your phone's ringtone"
                            setSize.title = 16f
                            checkList {
                                option { text = "Ringtone 1" }
                                option { text = "Ringtone 2" }
                                option { text = "Ringtone 3" }
                                option { text = "Ringtone 4" }
                                option { text = "Ringtone 5" }
                                // Add more options as needed
                            }
                            setValidation.validationOn = true
                            setting.rowSingleCheck.activeIconSuccess = false
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "NotificationSound"
                            setText.title = "Notification Sound"
                            setText.descriptionBottom = "Select notification sound"
                            setSize.title = 16f
                            checkList {
                                option { text = "Notification Sound 1" }
                                option { text = "Notification Sound 2" }
                                option { text = "Notification Sound 3" }
                                option { text = "Notification Sound 4" }
                                option { text = "Notification Sound 5" }
                                // Add more options as needed
                            }
                            setValidation.validationOn = true
                            setting.rowSingleCheck.activeIconSuccess = false
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "AlarmSound"
                            setText.title = "Alarm Sound"
                            setText.descriptionBottom = "Select alarm sound"
                            setSize.title = 16f
                            checkList {
                                option { text = "Alarm Sound 1" }
                                option { text = "Alarm Sound 2" }
                                option { text = "Alarm Sound 3" }
                                option { text = "Alarm Sound 4" }
                                option { text = "Alarm Sound 5" }
                                // Add more options as needed
                            }
                            setValidation.validationOn = true
                            setting.rowSingleCheck.activeIconSuccess = false
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "SystemSound"
                            setText.title = "System Sound"
                            setText.descriptionBottom = "Select system sound"
                            setSize.title = 16f
                            checkList {
                                option { text = "System Sound 1" }
                                option { text = "System Sound 2" }
                                option { text = "System Sound 3" }
                                option { text = "System Sound 4" }
                                option { text = "System Sound 5" }
                                // Add more options as needed
                            }
                            setValidation.validationOn = true
                            setting.rowSingleCheck.activeIconSuccess = false
                        }

                        Row(RType.SWITCH) {
                            tag = "Vibration"
                            setText.title = "Vibration"
                            setText.descriptionBottom = "Enable or disable vibration"
                            setSize.title = 16f
                            setSwitch.active = false
                        }

                        Row(RType.SWITCH) {
                            tag = "SilentMode"
                            setText.title = "Silent Mode"
                            setText.descriptionBottom = "Enable or disable silent mode"
                            setSize.title = 16f
                            setSwitch.active = false
                        }

                        Row(RType.SWITCH) {
                            tag = "DoNotDisturb"
                            setText.title = "Do Not Disturb"
                            setText.descriptionBottom = "Enable or disable do not disturb mode"
                            setSize.title = 16f
                            setSwitch.active = false
                        }

                    }
                }
            }
        }
    }



    override fun actionFormResponse(result: ResponseFormsIGB) {

    }
}