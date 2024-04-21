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

class NotificationConfigActivity : AppCompatActivity(), FormsListenerIGB {

    private lateinit var my_contiener: RecyclerView // Add RecyclerView into xml

    private lateinit var easyFastForm: EasyFastForm

    private var mContext: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_config)

        this.my_contiener = findViewById(R.id.rv_notification)

        this.initializeNotificationSettingsForm()

    }

    fun initializeNotificationSettingsForm() {
        easyFastForm = BuildForm(mContext = this) {

            mode = uiMode.auto

            container = my_contiener

            Body {

                Section {

                    title = "Notification Settings"

                    description = "Customize your notification preferences"

                    Content {

                        Row(RType.SWITCH) {
                            tag = "AllowNotifications"
                            setText.title = "Allow Notifications"
                            setText.descriptionBottom = "Enable or disable all notifications"
                            setSize.title = 16f
                            setSwitch.active = false
                        }

                        Row(RType.SWITCH) {
                            tag = "ShowPreviews"
                            setText.title = "Show Previews"
                            setText.descriptionBottom = "Choose when to show notification previews"
                            setSize.title = 16f
                            setSwitch.active = false
                        }

                        Row(RType.SWITCH) {
                            tag = "NotificationSound"
                            setText.title = "Notification Sound"
                            setText.descriptionBottom = "Choose the sound for notifications"
                            setSize.title = 16f
                            setSwitch.active = false
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "NotificationStyle"
                            setText.title = "Notification Style"
                            setText.descriptionBottom = "Choose the style for notifications"
                            setSize.title = 16f
                            checkList {
                                option { text = "Banners" }
                                option { text = "Alerts" }
                                option { text = "None" }
                            }
                            setValidation.validationOn = true
                            setting.rowSingleCheck.activeIconSuccess = false
                        }

                        Row(RType.SINGLE_CHECK_LIST) {
                            tag = "NotificationGrouping"
                            setText.title = "Notification Grouping"
                            setText.descriptionBottom = "Choose how to group notifications"
                            setSize.title = 16f
                            checkList {
                                option { text = "Automatic" }
                                option { text = "By App" }
                                option { text = "Off" }
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



    }

}